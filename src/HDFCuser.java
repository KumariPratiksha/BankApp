import java.util.Objects;
import java.util.UUID;

public class HDFCuser implements  BankInterface{
    private String name;
    private String accountNo;
    private double balance ;
    private String password;
    private  static double rateOfInterest;

    public HDFCuser(String name,  double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        HDFCuser.rateOfInterest = rateOfInterest;
    }
    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "updated balance "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String EnteredPassword) {
        if(Objects.equals(EnteredPassword, password)){
            if(amount>balance){
                return "Bhai paisa nhi hai ";
            }
            else{
                balance = balance-amount;
                return "paisa hi paisa  ";
            }
        }
        else{
            return "Wrong Password";
        }

    }

    @Override
    public double calculateInterest(int years) {
        return (balance*rateOfInterest*years)/100;
    }
}
