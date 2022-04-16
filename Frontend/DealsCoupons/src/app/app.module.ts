import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { CartComponent } from './component/cart/cart.component';
import { FooterComponent } from './component/footer/footer.component';
import { CouponsComponent } from './component/coupons/coupons.component';
import {HttpClientModule} from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CartComponent,
    FooterComponent,
    CouponsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
