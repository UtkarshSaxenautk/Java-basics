import java.util.Scanner;



//import java.util.Scanner;
 public class bitwiseoperator {
    

    public static void main(String[] args)
    {
        Scanner myObj =  new Scanner(System.in);
        System.out.println("Enter the number a : ");
        int a = myObj.nextInt();
        System.out.println("Enter the number b : ");
        int b = myObj.nextInt();

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

       myObj.close();
       int c = a|b ;
       System.out.println(Integer.toBinaryString(c));
       int d = ~a ;
       System.out.println(" d = ~a(" + d + ")");
       System.out.println("d  = " + Integer.toBinaryString(d));
       
      int e = a & b ;
      System.out.println("e = a & b = " + e);
      System.out.println("e  = " + Integer.toBinaryString(e));


      int f = a ^ b ;
      System.out.println(" f = (a ^ b ) = " + f );
      System.out.println("f = " + Integer.toBinaryString(f));

      // Left shift 
      int x = 64;
      int y , i ;
      y = x << 2 ;
      i = (byte)( x << 2);

      System.out.println("Originally x = " + x + " with binary number = " + Integer.toBinaryString(x));
      System.out.println("Now y = " + y + " with binary number = " + Integer.toBinaryString(y));
      System.out.println(" i = " + i );

      // Right shift 
      int p = 256 ;
      int q ,  r ;
      q = p >> 2 ;
      r = (byte)(p >> 2);
      System.out.println("Originally p = " + p + " with binary number = " + Integer.toBinaryString(p));
      System.out.println("Now q = " + q + " with binary number = " + Integer.toBinaryString(q));
      System.out.println(" r = " + r );
     

      
    }
}
