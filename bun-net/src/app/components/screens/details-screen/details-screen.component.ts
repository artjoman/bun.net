import { Party } from './../../../party';
import { PartyService } from './../../../services/party.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params }   from '@angular/router';

import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'app-details-screen',
  templateUrl: './details-screen.component.html',
  styleUrls: ['./details-screen.component.css']
})
export class DetailsScreenComponent implements OnInit {
  party: any={};
  constructor(private partyService: PartyService,
  private route: ActivatedRoute) {}

  ngOnInit() {
    this.route.params
    .switchMap((params: Params) =>
     this.partyService.getParty(params['id'])).subscribe(res =>
     {
       console.log("result");
       console.log("result"+res);
       this.party = res;
      
    });
  }

  // party: Party = {
  //   partyId: 1,
  //   partyName: 'Test',
  //   partyType: '1',
  //   phone: 12345678,
  //   email: 'test@gmail.com',
  //   status: 1
  // }

}
