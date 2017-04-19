
public class IfCondition {
    public static void main(String[] args){
        int monthNum=1;
        
        if(monthNum>=1 && monthNum<=3){
            System.out.println("You are in Quarter 1");            
        }else if(monthNum>=4 && monthNum<=6){
            System.out.println("You are in Quarter 2");
        }else if(monthNum>=7 && monthNum<=9){
            System.out.println("You are in Quarter 3");
        }else if(monthNum>=10 && monthNum<=12){
            System.out.println("You are in Quarter 4");
        }else
            System.out.println("That's an unknown month");
    }

}
