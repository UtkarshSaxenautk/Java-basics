import java.util.Scanner;
public class palindromebyfunction {
    public static void checkpalindrome(String s){
       int low = 0 ;
       int high = s.length() - 1;
       boolean b = true ;
       while(low < high){
           if(s.charAt(low) != s.charAt(high)){
               b = false ;
               break;
           }
           low++;
           high--;
       }

       if(b == true){
           System.out.println( s + " is Palindrome");
       }
       else{
           System.out.println(s + " is not palindrome");
       }
    }

    public static void main(String[] args){
        System.out.println("Enter the string : ");
        Scanner myObj = new Scanner(System.in);
        String str = myObj.nextLine();
        myObj.close();
        checkpalindrome(str);
    }
}
