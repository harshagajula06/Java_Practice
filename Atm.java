class Atm
{
    String accountname;
    double balance;
    int atmpin;

    Atm(String accountname, double balance, int atmpin)
    {
        this.accountname = accountname;
        this.balance = balance;
        this.atmpin = atmpin;
    }

    boolean pinverify(int userpin)
    {
        return userpin == atmpin;
    }

    void balancecheck()
    {
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

    void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.println("Deposited amount: " + amount);
            System.out.println("Current balance: " + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }
}