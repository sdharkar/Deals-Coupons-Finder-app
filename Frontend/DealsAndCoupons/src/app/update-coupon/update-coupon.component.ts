import { Component, OnInit } from '@angular/core';
import { Coupon } from '../coupon';
import { CouponService } from '../coupon.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-coupon',
  templateUrl: './update-coupon.component.html',
  styleUrls: ['./update-coupon.component.css']
})
export class UpdateCouponComponent implements OnInit {

  couponId !: string;
  coupon: Coupon = new Coupon();

  constructor(private couponService: CouponService,private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.couponId = this.route.snapshot.params["couponid"];
    this.couponService.getCouponById(this.couponId).subscribe(data=>{
      this.coupon = data;
    }, error => console.log(error));
    
}

onSubmit(){
  this.couponService.updateCoupon(this.couponId, this.coupon).subscribe(data =>{
    this.goToCouponList();
  },
  error => console.log(error));
}

goToCouponList(){
  this.router.navigate(['/coupons']);
}

}
