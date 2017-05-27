import { Party } from './../../../party';
import { Component, OnInit } from '@angular/core';

const PARTIES: Party[] = [
  {id: 1, name: 'John Doe', type: '1', phone: 1, email: 'john.doe@example.com', status: 1},
  {id: 2, name: 'John Doe2', type: '2', phone: 2, email: 'john.doe2@example.com', status: 2} 
];

@Component({
  selector: 'app-list-screen',
  templateUrl: './list-screen.component.html',
  styleUrls: ['./list-screen.component.css']
})
export class ListScreenComponent implements OnInit {
  parties = PARTIES;
  constructor() { }

  ngOnInit() {

  }

}
