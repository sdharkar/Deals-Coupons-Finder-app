import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Coupon } from 'src/app/class/coupon';

@Injectable({
  providedIn: 'root'
})
export class CouponService {

  private baseURL= "http://localhost:8083/coupon";

  constructor(private httpClient: HttpClient) { }

  //get all coupons
  getCouponList(): Observable<Coupon[]>{
    return this.httpClient.get<Coupon[]>(`${this.baseURL}/list`);
  }

  // Add coupon
  createCoupon(coupon: Coupon): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/add`,coupon);
  }

  //get coupon by Id
  getCouponById(id: string): Observable<Coupon>{
    return this.httpClient.get<Coupon>(`localhost:8083/coupon/id/${id}`);
  }

  //update coupon
  updateCoupon(id:string, coupon: Coupon): Observable<Object>{
    return this.httpClient.put(`http://localhost:8000/coupon/update/${id}`,coupon);
  }

  deleteCoupon(id:string): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/delete/${id}`, {responseType: 'text'});
  }


}
