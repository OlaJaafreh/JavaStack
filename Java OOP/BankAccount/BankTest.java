public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account 
        // and display the balance each time
        account1.deposit(200, "saving");
        account1.deposit(1010, "checking");
        account1.getBalance();
        // - each deposit should increase the amount of totalMoney
        System.out.println( BankAccount.getTotalMoney());

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account 
        // and display the remaining balance
        account1.withdraw(20, "saving");
        account1.withdraw(100, "checking");
        account1.getBalance();
        System.out.println("Account Number"+account1.getAccountsNumber());
        System.out.println(account2.getAccountsNumber());
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println( BankAccount.getTotalMoney());
        // Static Test (print the number of bank accounts and the totalMoney)

    }
}
