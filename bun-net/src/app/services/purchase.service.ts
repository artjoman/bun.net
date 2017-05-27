import { ApiUrls } from './../api-url.class';
import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

@Injectable()
export class PurchaseService {

  constructor(private http: Http) { }

  getParties() {
    return this.http.get(
      ApiUrls.purchaseList
    ).map((res) => res.json());
  }

}
