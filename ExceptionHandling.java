
public class ExceptionHandling {
    public static void main(String[] args){
        
        String welcome="Welcome!";
        char[] chars=welcome.toCharArray();
        
        try {
            char lastChar=chars[chars.length-1];
            System.out.println(lastChar);
            
            String sub=welcome.substring(10);
            
        } catch (StringIndexOutOfBoundsException e) {
            // TODO Auto-generated catch block
            System.out.println("String index problem");
            
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index problem");
        }
        
    }
}
