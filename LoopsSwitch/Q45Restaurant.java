package LoopsSwitch;

import java.util.Scanner;

public class Q45Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, price = 0;

        do {
            System.out.println("Welcome to bade bhai sahab ka dhaba ->");
            System.out.println("1 - South Indian\n2 - Italian\n3 - Chinese\n4 - Breakfast");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("1 - Idli Sambhar\n2 - Masala Dosa\n3 - Appe");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("You've ordered Idli Sambhar");
                            price += 50;
                        }
                        case 2 -> {
                            System.out.println("You've ordered Masala Dosa");
                            price += 70;
                        }
                        case 3 -> {
                            System.out.println("You've ordered Appe");
                            price += 80;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("1 - Pasta\n2 - Margherita Pizza\n3 - Spaghetti");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("You've ordered Pasta");
                            price += 110;
                        }
                        case 2 -> {
                            System.out.println("You've ordered Margherita Pizza");
                            price += 120;
                        }
                        case 3 -> {
                            System.out.println("You've ordered Spaghetti");
                            price += 90;
                        }
                    }
                }
                case 3 -> {
                    System.out.println("1 - Manchurian\n2 - Hakka Noddles\n3 - Momos");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("You've ordered Manchurian");
                            price += 60;
                        }
                        case 2 -> {
                            System.out.println("You've ordered Hakka Noddles");
                            price += 50;
                        }
                        case 3 -> {
                            System.out.println("You've ordered Momos");
                            price += 70;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("1 - Poha\n2 - Kachori\n3 - Samosa");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("You've ordered Poha");
                            price += 30;
                        }
                        case 2 -> {
                            System.out.println("You've ordered Kachori");
                            price += 20;
                        }
                        case 3 -> {
                            System.out.println("You've ordered Samosa");
                            price += 20;
                        }
                    }
                }
            }
            System.out.println("Here is your total bill: " + price);
            System.out.println("Press 1 to repeat");
            ch = sc.nextInt();
        } while (ch == 1);

    }
}
