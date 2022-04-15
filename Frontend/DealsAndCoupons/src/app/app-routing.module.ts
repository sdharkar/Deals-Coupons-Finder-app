import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CouponListComponent } from './coupon-list/coupon-list.component';
import { CreateCouponComponent } from './create-coupon/create-coupon.component';
import { UpdateCouponComponent } from './update-coupon/update-coupon.component';

const routes: Routes = [
  {path:"coupons", component: CouponListComponent},
  {path:"create-coupon", component: CreateCouponComponent},
  {path:'', redirectTo: "coupons", pathMatch: 'full'},
  {path:'update-coupon/:couponId', component: UpdateCouponComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
