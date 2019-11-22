import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from './login';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  formData:Login;

  constructor(private _httpService : HttpClient) { }

  login(formData:any):Observable<Login>{ 
    return this._httpService.get<Login>(environment.APIUrl +'login/'+ formData.userName+'/'+formData.password);   
  }


/*
  public isLoggedIn(){
    return localStorage.getItem('TOKEN') !== null;
  }

  public logout(){
    localStorage.removeItem('TOKEN');
  }*/


}