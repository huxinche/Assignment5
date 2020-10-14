package edu.neu.INFO5100;

public class IceCream extends DessertItem {
    private int cost;

    public IceCream() {
    }

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return (int) Math.round(this.cost);
    }

    @Override
    public String toString() {
        return String.format("%-30s%7s", this.name, DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
}
