import java.util.Scanner;
class SumArray
{
    int[] a = new int[5];
    
    void sum()
    {
    Scanner scan = new Scanner(System.in);

    //Assigning values to the array
    for(int i=0; i<a.length; i++)
    {
        System.out.println("Enter the value of index:"+i);
        a[i] = scan.nextInt();
    }
    int sum =0;
    //Print array values
    for(int i=0; i<a.length; i++)
    {
        sum = sum + a[i];
    }
    System.out.println("Sum of array:"+sum);
    }
}