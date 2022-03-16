import java.util.Scanner;
public class Octalnumber {
    public static void main(String[] args){
        // Octal number to normal form 
        String octal ;
        Scanner myObj = new Scanner(System.in);
        octal = myObj.nextLine();
        myObj.close();
        int number[];
        number = new int[octal.length()];
        double temp = 0 ;
        for(int i = 0 ; i < octal.length() ; i++){
        number[i] = Integer.parseInt(String.valueOf(octal.charAt(i)));
        if(number[i] == 0){
            temp = temp + 0 ;
        }
        else {
            int j = octal.length() - 1 - i ;
            temp = temp + (Math.pow(8.0 , j) * number[i]);
        }
        }

        System.out.println("Octal number : " + temp);
    }
}
