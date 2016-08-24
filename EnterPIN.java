import java.util.Scanner;

public class EnterPIN
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        int pin=1234;
        
        System.out.println("WELCOME TO INDIAN BANK");
        System.out.println("Enter your PIN: ");
        int entry=keyboard.nextInt();
        
        while(entry!=pin)
        {
            System.out.println("\n INCORRECT PIN. TRY AGAIN");
            System.out.println("Enter your PIN: ");
            entry=keyboard.nextInt();
        }
        
        System.out.println("\n PIN ACCEPTED. YOU CAN ACCESS YOUR ACCOUNT");
    }
}