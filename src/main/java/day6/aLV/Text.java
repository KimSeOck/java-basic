package day5.aLV;

class Text {
    String drinkNames;
    int prices;
    int quantities;

    @Override
    public String toString() {
        return drinkNames + " - " + prices + "원";
    }
}