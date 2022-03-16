
import java.util.Scanner ;
public class Switch {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String monthdate = myObj.nextLine();
        myObj.close();
        int arr[] = new int[2];
        char a[] = new char[2];
        for(int i = 0 ; i < 2 ; i++){
            a[i] = monthdate.charAt(i);
            arr[i] = Integer.parseInt(String.valueOf(a[i]));
            System.out.println(" arr[" + i + "] : " + arr[i]); 
        }
        int x = 0 ;
        for(int j = 0 ; j < arr.length ; j++){
            x += arr[j];
        }


        
       
        switch(x) {
            case 1:
            System.out.println("Your favourite number is : " + x);
            break;
            case 2:
            System.out.println("Your favourite number is : " + x);
            break;
            case 3:
            System.out.println("Your favourite number is : " + x);
            break;
            case 4:
            System.out.println("Your favourite number is : " + x);
            break;
            case 5:
            System.out.println("Your favourite number is : " + x);
            break;
            case 6:
            System.out.println("Your favourite number is : " + x);
            break;
            case 7:
            System.out.println("Your favourite number is : " + x);
            break;
            case 8:
            System.out.println("Your favourite number is : " + x);
            break;
            case 9:
            System.out.println("Your favourite number is : " + x);
            break;

        }

    }
}
