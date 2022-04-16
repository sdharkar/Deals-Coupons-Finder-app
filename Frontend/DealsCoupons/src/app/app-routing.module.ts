import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './component/cart/cart.component';
import { CouponsComponent } from './component/coupons/coupons.component';

const routes: Routes = [
  {path:'', redirectTo: "coupons", pathMatch:"full"},
  {path:"coupons", component: CouponsComponent},
  {path:"cart", component:CartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
