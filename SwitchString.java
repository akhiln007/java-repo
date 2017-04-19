import java.util.Scanner;

public class SwitchString {

    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Enter month name: ");
        String input=keyboard.nextLine();
        
        switch(input){
            case "Jan":
                System.out.println("This month is 1");
                break;
            case "Feb":
                System.out.println("This month is 2");
                break;
            case "Mar":
                System.out.println("This month is 3");
                break;
            case "Apr":
                System.out.println("This month is 4");
                break;
            default:
                System.out.println("Please enter a valid month name");
                break;
        }
        
        
    }
}
