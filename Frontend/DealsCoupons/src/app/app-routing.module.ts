import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './component/admin-dashboard/admin-dashboard.component';
import { CartComponent } from './component/cart/cart.component';
import { CouponsComponent } from './component/coupons/coupons.component';
import { CreateCouponComponent } from './component/create-coupon/create-coupon.component';
import { UpdateCouponComponent } from './component/update-coupon/update-coupon.component';

const routes: Routes = [
  {path:'', redirectTo: "coupons", pathMatch:"full"},
  {path:"coupons", component: CouponsComponent},
  {path:"cart", component:CartComponent},
  {path: "create-coupon", component: CreateCouponComponent},
  {path:"admin-dashboard", component: AdminDashboardComponent},
  {path:"update-coupon", component: UpdateCouponComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
