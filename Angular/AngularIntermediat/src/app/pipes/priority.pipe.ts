import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'priority'
})
export class PriorityPipe implements PipeTransform {

  transform(priority:number): string {

    if(priority<3){
      return "Low Priority"
    }
    if(priority <6){
      return "Medium Priority"
    }
    
    return "High Priority"
    
  }

}
