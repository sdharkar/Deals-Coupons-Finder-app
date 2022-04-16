import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Coupon} from './coupon';
import { UpdateCouponComponent } from './update-coupon/update-coupon.component';

@Injectable({
  providedIn: 'root'
})
export class CouponService {
  [x: string]: any;
  // getCouponById(couponId: string) {
  //   throw new Error('Method not implemented.');
  // }

  private baseURL= "http://localhost:8000/coupon";

  constructor(private httpClient: HttpClient) { }

  //get all coupons
  getCouponList(): Observable<Coupon[]>{
    return this.httpClient.get<Coupon[]>(`${this.baseURL}/all`);
  }

  // Add coupon
  createCoupon(coupon: Coupon): Observable<Object>{
    return this.httpClient.post(`http://localhost:8083/coupon/coupon`,coupon);
  }

  //get coupon by Id
  getCouponById(couponId: string): Observable<Coupon>{
    return this.httpClient.get<Coupon>(`localhost:8083/coupon/id/${couponId}`);
    //return this.httpClient.get<Coupon>(`${this.baseURL}/id/${couponId}`);
  }

  //update coupon
  updateCoupon(couponId:string, coupon: Coupon): Observable<Object>{
    return this.httpClient.put(`http://localhost:8000/coupon/update/${couponId}`,coupon);
  }

  deleteCoupon(couponId:string): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${couponId}`, {responseType: 'text'});
  }

}
