import { Party } from './../party';
import { ApiUrls } from './../api-url.class';
import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

import 'rxjs/add/operator/toPromise';

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
    getParty(id: string): Promise<Party> {
    return this.http.get(
      ApiUrls.singleParty + '/' + id
    ).toPromise().then((res) => res.json());
  }

}
