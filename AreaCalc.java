import java.util.Scanner;

public class AreaCalc
{
    public static void main(String[] args)
    {
        System.out.println("1) Triangle");
        System.out.println("2) Rectangle");
        System.out.println("3) Square");
        System.out.println("4) Circle");
        System.out.println("5) Quit");
        System.out.print("Which Shape: ");
        Scanner user_input=new Scanner(System.in);
        int option=user_input.nextInt();
        
        if(option==1)
        {
            System.out.println("Base: 5");
            System.out.println("Height: 6");
            System.out.println("Area of Triangle: "+area_triangle(5,6));
        }
        else if(option==2)
        {
            System.out.println("Length: 10");
            System.out.println("Width: 4");
            System.out.println("Area of Rectangle: "+area_rectangle(10,4));
        }
        else if(option==3)
        {
            System.out.println("Side Length: 9");            
            System.out.println("Area of Square: "+area_square(9));
        }
        else if(option==4)
        {
            System.out.println("Radius: 4");            
            System.out.println("Area of Circle: "+area_circle(4));
        }
        else
        {
            System.out.println("Good Bye");
            //break;
        }
    }
    
    public static double area_circle(int radius)
    {
        double A=Math.PI*Math.pow(radius,2);
        return A;
    }
    
    public static int area_rectangle(int length, int width)
    {
        int A=length*width;
        return A;
    }
    
    public static int area_square(int side)
    {
        int A=side*side;
        return A;
    }
    
    public static double area_triangle(int base,int height)
    {
        double A=(1/2.0)*base*height;
        return A;
    }
    
    
}