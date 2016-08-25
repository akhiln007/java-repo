import java.util.Scanner;

public class PinLockout
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        int pin=1234;
        int tries=0;
        
        System.out.println("Welcome to the Bank");
        System.out.print("Enter Your PIN:");
        int entry=keyboard.nextInt();
        tries++;
        
        while(entry!=pin && tries<3)
        {
            System.out.println("Incorrect PIN. Please try again");
            System.out.print("Enter Your PIN:");
            entry=keyboard.nextInt();
            tries++;
        }
        
        if(entry==pin)
            System.out.println("\n PIN Accepted. Now you have access to your account");
        else if(tries>=3)
            System.out.println("Maximum Tries Reached. Account Locked");            
    }
}