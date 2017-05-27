import { AppRoutingModule } from './app-routing.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { LoginScreenComponent } from './components/screens/login-screen/login-screen.component';
import { ListScreenComponent } from './components/screens/list-screen/list-screen.component';
import { DetailsScreenComponent } from './components/screens/details-screen/details-screen.component';
import { NewScreenComponent } from './components/screens/new-screen/new-screen.component';

import {
  MdButtonModule,
  MdListModule,
  MdInputModule,
  MdSliderModule
} from '@angular/material';

import 'hammerjs';

@NgModule({
  declarations: [
    AppComponent,
    LoginScreenComponent,
    ListScreenComponent,
    DetailsScreenComponent,
    NewScreenComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    MdButtonModule,
    MdListModule,
    MdInputModule,
    MdSliderModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
