import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Enter a numeric value: ");
        float i=keyboard.nextFloat();
        System.out.println("Enter a numeric value: ");
        float j=keyboard.nextFloat();
        
        float sum=i+j;
        System.out.println("The answer is: "+sum);
        
        keyboard.close();
    }

}
