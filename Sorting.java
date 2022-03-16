import java.util.Scanner;
public class Sorting {
    public static void main(String[] args){
         int size ;
         Scanner myObj = new Scanner(System.in);
         System.out.println("Enter the size of array : ");
         size = myObj.nextInt();
         int array[];
         array = new int[size];
         for(int i = 0 ; i < size ; i++)
         {
             int temp = myObj.nextInt();
             array[i] = temp ;
         }
         System.out.println("Here array is :  ");
         myObj.close();
         for( int j = 0 ; j < size ; j++)
         {
            System.out.println("Array[" + j + "] = " + array[j]);
         }
         System.out.println("Now we will sorting : ");
         for(int k = 0 ; k < size ; k++)
         {
             int key = array[k];
             int l = k - 1 ;
             while( l > -1 && array[l] > key)
             {
                 array[l + 1] = array[l];
                 l = l - 1 ;
                 array[l + 1] = key ;
             }
         }
         System.out.println("Sorted Array is : ");
         for(int u = 0 ; u < size; u++)
         {
             System.out.println("Array[" + u + "] = " + array[u] );
         }
    }
}
