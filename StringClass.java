
public class StringClass {
    public static void main(String[] args){
        String s1="My first string";
        System.out.println(s1);
        
        String s2=new String("This is also a string");
        System.out.println(s2);
        
        String s3="Akhil ";
        String s4="Nair";
        String s5=s3+s4;
        System.out.println(s5);
        
        char[] chars={'H','e','l','l','o'};
        String s6=new String(chars);
        System.out.println(s6);
        
        char[] chars2=s6.toCharArray();
        for(char c : chars2){
            System.out.println(c);
        }
    }

}
