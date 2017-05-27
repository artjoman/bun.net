import { Party } from './../../../party';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-details-screen',
  templateUrl: './details-screen.component.html',
  styleUrls: ['./details-screen.component.css']
})
export class DetailsScreenComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  party: Party = {
    id: 1,
    name: 'Test',
    type: '1',
    phone: 12345678,
    email: 'test@gmail.com',
    status: 1
  }

}
