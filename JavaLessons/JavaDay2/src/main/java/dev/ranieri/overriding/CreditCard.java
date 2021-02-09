package dev.ranieri.overriding;

public class CreditCard {

    String owner;
    double balance;
    double rewardPoints;

    CreditCard(String owner, double balance, double rewardPoints){
        this.owner = owner;
        this.balance = balance;
        this.rewardPoints = rewardPoints;
    }

    // a credit card can make a purchase which will increase your balance and increase your reward points

    void makePurchase(double price){
        this.balance = this.balance + price;
        this.rewardPoints = this.rewardPoints + (price*.01);// 1% of what you purchased
    }

    void printCreditCardStats(){
        System.out.println("Balance: " + this.balance +" reward Points " + this.rewardPoints);
    }

}
