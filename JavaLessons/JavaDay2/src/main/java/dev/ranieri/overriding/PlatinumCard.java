package dev.ranieri.overriding;

// Inheritance the platinum will inherit all the fields and methods of the parent class credit card
public class PlatinumCard extends  CreditCard{

    int airportLoungeUses = 10; // 10 uses of a the airpot lounge

    PlatinumCard(String owner, double balance, double rewardPoints) {
        super(owner, balance, rewardPoints);
    }

    // platinum cards earn double reward points for any purchase
    // override this make purchase method
    // overriding is when a child class uses the same method signature but with a different implementation
    @Override // optional throws a compiler error if there is no method signature in the parent class
    void makePurchase(double price){
        this.balance = this.balance + price;
        this.rewardPoints = this.rewardPoints + (price*.02); // different implementation double reward points
    }

    void useLounge(){
        System.out.println("Feel smugly superior to the plebs use the airport lounge");
        this.airportLoungeUses--;
    }




}
