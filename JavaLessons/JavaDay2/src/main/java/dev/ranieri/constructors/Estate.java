package dev.ranieri.constructors;

public class Estate  extends  House{

    int gardenSize;

    Estate(String owner, int area, int walls, int gardenSize){
       super(owner,area,walls); // builds a house
       this.gardenSize = gardenSize;
       System.out.println("Built a fancy estate");
    }

}
