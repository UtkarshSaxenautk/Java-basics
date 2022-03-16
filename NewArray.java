import java.util.Scanner ;
public class NewArray {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = myObj.nextInt();
        System.out.println("You picked size : " + size);
            int numbers[];
            numbers = new int[size];
        for(int i = 0 ; i < size; i++)
        {
           int temp = myObj.nextInt();
           numbers[i] = temp ;
        }
        myObj.close();
        for( int j = 0 ; j < size ; j++)
        {
            System.out.println("Numbers[" + j + "] = " + numbers[j]);
        }
        

    }
}
