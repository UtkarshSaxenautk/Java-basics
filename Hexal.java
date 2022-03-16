import java.util.Scanner ;
public class Hexal {
    public static void main(String[] args){
       String hexal  ;
       Scanner myObj = new Scanner(System.in);
       hexal = myObj.nextLine() ;
       myObj.close();
       int number[] ;
       double temp = 0 ;
       number = new int[hexal.length()];
       for(int i = 0 ; i < hexal.length()  ; i++){
           if((int) hexal.charAt(i) >= 65){
               number[i] = (int) hexal.charAt(i);
           }
           else {
               number[i] = Integer.parseInt(String.valueOf(hexal.charAt(i)));
           }

           System.out.println(number[i] + " ");
           if(number[i] == 0){
               temp = temp + 0 ;
           }
           else if(number[i] >= 65){
               number[i] = number[i] - 55 ;
               int j = hexal.length() - 1 - i ;
               temp = temp + (Math.pow(16, j) * number[i]);
           }
           else {
            int j = hexal.length() - 1 - i ;
            temp = temp + (Math.pow(16, j) * number[i]);
           }
       }

       System.out.println("Hexal number = " + temp);


    }
}
