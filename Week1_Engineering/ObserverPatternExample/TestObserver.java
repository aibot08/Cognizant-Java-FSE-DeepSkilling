package com.cognizant.observer;

public class TestObserver {

    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Rohith");
        Observer web = new WebApp("Investor");

        market.register(mobile);
        market.register(web);

        market.setStock("Cognizant", 4200);
    }
}
