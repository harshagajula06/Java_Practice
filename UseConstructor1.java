import java.util.Scanner;

class UseConstructor1 {

    public static void main(String[] args) {

        int a, b, c;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a value: ");
            a = scan.nextInt();
            
            System.out.print("Enter b value: ");
            b = scan.nextInt();
            
            System.out.print("Enter c value: ");
            c = scan.nextInt();
            
            Constructor1 c1 = new Constructor1(a, b, c);
            
            c1.logic();
        }
    }
}