import java.util.Scanner;

public class CountingFor
{
    public static void main(String args[])
    {
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("The message will be displayed five times");
        System.out.print("Message: ");
        String message=keyboard.nextLine();
        
        for(int n=1;n<=5;n++)
            System.out.println(n+". "+message);
    }
}