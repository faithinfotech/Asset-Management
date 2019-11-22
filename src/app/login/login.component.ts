import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators, NgForm } from '@angular/forms';
import { Login } from '../login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  user = new Login();
  //loginForm: FormGroup;
  //isSubmitted  =  false;
  constructor(private service: LoginService, private router: Router) { }

  ngOnInit() {
    this.resetForm();

    /*  this.loginForm  =  this.formBuilder.group({
        userName: ['', Validators.required],
        password: ['', Validators.required]
    });*/
  }
  /*
    get formControls() 
    { 
      return this.loginForm.controls;
    }
    */
  /* login(){
     console.log(this.loginForm.value);
     this.isSubmitted = true;
     if(this.loginForm.invalid){
     return ;
     }
     this.service.login(this.loginForm.value);
     this.router.navigateByUrl('/home');
   }*/

  myLogin() {
    this.service.login(this.user)
      .subscribe((response) => {
        console.log(response);
        localStorage.setItem('token','test');
        this.router.navigateByUrl('/home');
        console.log("home page");
        this.resetForm();
      }, (error) => {
        this.resetForm();
        console.log(error);
      });
  }

  resetForm(form?: NgForm) {
    if (!form) {
      this.user.userName = '';
      this.user.password = '';
      this.service.formData = {
        userId: 0,
        userName: null,
        password: null

      }
    }
  }


  /*login(){
    this.service.getLogin(FormData)
    .subscribe((response)=>{
      console.log(response);
   this.router.navigate(['/home']);  
    },(error)=>{
      this.resetForm();
      console.log(error);
    })
  }*/
}
