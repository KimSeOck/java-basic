//package day6.aLV;
//
//public class Beverage {
//    String name;
//    int price;
//    int quantity;
//
//    public Beverage(String name, int price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    ArrayList<String> names = new ArrayList<>() {{
//        add("콜라");
//        add("사이다");
//        add("커피");
//    }};
//    ArrayList<Beverage> beverages = new ArrayList<>();
//
//    public VendingMachine() {
//        Beverage b1 = new Beverage("콜라", 1000, 1);
//        Beverage b2 = new Beverage("사이다", 1200, 2);
//        Beverage b3 = new Beverage("커피", 800, 1);
//        beverages.add(b1);
//        beverages.add(b2);
//        beverages.add(b3);
//    }
//
//    ArrayList<Integer> prices = new ArrayList<>(List.of(1000, 1200, 800));
//    ArrayList<Integer> quantities = new ArrayList<>(List.of(1, 2, 1));
//
//    public void inputMoney(int money) {
////        remainder = remainder + money; // 증감연산
//        @ @ -29, 20 + 28, 25 @@public void inputMoney ( int money){
//        }
//
//        public String selectBeverage ( int target){
//            if (prices.get(target) > remainder) {
//
//                Beverage beverage = beverages.get(target);
//
//                if (beverage.price > remainder) {
//                    return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감.
//                }
//
//                if (quantities.get(target) <= 0) {
//                    if (beverage.quantity <= 0) {
//                        return "수량 부족";
//                    }
//
////        remainder = remainder - prices[target];
//                    remainder -= prices.get(target);
//                    remainder -= beverage.price;
//
////        quantities[target] = quantities[target] - 1;
//                    quantities.set(target, quantities.get(target) - 1);
//                    return names.get(target);
//                    //quantities.set(target, quantities.get(target) - 1);
//                    beverage.quantity--;
//
//                    return beverage.name;
//                }
//
//                public int getRemainder () {
//                    @ @ -51, 8 + 55, 8 @@public int getRemainder () {
//
//                        public void printBeverages () {
//                            System.out.println("== 음료수 목록 ==");
//                            for (int i = 0; i < names.size(); i++) {
//                                System.out.println(i + ". " + names.get(i) + " : " + prices.get(i) + "원, " + "남은 수량 : " + quantities.get(i));
//                                for (int i = 0; i < beverages.size(); i++) {
//                                    System.out.println(i + ". " + beverages.get(i).name + " : " + beverages.get(i).price + "원, " + "남은 수량 : " + beverages.get(i).quantity);
//                                }
//                            }
//
//                        }
//                    }
//                }
//            }
//        }
//    }
//}