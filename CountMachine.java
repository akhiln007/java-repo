import java.util.Scanner;

public class CountMachine
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Enter the last number");
        int n=keyboard.nextInt();
        System.out.print("Count to: "+n+"\n");
        for(int i=0;i<=n;i++)
        {
            System.out.print(i+"\t");            
        }
    }
}