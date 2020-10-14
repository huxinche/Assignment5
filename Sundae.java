package edu.neu.INFO5100;

public class Sundae extends IceCream {
    private String type;
    private double subCost;

    public Sundae() {
    }

    public Sundae(String name, int cost, String type, double subCost) {
        super(name, cost);
        this.type = type;
        this.subCost = subCost;
    }

    @Override
    public int getCost() {
        return super.getCost() + (int) Math.round(this.subCost);
    }


    @Override
    public String toString() {
        return String.format("%-30s\n%-30s%7s", String.format("%s with", this.type), this.name, DessertShoppe.cents2dollarsAndCents(this.getCost()));
    }
}
