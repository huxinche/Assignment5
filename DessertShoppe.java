package edu.neu.INFO5100;

public class DessertShoppe {
    public static final double RATE = 0.065;
    public static final String STORE_NAME = "M & M Dessert Shoppe";
    public static final String FLAG_SPLIT = "--------------------";
    public static final int MAX_SIZE = 1;
    public static final int WIDTH = 1;


    public static String cents2dollarsAndCents(int cents) {

        String result = String.format("%.2f", (float) cents / 100);
        if (cents < 100) {
            result = result.substring(1);
        }
        return result;

    }
}

