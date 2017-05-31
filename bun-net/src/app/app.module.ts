import { PurchaseService } from './services/purchase.service';
import { PartyService } from './services/party.service';
import { AppRoutingModule } from './app-routing.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';

import {
  FormsModule
} from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginScreenComponent } from './components/screens/login-screen/login-screen.component';
import { ListScreenComponent } from './components/screens/list-screen/list-screen.component';
import { DetailsScreenComponent } from './components/screens/details-screen/details-screen.component';
import { NewScreenComponent } from './components/screens/new-screen/new-screen.component';
import { TopMenuComponent } from './components/menu/top-menu/top-menu.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {
  MdButtonModule,
  MdListModule,
  MdInputModule,
  MdSliderModule,
  MdTooltipModule,
  MdAutocompleteModule
} from '@angular/material';

import 'hammerjs';

@NgModule({
  declarations: [
    AppComponent,
    LoginScreenComponent,
    ListScreenComponent,
    DetailsScreenComponent,
    NewScreenComponent,
    TopMenuComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    MdButtonModule,
    MdListModule,
    MdInputModule,
    MdSliderModule,
    MdTooltipModule,
    MdAutocompleteModule
  ],
  providers: [
    PartyService,
    PurchaseService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
