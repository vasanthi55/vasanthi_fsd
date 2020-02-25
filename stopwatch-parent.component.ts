import { Component, ViewChild } from '@angular/core';
import { StopwatchComponent } from './stopwatch.component';

@Component({
  selector: 'app-stopwatch-parent',
  templateUrl: './stopwatch-parent.component.html'
})
export class StopwatchParentComponent {
    @ViewChild(StopwatchComponent)
    private stopwatchComponent: StopwatchComponent;
	startStopwatch() {
       this.stopwatchComponent.start();
	}
	stopStopwatch() {
       this.stopwatchComponent.stop();
       }
       restartStopwatch() {
              this.stopwatchComponent.restart();
              }
              fasterStopwatch() {
                     this.stopwatchComponent.faster();
                     }
              slowerStopwatch() {
                     this.stopwatchComponent.slower();
                     }
}    