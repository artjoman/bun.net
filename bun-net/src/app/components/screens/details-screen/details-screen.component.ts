import { Party } from './../../../party';
import { PartyService } from './../../../services/party.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params }   from '@angular/router';
import { Location }               from '@angular/common';

import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'app-details-screen',
  templateUrl: './details-screen.component.html',
  styleUrls: ['./details-screen.component.css']
})
export class DetailsScreenComponent implements OnInit {
  party: Party;
  constructor(private partyService: PartyService,
  private route: ActivatedRoute,
  private location: Location) {}

  ngOnInit() {
    this.route.params
    .switchMap((params: Params) =>
     this.partyService.getParty(params['id'])).subscribe((res) =>
     {
       this.party = res;
      
    });
  }

  goBack(): void {
    this.location.back();
  }

}
