import { Component, OnInit } from '@angular/core';
import {Coupon} from '../coupon';
import {CouponService} from '../coupon.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-coupon-list',
  templateUrl: './coupon-list.component.html',
  styleUrls: ['./coupon-list.component.css']
})
export class CouponListComponent implements OnInit {

  coupons!: Coupon[];
  couponId !: String;
  coupon: Coupon = new Coupon();

  constructor(private couponService: CouponService, private router: Router) { }

  ngOnInit(): void {
    this.getCoupons();
  }

  private getCoupons(){
    this.couponService.getCouponList().subscribe(data =>{
      this.coupons = data;
    }) 
  }

  updateCoupon(couponId:string){
    this.router.navigate(["update-coupon",couponId]);
  }

  deleteCoupon(couponId: string){

    this.couponService.deleteCoupon(couponId).subscribe((data: any)=>{
      console.log(data);
      this.getCoupons();
    })
  }



}
