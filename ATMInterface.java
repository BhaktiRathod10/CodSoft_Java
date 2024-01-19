import java.util.Scanner;

public class ATMInterface 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1000);

        boolean isRunning = true;
        int choice;

        while (isRunning) 
        {
            System.out.println("\nOPTIONS");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("\nEnter the amount you want to withdraw: ");
                    double withdrawAmt = sc.nextDouble();
                    atm.withdraw(withdrawAmt);
                    break;

                case 2:
                    System.out.print("\nEnter the amount you want to deposit: ");
                    double depositAmt = sc.nextDouble();
                    atm.deposit(depositAmt);
                    break;

                case 3:
                    atm.CheckBalance();
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("\nExiting the ATM. Visit again! ");
                    break;
            }
        }
    }
}

class ATM 
{
    double balance;

    public ATM(double initialBal) 
    {
        this.balance = initialBal;
    }

    public void withdraw(double amt) 
    {
        if (amt > 0 && amt <= balance) 
        {
            balance -= amt;
            System.out.println("\nWithdrawal successful.");
        } 
    
        else 
        {
            System.out.println("\nWithdrawal unsuccessful. Insufficient balance.");
        }
    }

    public void deposit(double amt) 
    {
        if (amt > 0) {
            balance += amt;
            System.out.println("\nDeposit successful.");
        } 
        
        else 
        {
            System.out.println("\nDeposit unsuccessful. Invalid amount");
        }
    }
    
    public void CheckBalance() 
    {
        System.out.println("\nThe current balance is: " + balance);
    }
}