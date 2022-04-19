import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute} from '@angular/router';
import { Coupon } from 'src/app/class/coupon';
import { CouponService } from 'src/app/service/coupon.service';

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent implements OnInit {

  coupons!: Coupon[];
  id !: string;
  coupon: Coupon = new Coupon();

  constructor(private route: ActivatedRoute,private router: Router,private couponService: CouponService) { }

  ngOnInit(): void {
    this.getCoupons();
  }

  private getCoupons(){
    this.couponService.getCouponList().subscribe(data =>{
      this.coupons = data;
    }) 
  }

  updateCoupon(id:string){
    this.router.navigate(["update-coupon",id]);
  }

  deleteCoupon(id: string){

    this.couponService.deleteCoupon(id).subscribe((data: any)=>{
      console.log(data);
      this.getCoupons();
    })
  }

}