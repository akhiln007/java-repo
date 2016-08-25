import java.util.Scanner;

public class AddingValues
{
    public static void main(String args[])
    {
        Scanner keyboard=new Scanner(System.in);
        int sum=0;
        
        System.out.println("Enter the number for addition.");
        System.out.println("Enter zero(0) to exit");
        int num=keyboard.nextInt();
        
        while(num!=0)
        {
            sum=sum+num;
            System.out.println("The Total Sum is: "+sum);
            System.out.println("Enter the number for addition.");
            System.out.println("Enter zero(0) to exit");
            num=keyboard.nextInt();            
        }
    }
}