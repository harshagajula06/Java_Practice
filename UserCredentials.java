import java.util.Scanner;

class UserCredentials {

    String regEmail, regPassword;
    String logEmail, logPassword;

    Scanner scan = new Scanner(System.in);

    // Constructor
    UserCredentials(String regEmail, String regPassword) {
        this.regEmail = regEmail;
        this.regPassword = regPassword;
    }

    void validate() {

        System.out.print("Enter Login Email: ");
        logEmail = scan.next();

        System.out.print("Enter Login Password: ");
        logPassword = scan.next();

        if (logEmail.equals(regEmail) && logPassword.equals(regPassword)) {
            System.out.println("\nLogin Successful");
        } else {
            System.out.println("\nInvalid Username or Password");
        }
    }
}