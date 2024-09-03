package day6.kiosk;

public class Side {
    String names;
    int prices;

    Side(String names, int prices) {
        this.names = names;
        this.prices = prices;
    }

    public String toString() {
        return names + " " + prices + "원";
    }
}