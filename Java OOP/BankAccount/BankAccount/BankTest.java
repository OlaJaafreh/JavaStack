public class BankTest {
     public static void main(String[] args) {
          // Create 3 bank accounts
          BankAccount account1 = new BankAccount();
          BankAccount account2 = new BankAccount();
          BankAccount account3 = new BankAccount();
          // Deposit Test
          // - deposit some money into each bank account's checking or savings account and
          // display the balance each time
          account1.deposit(100, "checking");
          account1.deposit(200, "Saving");
          account1.withdraw(213, "checking");
          
          account2.deposit(100, "checking");
          account2.deposit(10, "Saving");
          account2.withdraw(200, "checking");
          
          account3.deposit(1580, "checking");
          account3.deposit(1250, "Saving");
          account3.withdraw(30, "checking");
          
          account1.display();
          account2.display();
          account3.display();
          account1.displayAccountNum();
          System.out.println(account1.getTotalMoney());
          // account2.display();
          // account3.display();
          // BankAccount.BankacountAndtotal();
          // - each deposit should increase the amount of totalMoney

          // Withdrawal Test
          // - withdraw some money from each bank account's checking or savings account
          // and display the remaining balance
          // - each withdrawal should decrease the amount of totalMoney

          // Static Test (print the number of bank accounts and the totalMoney)

     }
}
