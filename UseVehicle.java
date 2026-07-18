import java.util.Scanner;

class UseVehicle
{
    public static void main(String args[]){
        Vehicle[] v = {
            new Bike("KA-01-1234","Pulsar", "Bajaj", "Black", "2020", 150000, 120, true),
            new Car("KA-01-5678", "City", "Honda", "White", "2021", 800000, 180, true)
        };
        Vehicle g =null;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("Vehicle Details:");
            System.out.println("-----------------------");
            System.out.println("""
                               1. Bike
                               2. Car
                               3. Exit""");

            int option;

            System.out.println("Enter your option:");
            option = scan.nextInt();
            switch(option){
                case 1: {
                    g = v[0];
                    break;
                }
                case 2 : {
                    g = v[1];
                    break;
                }
                case 3: {
                    System.out.println("Thankyouu");
                    System.exit(0);
                }
                default:{
                    System.out.println("Invalid options");
                }
            }
        g.display();        
        }
    }
}