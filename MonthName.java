
public class MonthName
{
    public static void main(String[] args)
    {
        System.out.println("Month 1: "+month_name(1));
        System.out.println("Month 2: "+month_name(2));
        System.out.println("Month 3: "+month_name(3));
        System.out.println("Month 4: "+month_name(4));
        System.out.println("Month 5: "+month_name(5));
        System.out.println("Month 6: "+month_name(6));
        System.out.println("Month 7: "+month_name(7));
        System.out.println("Month 8: "+month_name(8));
        System.out.println("Month 9: "+month_name(9));
        System.out.println("Month 10: "+month_name(10));
        System.out.println("Month 11: "+month_name(11));
        System.out.println("Month 12: "+month_name(12));
        System.out.println("Month 40: "+month_name(40));
    }
    
    public static String month_name(int mon)
    {
        if(mon==1)
            return "January";
        else if(mon==2)
            return "February";
        else if(mon==3)
            return "March";
        else if(mon==4)
            return "April";
        else if(mon==5)
            return "May";
        else if(mon==6)
            return "June";
        else if(mon==7)
            return "July";
        else if(mon==8)
            return "August";
        else if(mon==9)
            return "September";
        else if(mon==10)
            return "October";
        else if(mon==11)
            return "November";
        else if(mon==12)
            return "December";
        else
            return "Error";
    }
}