package dev.ranieri.lambdas;

public class Player {

    String name;
    int height;
    double salary;

    public Player(String name, int height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", salary=" + salary +
                '}';
    }
}
