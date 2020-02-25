import { Component, ViewChild, ElementRef, AfterViewInit } from '@angular/core';

@Component({
    selector: 'app-cptheme',
    templateUrl: './cptheme.component.html'
})
export class CpThemeComponent implements AfterViewInit {
    @ViewChild('name') 
	private elName : ElementRef;
	@ViewChild('city') 
	private elCity : ElementRef;
	
	ngAfterViewInit() {
	   this.elName.nativeElement.style.backgroundColor = 'cyan';
	   this.elName.nativeElement.style.color = 'red';	   
	   this.elCity.nativeElement.style.backgroundColor = 'cyan';
	   this.elCity.nativeElement.style.color = 'red';	   	   
    }
}    