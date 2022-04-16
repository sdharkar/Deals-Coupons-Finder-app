import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute} from '@angular/router';
@Component({
  selector: 'app-coupons',
  templateUrl: './coupons.component.html',
  styleUrls: ['./coupons.component.css']
})
export class CouponsComponent implements OnInit {

  constructor(private route: ActivatedRoute,private router: Router) { }

  ngOnInit(): void {
  }

}
