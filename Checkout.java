package edu.neu.INFO5100;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private List<DessertItem> dessertItems;

    public Checkout() {
        dessertItems = new ArrayList<>();
    }

    public int numberOfItems() {
        return dessertItems.size();
    }

    public void enterItem(DessertItem item) {
        dessertItems.add(item);
    }

    public void clear() {
        this.dessertItems.clear();
    }

    public int totalCost() {
        double cost = 0;
        for (DessertItem dessertItem : dessertItems) {
            cost += dessertItem.getCost();
        }
        return (int) Math.round(cost);
    }

    public int totalTax() {
        return (int) Math.round(DessertShoppe.RATE * (float) this.totalCost());
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("%28s\n", DessertShoppe.STORE_NAME));
        result.append(String.format("%28s\n", DessertShoppe.FLAG_SPLIT));


        for (DessertItem dessertItem : this.dessertItems) {
            result.append(dessertItem.toString());
            result.append("\n");
        }

        result.append(String.format("\n%-30s%7s\n", "Tax", DessertShoppe.cents2dollarsAndCents(totalTax())));
        result.append(String.format("%-30s%7s", "Total Cost", DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax())));

        return result.toString();
    }
}
