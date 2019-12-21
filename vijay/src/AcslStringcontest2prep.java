public class AcslStringcontest2prep {
    package vijay;

import java.util.Scanner;

    public class ACSLstring {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner s = new Scanner(System.in);
            String a= s.nextLine();// creating the string


// creating the indexes
            int b= s.nextInt();
            int c= s.nextInt();

            int d= s.nextInt();
            int e= s.nextInt();
            int f= s.nextInt();
            int g= s.nextInt();
            int h= s.nextInt();
            int i= s.nextInt();
            int j= s.nextInt();
            int k= s.nextInt();
            /*if( b<0||c<0||d<0||e<0||f<0||g<0||h<0||i<0||j<0)
            {
                b= a.length()-b;
                c= a.length()-c+1;

                d= a.length()+d;
                e= a.length()+e+1;
                f= a.length()+f;
                g= a.length()+g+1;
                h= a.length()+h;
                i= a.length()+i+1;
                j= a.length()+j;
                k= a.length()+k+1;
            }

             */

            System.out.print(a.substring(b,c));
            System.out.print(a.substring(d,e));
            System.out.print(a.substring(f,g));
            System.out.print(a.substring(h,i));
            System.out.print(a.substring(j,k));




            s.close();

        }

    }

}
