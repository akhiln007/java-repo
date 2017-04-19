
public class Looping {
    public static void main(String[] args){
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        for(int i=0;i<months.length;i++){
            System.out.println(months[i]);
        }
        
        for(int i=months.length-1;i>=0;i--){
            System.out.println(months[i]);
        }
        
        
        for(String m : months){
            System.out.println(m);
        }
        
        int count=0;
        while(count<months.length){
            System.out.println(months[count]);
            count++;
        }
        
        int c=0;
        do{
            System.out.println(months[c]);
            c++;
           }while(c<months.length);
              
    }

}
