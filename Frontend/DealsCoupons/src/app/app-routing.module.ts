import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateCouponComponent } from './create-coupon/create-coupon.component';

const routes: Routes = [
  {path:"create-coupon", component: CreateCouponComponent},
  {path:'', redirectTo: "coupons", pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
