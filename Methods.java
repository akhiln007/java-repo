
public class Methods {
    
    static String[] months={"January","February","March","April","May","June","July","August","September","October","November","Dcember"};
    
    public static void main(String[] args){
            loopIt("Months of the Year");
            loopIt("Second Time");
            loopIt("Third Time");
    }
    
    static void loopIt(String label){
        System.out.println(label);
        for(int j=0;j<label.length();j++)
            System.out.print("*");
        System.out.println();
        for(int i=0;i<months.length;i++)
            System.out.println(months[i]);
    }

}
