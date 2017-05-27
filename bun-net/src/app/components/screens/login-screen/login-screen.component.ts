import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-screen',
  templateUrl: './login-screen.component.html',
  styleUrls: ['./login-screen.component.css']
})
export class LoginScreenComponent implements OnInit {

  username: string;

  constructor() { }

  ngOnInit() {
    this.username = '';
  }

  login() {
    alert("Logged In" + this.username);
  }
}
