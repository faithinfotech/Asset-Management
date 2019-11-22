import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private service:LoginService,private router:Router) { }

  ngOnInit() {
  }

  logout():void{
    localStorage.removeItem('token')
    this.router.navigateByUrl('');
  }

  asset(){
    this.router.navigateByUrl('/asset');
  }

  vendor(){
    this.router.navigateByUrl('/vendor');
  }

  purchase(){
    this.router.navigateByUrl('/purchase');
  }

  master(){
    this.router.navigateByUrl('/master');
  }
}
