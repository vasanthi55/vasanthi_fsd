import { Component } from '@angular/core';

@Component({
  selector: 'app-stopwatch',
  template: '<h2>{{counter}}</h2>'
})
export class StopwatchComponent {
	shouldRun:boolean = false;
	counter:number = 0;
	timeInterval:number=1000;
	interval:any;
	start() {
	      this.shouldRun = true;
		  this.interval = setInterval(() =>
  	      {  
			if(this.shouldRun === false){
			   clearInterval(this.interval);
			}
		    this.counter = this.counter + 1;			
	      }, this.timeInterval);
	}
	stop() {
	   this.shouldRun = false;
	}
	restart(){
		this.counter = 0;
		this.shouldRun = true;
		let interval = setInterval(() =>
  	      {  
			if(this.shouldRun === false){
			   clearInterval(interval);
			}
		    this.counter = this.counter + 1;			
	      }, 1000);
	}
	faster(){
	if(this.timeInterval>2000)
	{
		this.stop();
		this.timeInterval -= 1000;
		this.start();
	}
	
		
		}
		
	slower()
	{

		clearInterval(this.interval);
		this.timeInterval += 1000;
		this.start();
	}

	}

