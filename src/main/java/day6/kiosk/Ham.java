package day6.kiosk;

public class Ham {
    String names;
    int prices;

    Ham(String names, int prices) {
        this.names = names;
        this.prices = prices;
    }

    public String toString() {
        return names + " " + prices + "원";
    }
}