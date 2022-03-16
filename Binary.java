import java.util.Scanner ;
public class Binary {
    public static void main( String[] args)
    {
        String s ;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        s = myObj.nextLine();
        myObj.close();
        int numbers[] ;
        numbers = new int[s.length()];
        double temp = 0 ;
        for(int i = 0 ; i < s.length()  ; i++)
        {
         numbers[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
         System.out.println(numbers[i]);
          if(numbers[i] == 0)
          {
              temp =  temp + 0 ;
          }
          else if(numbers[i] == 1)
          {
              double j = s.length()  -1 -  i ;
              temp = temp + (Math.pow(2.0, j) * 1);
          }

        }

        System.out.println("The binary value is for number : " + temp);
        
    }
}