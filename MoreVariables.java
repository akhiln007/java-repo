public class MoreVariables
{
    public static void main(String[] args)
    {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;
        
        myName="Akhil Narayanan Nair";
        myAge=36;
        myHeight=170;//centimeters
        myWeight=72;
        myEyes="Black";
        myTeeth="White";
        myHair="Black";
        
        System.out.println("Let's talk about "+myName+".");
        System.out.println("He's "+myHeight+ " centimeters tall.");
        System.out.println("He's "+myWeight+ " kilograms heavy.");
        System.out.println("He's got "+myEyes+ " eyes and " +myHair+ " hair.");
        System.out.println("His teeth are usually "+myTeeth+" depending on the coffee.");
        System.out.println("If I add "+myAge+", "+myHeight+", and "+myWeight+" I get "+(myAge+myHeight+myWeight)+".");
    }
}