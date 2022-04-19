import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { CartComponent } from './component/cart/cart.component';
import { FooterComponent } from './component/footer/footer.component';
import { CouponsComponent } from './component/coupons/coupons.component';
import {HttpClientModule} from '@angular/common/http';
import { PayComponent } from './payment/pay/pay.component';
import { ReportComponent } from './payment/report/report.component';
import { CreateCouponComponent } from './component/create-coupon/create-coupon.component';
import { FormsModule } from '@angular/forms';
import { AdminDashboardComponent } from './component/admin-dashboard/admin-dashboard.component';
import { UpdateCouponComponent } from './component/update-coupon/update-coupon.component';
import { LoginComponent } from './component/login/login.component';
import { SigninComponent } from './component/signin/signin.component';
import { UserDashboardComponent } from './component/user-dashboard/user-dashboard.component';
import { HomeComponent } from './component/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CartComponent,
    FooterComponent,
    CouponsComponent,
    PayComponent,
    ReportComponent,
    CreateCouponComponent,
    AdminDashboardComponent,
    UpdateCouponComponent,
    LoginComponent,
    SigninComponent,
    UserDashboardComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
