package day6.kiosk;

public class SetMenu {
    String names;
    int prices;

    SetMenu(String names, int prices) {
        this.names = names;
        this.prices = prices;
    }

    public String toString() {
        return names + " " + prices + "원";
    }
}
