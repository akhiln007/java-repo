import java.text.NumberFormat;

public class NumFormatStrings {
    public static void main(String[] args){
        
        //Locale locale=new Locale("da", "DK");
        
        double doubleValue=1_234_567.89;
        
        NumberFormat numF=NumberFormat.getNumberInstance();
        System.out.println("Number: " +numF.format(doubleValue));
        
        NumberFormat curF=NumberFormat.getCurrencyInstance();
        System.out.println("Currency: "+curF.format(doubleValue));
        
        NumberFormat intF=NumberFormat.getIntegerInstance();
        System.out.println("Integer: "+intF.format(doubleValue));
        
    }

}
