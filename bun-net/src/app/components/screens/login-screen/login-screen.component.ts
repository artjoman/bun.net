import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-screen',
  templateUrl: './login-screen.component.html',
  styleUrls: ['./login-screen.component.css']
})
export class LoginScreenComponent implements OnInit {

  username: string;
  password: string;

  constructor() { }

  ngOnInit() {
    this.username = '';
    this.password = '';
  }

  login() {
    alert("Logged In with username: " + this.username + " password: "+ this.password);
  }
}
