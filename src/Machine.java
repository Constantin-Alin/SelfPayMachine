import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LIDL!");
        System.out.println("Insert total value of purchased items");
        int shoppingValue = sc.nextInt();
        System.out.println("Please insert cash");
        int money = sc.nextInt();

        if (money > shoppingValue) {
            int change = money - shoppingValue;

            System.out.println("Your change is: " + change);

            while (change >= 200) {
                System.out.println("200 lei");
                change -= 200;
            }
            while (change >= 100) {
                System.out.println("100 lei");
                change -= 100;
            }
            while (change >= 50) {
                System.out.println("50 lei");
                change -= 50;
            }
            while (change >= 20) {
                System.out.println("20 lei");
                change -= 20;
            }
            while (change >= 10) {
                System.out.println("10 lei");
                change -= 10;
            }
            while (change >= 5) {
                System.out.println("5 lei");
                change -= 5;
            }
            while (change >= 1) {
                System.out.println("1 leu");
                change -= 1;
            }
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
