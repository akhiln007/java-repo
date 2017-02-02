import java.math.BigDecimal;

public class BigDecimalTest {
    
    public static void main(String args[]){
        double value=1.2;
        double pSum=value+value+value;
        
        System.out.println("Sum of primitives is: "+pSum);
        
        String strValue=Double.toString(value);
        System.out.println("strValue: "+strValue);
        BigDecimal bigValue=new BigDecimal(strValue);
        
        BigDecimal bSum=bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of big decimals: "+bSum.toString());
    }

}
