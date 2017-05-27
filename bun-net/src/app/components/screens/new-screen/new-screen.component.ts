import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-screen',
  templateUrl: './new-screen.component.html',
  styleUrls: ['./new-screen.component.css']
})
export class NewScreenComponent implements OnInit {
  bunname: string;
  buncount: number;

  constructor() { }

  ngOnInit() {
    this.buncount = 1;
  }

  bunCountMore(){
    if(this.buncount == 10){
      alert('Maximum count is 10!');
    }
    else{
      this.buncount++;
    }
  }

  bunCountLess(){
    if(this.buncount == 1){
      alert('Minimum count is 1!');
    }
    else{
      this.buncount--;
    }
  }


}
