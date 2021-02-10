package dev.ranieri.collectionsfun;

public class Player {

    String name;
    int height; // inches

    public Player(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
