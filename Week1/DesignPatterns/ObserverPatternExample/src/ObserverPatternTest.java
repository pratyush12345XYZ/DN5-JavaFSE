package com.cognizant.observer;

public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser =
                new MobileApp("Pratyush");

        Observer webUser =
                new WebApp("Investor");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStock("TCS", 4200.50);

        System.out.println("\nRemoving Web Observer...\n");

        stockMarket.deregisterObserver(webUser);

        stockMarket.setStock("Infosys", 1550.75);
    }
}