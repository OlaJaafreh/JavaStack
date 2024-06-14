
import java.util.concurrent.atomic.AtomicLong;



public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private String accountsNumber;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private static final AtomicLong accountsNum = new AtomicLong();
    // CONSTRUCTOR
    public BankAccount() {

        this.checkingBalance = 0;
        this.savingsBalance = 0;

        this.accounts += 1; // Be sure to increment the number of accounts
        this.totalMoney = 0.0;
        
        this.accountsNumber = accountNumber();


    }

    // private String accountNumber() {
    //     StringBuilder num = new StringBuilder();
        
    //     for (int i = 0; i < 10; i++) {
    //         Random rand = new Random();
    //         num.append(rand.nextInt(10));
    //     }

    //     return num.toString();
    // }

    public String getAccountsNumber() {
        return accountsNumber;
    }

    private String accountNumber() {

        return String.format("%010d",accountsNum.incrementAndGet());
    }


    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }
    



    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account

    public void deposit(double depositAmount, String account){
        if (account == "saving") {
            this.savingsBalance += depositAmount;
        }
        else if(account == "checking"){
            this.checkingBalance += depositAmount;
        }
        else{
            System.out.println("Invalid Account Name");
        }
        this.totalMoney +=  depositAmount;
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney

    public void withdraw(double withdrawAmount, String account){
        if (account == "saving" && withdrawAmount<=savingsBalance) {
            this.savingsBalance -= withdrawAmount;
        }
        else if(account == "checking" && withdrawAmount<=checkingBalance){
            this.checkingBalance -= withdrawAmount;
        }
        else{
            System.out.println("Proccess Faild");
        }
        this.totalMoney -=  withdrawAmount;
    }


    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
    
            System.out.println("Total balance for checking and saving  " + (this.savingsBalance + this.checkingBalance));
        
}

}
