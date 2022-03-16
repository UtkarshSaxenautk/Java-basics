import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter the String: ");
        Scanner myObj = new Scanner(System.in);
        s = myObj.nextLine();
        myObj.close();
        int low = 0 ; 
        int high = s.length()- 1 ;
        
        boolean b = false ;
        while(low < high){
            if(s.charAt(low ) != s.charAt(high)){
                b = false ;
                break;
            }
            else {
                b = true ;
            }
            low++ ;
            high-- ;
        }
        if(b == true){
            System.out.println( s + " is palindrme");
        }
        else {
        System.out.println(s + " is not palindrome");
        }

    }
}
