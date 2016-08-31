import java.util.Scanner;

public class LetterExtract
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Enter the Message");
        String msg=keyboard.nextLine();
        
        int len=msg.length()-1;
        System.out.println("Your message is "+len+" characters long");
        System.out.println("The first character is at position 0 and is "+msg.charAt(0));
        System.out.println("The last character is at position "+len+" and is "+msg.charAt(len));
        
        System.out.println("Here are all the characters, one at a time");
        for(int i=0;i<=len;i++)
            System.out.println(i+" - "+msg.charAt(i));
    }
}