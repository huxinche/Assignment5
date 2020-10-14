package edu.neu.INFO5100;

public class Cookie extends DessertItem {

    private int number;
    private int price;

    public Cookie() {
    }

    public Cookie(String name, int number, int price) {
        super(name);
        this.number = number;
        this.price = price;
    }

    @Override
    public int getCost() {
        return (int) Math.round((float) price / 12 * number);
    }

    @Override
    public String toString() {
        return String.format("%-30s\n%-30s%7s", String.format("%s @  %s /dz.", this.number, DessertShoppe.cents2dollarsAndCents(price)), this.name,
                DessertShoppe.cents2dollarsAndCents(this.getCost()));

    }
}
