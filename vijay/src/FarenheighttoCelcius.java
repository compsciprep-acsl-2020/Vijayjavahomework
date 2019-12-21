import java.util.Scanner;public class FarenheighttoCelcius {

    public static double ctof( double x)
    {
        x = (9.0/5.0 * x) - (9.0/5.0 * 32);
        return x;
    }
    public static double ftoc( double y)
    {
        y = (5.0/9.0*y) + 32;
        return y;
    }
public static void main(String[] args )
{
   zz4
40 4
7







77777System.out.println("Enter the number");
   double num = s.nextDouble();
   System.out.println( "Is the number farenheight or celcius. Please type f or c non capitalized" );
   String a = s.next();
   switch(a) {
       case "f":
           double z = ftoc(num);
           System.out.println(z);
           break;


       case "c":
           double y = ctof(num);
           System.out.println(y);
           break;

      // default:
          // System.out.println("try again");
   }



   }

}


