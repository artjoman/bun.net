import { ApiUrls } from './../api-url.class';
import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

@Injectable()
export class PartyService {

  constructor(
    private http: Http,
  ) { }

  getParties() {
    return this.http.get(
      ApiUrls.priceList
    ).map((res) => res.json());
  }

}
