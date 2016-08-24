import java.util.Random;

public class DiceDoubles
{
    public static void main(String[] args)
    {
        Random r=new Random();
        int x=1+r.nextInt(10);
        int y=1+r.nextInt(10);
        System.out.println("Roll #1: "+x);
        System.out.println("Roll #2: "+y);
        System.out.println("The total is: "+(x+y));
        while(x!=y)
        {
            x=1+r.nextInt(10);
            y=1+r.nextInt(10);
            System.out.println("Roll #1: "+x);
            System.out.println("Roll #2: "+y);
            System.out.println("The total is: "+(x+y));
        }
        
    }
}