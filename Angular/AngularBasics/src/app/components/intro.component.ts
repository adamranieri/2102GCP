// stepts to manually create a component
// 1. create a TS class
// 2. Decorator (meta information to the class) what 
// template: html template to use what is the selector: name of the compoenent
// 3. write html
// 4. add the component to the app.module
import { Component } from "@angular/core"; // TS unlike Node js uses import statements


@Component({
    selector:'app-intro', // this is the html tag you will use to pull in this component,
    template: ` 
    <h1>About WVU Revature</h1>
    <h3>The best branch at Revature!!!</h3>
    <p>We are located in Morgantown West Virginia</p>

    <button (click)="revealInfo()" >{{buttonLabel}}</button>

    <app-contact-info *ngIf="showContactInfo"></app-contact-info>

    <button (click)="sayHello()">Hello</button>
    ` // the html for the component

})
export class IntroComponent{

    showContactInfo:boolean = false;
    buttonLabel:string = "Show Contact Information"

    sayHello(){
        console.log("hello")
    }

    revealInfo(){
        this.showContactInfo = !this.showContactInfo;
        if(this.showContactInfo){
            this.buttonLabel ="Hide Contact Information"
        }else{
            this.buttonLabel ="Show Contact Information"
        }
    }


}