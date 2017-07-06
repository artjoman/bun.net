import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-screen',
  templateUrl: './new-screen.component.html',
  styleUrls: ['./new-screen.component.css']
})

export class NewScreenComponent implements OnInit {


  constructor() {
  }


  ngOnInit() {
  }

  // SLIDER
  buncount: number = 1;
  bunname: string = '';
  message: string = '';


  autoTicks = false;
  disabled = false;
  invert = false;
  max = 10;
  min = 1;
  showTicks = true;
  step = 1;
  thumbLabel = true;
  value = 1;
  vertical = false;

  get tickInterval(): number | 'auto' {
    return this.showTicks ? (this.autoTicks ? 'auto' : this._tickInterval) : null;
  }
  set tickInterval(v) {
    this._tickInterval = Number(v);
  }
  private _tickInterval = 1;
  // SLIDER END
  showBuncount() {
    this.buncount = this.buncount;
  }

  placeOrder() {
    this.message = 'You have been ordered ' + this.buncount + ' of *' + this.bunname + '*';
    alert(this.message);
  }
}
