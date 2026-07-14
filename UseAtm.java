import java.util.Scanner;

class UseAtm {

    public static void main(String[] args) {
        Atm a = new Atm("Sri", 1000, 1234);
        Scanner scan = new Scanner(System.in);
        int attempt = 0;
        boolean loginstatus = false;
        while (attempt < 3) {
            System.out.println("Enter Atm pin:");
            int userpin = scan.nextInt();
            if (a.pinverify(userpin)) {
                loginstatus = true;
                System.out.println("pin verified successfully");
                System.out.println("Welcome," + a.accountname);
                break;
            } else {
                System.out.println("Invalid pin");
                attempt++;
            }

        }
        if (loginstatus) {
            int option;
            do {
                System.out.println("1.check balance");
                System.out.println("2.withdraw");
                System.out.println("3.deposit");
                System.out.println("4.exit");
                System.out.println("5.mini statement");

                System.out.println("-------------------");
                System.out.println("choose ur option:");
                option = scan.nextInt();

                switch (option) {
                    case 1: {
                        a.balancecheck();
                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount:");
                        double amount = scan.nextDouble();
                        a.withdraw(amount);

                    }
                    case 3: {
                        System.out.println("Enter amount:");
                        double amount = scan.nextDouble();
                        a.deposit(amount);

                    }
                    case 4: {
                        System.out.println("**thank you**");

                        System.exit(0);

                    }
                    default: {
                        System.out.println("invalid options");

                    }

                }
            } 
            while (option != 5); 
            {
                System.out.println("Invalid choices");

            }

        } else {
            System.out.println("Account blocked. it reached the limit");

        }
    }
}