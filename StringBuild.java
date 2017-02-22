import java.util.Scanner;

public class StringBuild {
    public static void main(String[] args){
        
        String s1="Hello";
        String s2="World";
        String s3=s1+", "+s2+"!";
        System.out.println(s3);
        
        StringBuilder sb=new StringBuilder("New Hello")
            .append(", ")
            .append("World")
            .append("!");
        System.out.println(sb);    
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String input=scan.nextLine();
        System.out.println(input);
        
        sb.delete(0,sb.length());
        for(int i=0;i<3;i++){
            input=scan.nextLine();
            sb.append(input + "\n");
        }
        
        System.out.println(sb);
        scan.close();
        
    }

}
