import { ApiUrls } from './../api-url.class';
import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

@Injectable()
export class PartyService {

  constructor(
    private http: Http,
  ) { }

  /**
   * Get full list of Parties
   * 
   * @returns 
   * 
   * @memberof PartyService
   */
  getParties() {
    return this.http.get(
      ApiUrls.priceList
    ).map((res) => res.json());
  }

  /**
   * Get a single Party info by ID
   * 
   * @param {string} id 
   * @returns 
   * 
   * @memberof PartyService
   */
  getParty(id: string) {
    return this.http.get(
      ApiUrls.singleParty + '/' + id
    ).map((res) => res.json());
  }

}
