import java.util.Scanner;
class UseEmployee
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter count of employees:");
        int count = scan.nextInt();
        Employee[] e =new Employee[count];

        //Assign the values to the array
        for(int i=0; i<e.length; i++)
        {
            System.out.println("Emplolyee Details:"+(i+1));
            System.out.println("----------------------");
            System.out.println("Enter Employee ID:");
            int id = scan.nextInt();
            System.out.println("Enter Employee Name:");
            String name = scan.next();
            System.out.println("Enter Employee Age:");
            int age = scan.nextInt();
            System.out.println("Enter Employee Department:");
            String dept = scan.next();
            e[i] = new Employee(id,name,age,dept);
        }
        for (Employee e1 : e) {
            e1.display();
        }
    }
}