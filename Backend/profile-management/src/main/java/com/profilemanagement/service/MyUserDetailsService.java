package com.profilemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.profilemanagement.Repository.UserRepository;
import com.profilemanagement.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if(user != null) {
            GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
            return new User(user.getUsername(), user.getPassword(), Arrays.asList(authority));
        }
        else return new User(username:null,password:null,authorities:null);
    }
}
