import java.util.Scanner;

public class SwitchNum {

    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int input=keyboard.nextInt();
        
        switch(input){
            case 1:
                System.out.println("This month is January");
                break;
            case 2:
                System.out.println("This month is February");
                break;
            case 3:
                System.out.println("This month is March");
                break;
            case 4:
                System.out.println("This month is April");
                break;
            default:
                System.out.println("Please enter a valid month");
                break;
        }
        
        
    }
}
