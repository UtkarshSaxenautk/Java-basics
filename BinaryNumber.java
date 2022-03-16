import java.util.Scanner ;
public class BinaryNumber {

    public static void getbinary(int decimal)
    {
        int binary[] = new int[40];
        int i = 0 ;
        while(decimal > 0){
            binary[i++] = decimal%2 ;
            decimal = decimal/2 ;
        }
        for(int j = i - 1 ; j >= 0 ; j--)
        {
            System.out.print(binary[j]);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value to get binary number : ");
        //double number = myObj.nextDouble();
        int number = myObj.nextInt();
        
        getbinary(number);
        

        myObj.close();
        
    }
}