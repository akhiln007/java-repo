import java.util.Scanner;

public class BabyNim
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        int pile1=3,pile2=3,pile3=3;
        char logical_test;
        do
        {
            System.out.println("A: "+pile1+" B: "+pile2+" C: "+pile3);
            System.out.println("Choose a pile: ");
            char c=keyboard.next().charAt(0);
            c=Character.toUpperCase(c);
            System.out.println("How many to remove from a pile: ");
            int n=keyboard.nextInt();
            if(c=='A')            
                pile1=pile1-n;
            else if(c=='B')
                pile2=pile2-n;
            else if(c=='C')
                pile3=pile3-n;
            else
                System.out.println("Invalid Pile, Please enter a valid pile name");                            
            
            if(pile1<=0 && pile2<=0 && pile3<=0)
                logical_test='Y';
            else
                logical_test='N'; 
            
        }while(logical_test!='Y');
        
        System.out.println("A: "+pile1+" B: "+pile2+" C: "+pile3);
        System.out.println("All piles are empty. Good job");
    }
}