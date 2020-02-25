import { Component } from '@angular/core';
import { Mcounter} from './counter.component';

@Component({
  selector: 'app-root',
  styles: [`
    .app {
      display: block;
      text-align: center;
      padding: 25px;
      background: #f5f5f5;
    }
  `],
  template: `
    <div class="app">
      Parent: {{ sum }}
      <counter
       
        (change)="countChange($event)">
      </counter>
     
      <counter
        
        (change)="countChange($event)">
      </counter>
     
      <counter
       
        (change)="countChange($event)">
      </counter>
  `
})
export class AppComponent {
sum:number = 0;
  countChange(event) {
    this.sum =this.sum+event.count;
  }
  
}