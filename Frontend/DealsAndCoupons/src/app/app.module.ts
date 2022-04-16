import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { SlickCarouselModule } from 'ngx-slick-carousel';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { CouponListComponent } from './coupon-list/coupon-list.component';
import { HttpClientModule } from '@angular/common/http';
import { CreateCouponComponent } from './create-coupon/create-coupon.component';
import { FormsModule } from '@angular/forms';
import { UpdateCouponComponent } from './update-coupon/update-coupon.component';
import { CartComponent } from './component/cart/cart.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    CouponListComponent,
    CreateCouponComponent,
    UpdateCouponComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SlickCarouselModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
