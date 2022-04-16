package com.couponservice.resource;

import java.util.List;
import java.util.Optional;

import com.couponservice.entity.Coupon;
import com.couponservice.service.CouponService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/coupon")
public class CouponController {
	
	@Autowired
	CouponService couponService;

	
	//to add a coupon
	@PostMapping("/coupon")
	public Coupon addCoupon(@RequestBody Coupon deal) {
		Coupon coupon = couponService.save(deal);
		return coupon;
	}

	//find coupon by id
	@GetMapping("/id/{couponId}")
	public Optional<Coupon> searchCouponByCouponId(@PathVariable("couponId") String couponId) {
		Optional<Coupon> coupon = couponService.findByCouponId(couponId);
		return coupon;
	}
	
	//find by category
	@GetMapping("/category/{category}")
	public List<Optional<Coupon>> searchCouponByCategory(@PathVariable("category") String category) {
		List<Optional<Coupon>> coupon = couponService.findByCategory(category);
		return coupon;
	}
	
	//find by company name
	@GetMapping("/company/{companyName}")
	public List<Optional<Coupon>> searchCouponByCompanyName(@PathVariable("companyName") String companyName) {
		List<Optional<Coupon>> coupon = couponService.findByCompanyName(companyName);
		return coupon;
	}

	//delete by coupon id
	@DeleteMapping("/{couponId}")
	public String deleteCouponBycouponId(@PathVariable("couponId") String couponId) {
		String result = couponService.deleteById(couponId);
		return result;
	}
	
	//delete by category
	@DeleteMapping("/delete/category/{category}")
	public String deleteCouponByCategory(@PathVariable("category") String category) {
		String result = couponService.deleteByCategory(category);
		return result;
	}
	
	//delete by company name
	@DeleteMapping("/delete/company/{companyName}")
	public String deleteCouponByCompanyName(@PathVariable("companyName") String companyName) {
		String result = couponService.deleteByCompanyName(companyName);
		return result;
	}

	//to get all the coupon
	@GetMapping("/all")
	public List<Coupon> findCoupon() {
		return (List<Coupon>) couponService.findAll();
	}

	
	//to update by id
	@PutMapping("/update/{couponId}")
	public Coupon updateCoupon(@RequestBody Coupon deal) {
		Coupon coupon = couponService.save(deal);
		return coupon;
	}
}
