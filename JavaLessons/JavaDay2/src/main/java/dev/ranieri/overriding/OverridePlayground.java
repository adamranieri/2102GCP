package dev.ranieri.overriding;

public class OverridePlayground {

    public static void main(String[] args) {

        // Overriding is called Dynamic Polymophism
        // Java does not know what method it will actually use until called at runtime
        CreditCard card1 = new CreditCard("Adam Ranieri", 0,0);
        card1.makePurchase(145);
        card1.makePurchase(75);
        card1.makePurchase(20);
        card1.printCreditCardStats();

        // the platinum card uses the overrided version to makePurchases
        PlatinumCard platCard = new PlatinumCard("Richard", 0,0);
        platCard.makePurchase(2000);
        platCard.makePurchase(1000);
        platCard.makePurchase(400);
        platCard.printCreditCardStats();
        platCard.useLounge();

        // uses the platinum card implementation even though card2 is referred to as a credit card
        // when you call a method on an object it will ALWAYS use the implementation of the ACTUAL OBJECT
        CreditCard card2 = new PlatinumCard("Sierra", 0,0);
        card2.makePurchase(90);
        card2.makePurchase(40);
        card2.makePurchase(10);
        card2.printCreditCardStats(); // will see if this object has that method if not it will use the parent
        // card2.useLounge();// does not work

        // divorce the reference type from the actual type of the object
        // refrence type says WHAT METHODS you can use
        // actual type is the final code that would actually be called
        // this is polymorphism where a single object could have multiple


    }

}
