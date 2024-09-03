package day6.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Ham> ham = new ArrayList<>();
        ArrayList<Side> side = new ArrayList<>();
        ArrayList<Drink> drink = new ArrayList<>();
        ArrayList<SetMenu> set = new ArrayList<>();

        SetMenu hanwooSet = new SetMenu("한우불고기버거 세트", 8000);
        SetMenu cheeseSet = new SetMenu("치즈버거 세트", 5000);
        SetMenu chikenSet = new SetMenu("치킨버거 세트", 5500);
        SetMenu shrimpSet = new SetMenu("새우버거 세트", 5200);

        Ham hanwoo = new Ham("한우불고기버거", 6000);
        Ham cheese = new Ham("치즈버거", 3000);
        Ham chiken = new Ham("치킨버거", 3500);
        Ham shrimp = new Ham("새우버거", 3200);

        Side fry = new Side("감자튀김", 1800);
        Side stick = new Side("치즈스틱", 2000);
        Side nuget = new Side("치킨너겟", 2500);
        Side ring = new Side("오징어링", 2700);

        Drink coke = new Drink("콜라", 1000);
        Drink ade = new Drink("에이드", 2000);
        Drink coffee = new Drink("커피", 1500);
        Drink shake = new Drink("쉐이크", 2500);

        set.add(hanwooSet);
        set.add(cheeseSet);
        set.add(chikenSet);
        set.add(shrimpSet);

        ham.add(hanwoo);
        ham.add(cheese);
        ham.add(chiken);
        ham.add(shrimp);

        side.add(fry);
        side.add(stick);
        side.add(nuget);
        side.add(ring);

        drink.add(coke);
        drink.add(ade);
        drink.add(coffee);
        drink.add(shake);

        ArrayList<SetMenu> selectedSetMenus = new ArrayList<>();
        ArrayList<Ham> selectedBurgers = new ArrayList<>();
        ArrayList<Side> selectedSides = new ArrayList<>();
        ArrayList<Drink> selectedDrinks = new ArrayList<>();
        int totalAmount = 0;

        while (true) {
            printOrderSummary(selectedSetMenus, selectedBurgers, selectedSides, selectedDrinks, totalAmount);

            System.out.println("== 기능을 선택해주세요 ==");
            System.out.println("0. 세트 메뉴 선택 ");
            System.out.println("1. 햄버거 선택 ");
            System.out.println("2. 사이드 선택 ");
            System.out.println("3. 음료수 선택 ");
            System.out.println("4. 메뉴 취소 ");
            System.out.println("5. 주문 하기 ");
            System.out.println("6. 사용 종료 ");
            System.out.println("=====================");
            String command = sc.nextLine().trim();


            if (command.equals("0")) {
                System.out.println("=== 세트 메뉴 목록 ===");
                for (int i = 0; i < set.size(); i++) {
                    SetMenu burger = set.get(i);
                    System.out.println((i + 1) + ". " + burger);
                }
                System.out.print("어떤 세트를 고르시겠습니까 : ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice > 0 && choice <= set.size()) {
                    SetMenu selectedSetMenu = set.get(choice - 1);
                    selectedSetMenus.add(selectedSetMenu);
                    totalAmount += selectedSetMenu.prices;
                    System.out.println(selectedSetMenu.names + "을(를) 선택하였습니다.");
                } else {
                    System.out.println("잘못된 선택입니다.");
                }

            } else if (command.equals("1")) {
                System.out.println("=== 햄버거 목록 ===");
                for (int i = 0; i < ham.size(); i++) {
                    Ham burger = ham.get(i);
                    System.out.println((i + 1) + ". " + burger);
                }
                System.out.print("어떤 버거를 고르시겠습니까 : ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice > 0 && choice <= ham.size()) {
                    Ham selectedBurger = ham.get(choice - 1);
                    selectedBurgers.add(selectedBurger);
                    totalAmount += selectedBurger.prices;
                    System.out.println(selectedBurger.names + "을(를) 선택하였습니다.");
                } else {
                    System.out.println("잘못된 선택입니다.");
                }

            }else if (command.equals("2")) {
                System.out.println("=== 사이드 목록 ===");
                for (int i = 0; i < side.size(); i++) {
                    Side s = side.get(i);
                    System.out.println((i + 1) + ". " + s);
                }
                System.out.print("어떤 사이드를 고르시겠습니까 : ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice > 0 && choice <= side.size()) {
                    Side selectedSide = side.get(choice - 1);
                    selectedSides.add(selectedSide);
                    totalAmount += selectedSide.prices;
                    System.out.println(selectedSide.names + "을(를) 선택하였습니다.");
                } else {
                    System.out.println("잘못된 선택입니다.");
                }

            } else if (command.equals("3")) {
                System.out.println("=== 음료수 목록 ===");
                for (int i = 0; i < drink.size(); i++) {
                    Drink d = drink.get(i);
                    System.out.println((i + 1) + ". " + d);
                }
                System.out.print("어떤 음료수를 고르시겠습니까 : ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice > 0 && choice <= drink.size()) {
                    Drink selectedDrink = drink.get(choice - 1);
                    selectedDrinks.add(selectedDrink);
                    totalAmount += selectedDrink.prices;
                    System.out.println(selectedDrink.names + "을(를) 선택하였습니다.");
                } else {
                    System.out.println("잘못된 선택입니다.");
                }

            } else if (command.equals("4")) {
                System.out.println("=== 메뉴 취소 ===");
                System.out.println("1. 버거");
                System.out.println("2. 사이드");
                System.out.println("3. 음료수");
                System.out.print("취소할 품목을 선택해주세요 : ");
                int cancelChoice = sc.nextInt();
                sc.nextLine();

                if (cancelChoice == 1) {
                    System.out.println("=== 선택된 버거 목록 ===");
                    for (int i = 0; i < selectedBurgers.size(); i++) {
                        Ham b = selectedBurgers.get(i);
                        System.out.println((i + 1) + ". " + b);
                    }
                    System.out.print("취소할 버거를 선택해주세요 : ");
                    int itemChoice = sc.nextInt();
                    sc.nextLine();

                    if (itemChoice > 0 && itemChoice <= selectedBurgers.size()) {
                        Ham removedBurger = selectedBurgers.remove(itemChoice - 1);
                        totalAmount -= removedBurger.prices;
                        System.out.println(removedBurger.names + "이(가) 취소되었습니다.");
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }

                } else if (cancelChoice == 2) {
                    System.out.println("=== 선택된 사이드 목록 ===");
                    for (int i = 0; i < selectedSides.size(); i++) {
                        Side s = selectedSides.get(i);
                        System.out.println((i + 1) + ". " + s);
                    }
                    System.out.print("취소할 사이드를 선택해주세요 : ");
                    int itemChoice = sc.nextInt();
                    sc.nextLine();

                    if (itemChoice > 0 && itemChoice <= selectedSides.size()) {
                        Side removedSide = selectedSides.remove(itemChoice - 1);
                        totalAmount -= removedSide.prices;
                        System.out.println(removedSide.names + "이(가) 취소되었습니다.");
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }

                } else if (cancelChoice == 3) {
                    System.out.println("=== 선택된 음료수 목록 ===");
                    for (int i = 0; i < selectedDrinks.size(); i++) {
                        Drink d = selectedDrinks.get(i);
                        System.out.println((i + 1) + ". " + d);
                    }
                    System.out.print("취소할 음료수를 선택해주세요 : ");
                    int itemChoice = sc.nextInt();
                    sc.nextLine();

                    if (itemChoice > 0 && itemChoice <= selectedDrinks.size()) {
                        Drink removedDrink = selectedDrinks.remove(itemChoice - 1);
                        totalAmount -= removedDrink.prices;
                        System.out.println(removedDrink.names + "이(가) 취소되었습니다.");
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }

                } else {
                    System.out.println("잘못된 선택입니다.");
                }

            } else if (command.equals("5")) {
                printOrderSummary(selectedSetMenus, selectedBurgers, selectedSides, selectedDrinks, totalAmount);
                System.out.print("정말 주문하시겠습니까?(y/n) : ");
                String confirm = sc.nextLine().trim();

                if (confirm.equalsIgnoreCase("y")) {
                    System.out.print("결제 금액을 입력해주세요 : ");
                    int payment = sc.nextInt();
                    sc.nextLine();

                    if (payment >= totalAmount) {
                        int change = payment - totalAmount;
                        System.out.print("영수증 발급하시겠습니까?(y/n) : ");
                        String receipt = sc.nextLine().trim();

                        if (receipt.equalsIgnoreCase("y")) {
                            System.out.println("==== 영수증 =====");
                            System.out.println("버거: " + selectedBurgers);
                            System.out.println("사이드: " + selectedSides);
                            System.out.println("음료수: " + selectedDrinks);
                            System.out.println("총금액: " + totalAmount);
                            System.out.println("==================");
                        }

                        System.out.println("거스름돈: " + change + "원");
                        System.out.println("이용해주셔서 감사합니다.");
                        break;

                    } else {
                        System.out.println("입력된 금액이 부족합니다.");
                    }

                } else {
                    System.out.println("주문이 취소되었습니다.");
                }

            } else if (command.equals("6")) {
                System.out.println("프로그램이 종료됩니다.");
                break;

            } else {
                System.out.println("알 수 없는 명령어입니다. '1', '2', '3', '4', '5', '6' 중 하나를 입력해주세요.");
            }
        }
        sc.close();
    }

    private static void printOrderSummary(ArrayList<SetMenu> setMenus ,ArrayList<Ham> burgers, ArrayList<Side> sides, ArrayList<Drink> drinks, int totalAmount) {
        System.out.println("====== 주문 목록 =====");
        System.out.println("세트: " + setMenus);
        System.out.println("버거: " + burgers);
        System.out.println("사이드: " + sides);
        System.out.println("음료수: " + drinks);
        System.out.println("총금액: " + totalAmount);
        System.out.println("======================");
    }
}