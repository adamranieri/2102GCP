import { Component, Input } from "@angular/core";


@Component({
    selector:'app-employee',
    template: `
    <h3>{{name}}</h3>

    <ul>
        <li>Position: {{position}}</li>
        <li>Specialty: {{specialty}}</li>
        <li>Years with Revature: {{years}}</li>
    </ul>
    `

})
export class EmployeeComponent{

    @Input() name:string = '' //allow you to pass in custom attributes to your component
    @Input() position:string = ''
    @Input() specialty:string =''
    @Input() years:string = ''
}