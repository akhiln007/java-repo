import java.util.Scanner;

public class Collatz
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter a number");
        int count=0;
        int m=0;
        int n=keyboard.nextInt();
        do
        {
            if(n%2==0)
                n=n/2;
            else
                n=(3*n)+1;
            System.out.print(n+"\t");
            if(n>m)
                m=n;
            count++;
        }while(n!=1);
        System.out.println("\nTerminated after "+count+" counts");
        System.out.println("The largest value was "+m);
    }
}