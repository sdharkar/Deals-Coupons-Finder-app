import { Component, OnInit } from '@angular/core';
import { CouponService } from 'src/app/service/coupon.service';
import { Coupon } from 'src/app/class/coupon';
import { Router } from '@angular/router';

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
