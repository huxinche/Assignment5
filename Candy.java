package edu.neu.INFO5100;

public class Candy extends DessertItem {
    private double weight;
    private int price;

    public Candy() {
    }

    public Candy(String name, double weight, int price) {
        super(name);
        this.weight = weight;
        this.price = price;
    }

    @Override
    public int getCost() {
//        System.out.println(this.price * this.weight);
        return (int) Math.round(this.price * this.weight);
    }

    @Override
    public String toString() {
        return String.format("%-30s\n%-30s%7s", String.format("%.2f lbs. @  %s/lb.", this.weight, DessertShoppe.cents2dollarsAndCents(price)), this.name,
                DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
}
