import { Component } from "@angular/core";

@Component({
    selector:'app-associate-list',
    template:`
    
    <h3>Graduates from WVU Revature</h3>
    <ul>
        <li *ngFor= "let associate of associates">{{associate}}</li>
    </ul>

    <button (click)="delete()">Delete</button>
    <button (click)="addAssociate()">Add</button>

    <input [(ngModel)]="name">
    <h2>{{name}}</h2>
    `
})
export class AssociateListComponent{

    name:string =''
    associates:string[] =["Jaxon","Peter","John","Francis","Dan","Kaitlyn","Dylan","Edwin"]

    delete(){
        this.associates.pop()
    }

    addAssociate(){
        this.associates.push(this.name)
    }
}