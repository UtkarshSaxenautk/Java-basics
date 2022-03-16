import java.util.Arrays;
import java.util.Scanner ;
public class Input {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int input1 = myObj.nextInt();
        int input2 = myObj.nextInt();
        int input3 =  myObj.nextInt();
        if(input1 >= 1000 && input2 <= 9999 && input1 >= 1000 && input2 <= 9999&& input1 >= 1000 && input2 <= 9999 )
        {

        String s1 = Integer.toString(input1);
        String s2 = Integer.toString(input2);
        String s3 = Integer.toString(input3);

        int hun = Integer.parseInt(String.valueOf(s1.charAt(1)));
        int tens = Integer.parseInt(String.valueOf(s2.charAt(2)));
        int arr[] = new int[4];
        for(int i =0 ; i < 4 ; i++)
        {
            arr[i] = Integer.parseInt(String.valueOf(s3.charAt(i)));
        }

        Arrays.sort(arr);

        int max = arr[3];

        int key = (hun * tens) - max ;

         System.out.println(key);

    }
   myObj.close();
        
    }
}
