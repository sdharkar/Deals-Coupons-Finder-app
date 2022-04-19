import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './component/admin-dashboard/admin-dashboard.component';
import { CartComponent } from './component/cart/cart.component';
import { CouponsComponent } from './component/coupons/coupons.component';
import { CreateCouponComponent } from './component/create-coupon/create-coupon.component';
import { HomeComponent } from './component/home/home.component';
import { LoginComponent } from './component/login/login.component';
import { SigninComponent } from './component/signin/signin.component';
import { UpdateCouponComponent } from './component/update-coupon/update-coupon.component';
import { UserDashboardComponent } from './component/user-dashboard/user-dashboard.component';
import { PayComponent } from './payment/pay/pay.component';
import { ReportComponent } from './payment/report/report.component';

const routes: Routes = [
  {path:'', redirectTo: "coupons", pathMatch:"full"},
  {path:"coupons", component: CouponsComponent},
  {path:"cart", component:CartComponent},
  {path: "create-coupon", component: CreateCouponComponent},
  {path:"admin-dashboard", component: AdminDashboardComponent},
  {path:"update-coupon", component: UpdateCouponComponent},
  {path:"login", component: LoginComponent},
  {path:"signup", component:SigninComponent},
  {path:"payment", component:PayComponent},
  {path:"payment-report", component:ReportComponent},
  {path:"user-dashboard", component: UserDashboardComponent},
  {path:"home", component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
