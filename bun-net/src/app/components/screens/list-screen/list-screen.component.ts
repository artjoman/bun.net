import { PartyService } from './../../../services/party.service';
import { Party } from './../../../party';
import { Component, OnInit } from '@angular/core';

const PARTIES: Party[] = [
  { id: 231231, name: 'Johsdfsn Doe', type: '231', phone: 1, email: 'john.doe@example.com', status: 1 },
  { id: 1231231, name: 'Joh1231n Doe2', type: '1232131', phone: 2, email: 'john.doe2@example.com', status: 2 }
];

@Component({
  selector: 'app-list-screen',
  templateUrl: './list-screen.component.html',
  styleUrls: ['./list-screen.component.css']
})
export class ListScreenComponent implements OnInit {
  parties = PARTIES;

  constructor(
    private partyService: PartyService,
  ) { }

  ngOnInit() {
    this.partyService.getParties()
      .subscribe(
      res => {
        this.parties = res.partyList;
        console.log(res.partyList);
      }
      );
  }

}
