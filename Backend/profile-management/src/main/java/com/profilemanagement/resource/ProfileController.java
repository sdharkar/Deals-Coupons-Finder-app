package com.profilemanagement.resource;

import java.util.List;

import org.apache.http.HttpStatus;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profilemanagement.Repository.UserRepository;
import com.profilemanagement.model.AuthenticationRequest;
import com.profilemanagement.model.AuthenticationResponse;
import com.profilemanagement.model.User;
import com.profilemanagement.service.MyUserDetailsService;
import com.profilemanagement.service.UserServiceImpl;
import com.profilemanagement.util.JwtUtil;

@RestController
@RequestMapping("/profile")
@CrossOrigin("*")
public class ProfileController {
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserServiceImpl userService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		try {
			String methodName = "(addUser)";
			logger.info(methodName + "Called");
			System.out.println("user");
			UserServiceBeanDefinitionParser.addUser(user);
		}
	}
	
	@GetMapping("/get-user/{username}")
    public ResponseEntity<User> getCustomerByUsername(@PathVariable("username") String username) {
        try {
        	String methodName = "getCustomerByUsername()";
    		logger.info(methodName + "Called");
            User user = userService.findByUsername(username);
            return new ResponseEntity<User>(user,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


	@GetMapping("/get-all-users")
	public ResponseEntity<List<User>> getAllCustomer() {
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/authenticate") // Authenticate a Customer (Existing)
	public ResponseEntity<?> generateToken(@RequestBody AuthenticationRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
			);
		}catch (BadCredentialsException e) {
			throw new Exception("Invalid Username or Password!",e);
		}
		UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getUsername());
		String token = jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthenticationResponse(token));
	}
	
	
	@GetMapping("/current-user")
	public Object getCurrentUser(Authentication authentication){
		return authentication.getPrincipal();
	}

}
