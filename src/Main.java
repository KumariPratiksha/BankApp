import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password,balance to create an account");
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        HDFCuser user1 = new HDFCuser(name,balance,password);

         String message = user1.addMoney(1000000);
         System.out.println(message);

        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user1.withdrawMoney(money,pass));

        System.out.println(user1.calculateInterest(10));






    }
}