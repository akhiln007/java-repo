
public class ExceptionCustom {
    
    public static void main(String[] args){
        
        String welcome="Welcome!";
        char[] chars=welcome.toCharArray();
        
        try {
            
            if(chars.length<10){
                throw (new Exception("My custom message"));
            }
            
            char lastChar=chars[chars.length-1];
            System.out.println(lastChar);
            
            String sub=welcome.substring(10);
            
        } catch (StringIndexOutOfBoundsException e) {
            // TODO Auto-generated catch block
            System.out.println("String index problem");
            
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index problem");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        
    }

}
