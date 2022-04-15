import { Component, OnInit } from '@angular/core';
import { Coupon } from '../coupon';
import { Router } from '@angular/router';
import {CouponService} from '../coupon.service';

@Component({
  selector: 'app-create-coupon',
  templateUrl: './create-coupon.component.html',
  styleUrls: ['./create-coupon.component.css']
})
export class CreateCouponComponent implements OnInit {

  coupon: Coupon = new Coupon();
  constructor(private couponService: CouponService, private router: Router) { }

  ngOnInit(): void {
  }

  saveCoupon(){
    this.couponService.createCoupon(this.coupon).subscribe(data=>{
      console.log(data);
      this.goToCouponList();
    },
    error=> console.log(error));
  }

  goToCouponList(){
    this.router.navigate(['/coupons']);
  }

  onSubmit(){
    console.log(this.coupon);
    this.saveCoupon();
  }

}
