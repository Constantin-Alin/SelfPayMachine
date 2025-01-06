import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        // 1. Mesaj de intampinare: ex. "Bine ai venit"
        // 2. Introdu valoarea cumparaturilor
        // 3. Introdu banii in aparat
        // 4. Calculeaza restul
        // 5. Afiseaza bancnotele pe care le primesti
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LIDL!");
        System.out.println("Insert total value of purchased items");
        int shoppingValue = sc.nextInt();
        System.out.println("Please insert cash");
        int money = sc.nextInt();
        int change = money - shoppingValue;

        System.out.println("Your change is: " + change);

        if (change > 200) {
            System.out.println("200 lei");
        }
        if (change > 100) {
            System.out.println("100 lei");
        }
        if (change > 50) {
            System.out.println("50 lei");
        }
        if (change > 20) {
            System.out.println("20 lei");
        }
        if (change > 10) {
            System.out.println("10 lei");
        }
        if (change > 5) {
            System.out.println("5 lei");
        }
        if (change > 1) {
            System.out.println("1 leu");
        }
    }
}
