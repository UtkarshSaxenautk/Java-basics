import java.util.Scanner;
public class multidimensionalarray {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int array[][] = new int[2][2];
        int mult[][] = new int[4][];
        mult[0] = new int[1];
        mult[1] = new int[2];
        mult[2] = new int[3];
        mult[3] = new int[4];
        for(int i = 0 ; i < 2 ; i++)
        {
            for(int j = 0 ; j < 2 ; j++)
            {
                System.out.println("Enter the array[" + i + "][" + j + "] = " );
                array[i][j] = myObj.nextInt();
            }
        }
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j= 0 ; j < i + 1 ; j++){
               System.out.println("Enter the array[" + i + "][" + j + "] = " );
               mult[i][j] = myObj.nextInt();
            }
        }

        for( int i = 0 ; i < 2 ; i++)
        {
            for(int j = 0 ; j < 2 ; j++)
            {
                System.out.println( array[i][j]  + " " );
            }
        
        }


        for( int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < i + 1 ; j++)
            {
                System.out.println( mult[i][j]  + " " );
            }
            
        }
        myObj.close();

    }
}
