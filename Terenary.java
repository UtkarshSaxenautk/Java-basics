import java.util.Scanner;
public class Terenary {
    public static void main(String[] args){
        int a ;
        int b ;
        System.out.println("Enter the value of a : " );
        Scanner myObj = new Scanner(System.in);
        a = myObj.nextInt();
        System.out.println("Enter the vaue of b : ");
        b = myObj.nextInt();
        myObj.close();
        
        String result = a + b > 10 ? "Yes we got it"    : "Try again";
        System.out.println(result);
     
        
    }
}
