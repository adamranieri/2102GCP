/* Hello World in Groovy */

class Item{
    
    static double totalCost  = 0
    
    String name
    double cost
    
    Item(String name, double cost){
        this.name = name
        this.cost = cost
    }
    
    public size(String s){
        
        if(s.equals("large")){
            totalCost +=  this.cost + 2
            return
        }
        if(s.equals("small")){
            totalCost += this.cost -3
            return
        }
        
       totalCost +=  this.cost
    }
    
    public String toString(){
       return this.name
    }
}



soup = new Item("Soup",6.00)
salad = new Item("Salad",9.00)
hamburger = new Item("Hamburger",12.00)
steak = new Item("Steak",19.00)
fries = new Item("Fries",4.00)

list = [soup,salad,hamburger,steak,fries]

def item = { name ->
    
        for(item in list){
        
            if (item.name.equals(name)){
            return item
            }
        }
        
}

def reciept(func){
    
    func()
    println "The total cost is : " + Item.totalCost

}


reciept{
    
    item "Hamburger" size "large"
    item "Steak" size "small"
    item "Soup" size "small"
   
    
}