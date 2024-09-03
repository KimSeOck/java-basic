package day6.kiosk;

public class Drink {
    String names;
    int prices;

    Drink(String names, int prices) {
        this.names = names;
        this.prices = prices;
    }

    public String toString() {
        return names + " " + prices + "원";
    }
}