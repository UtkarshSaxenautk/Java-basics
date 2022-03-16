import java.util.Scanner;
public class Guessgame {
    public static void main(String[] args){
        System.out.println("Welcome to Guess game : ------");
        System.out.println("\n " + "Enter the option----");
        System.out.println(" \n" + "1.)Click here if want to play : === ");
        System.out.println(" \n" + "2.)Click here if want to end : === ");
        Scanner myObj = new Scanner(System.in);
        int opt  = myObj.nextInt();
        if(opt == 1){
           int max = 50;
           int min = 10;
           System.out.println("\n Number is between : " + min + " and " + max);
           int  trail = 0 ;
           int  actual = (int) (Math.random()* (max - min + 1) + min) ;
           System.out.println("Enter number : ");
           System.out.println("\n");
           int number = myObj.nextInt();
           while(trail <= 6){
               //System.out.println("Write number ; ----------");
             
            switch(trail){
                   case 0 :
                   case 1 :
                   case 2 :
                   case 3 :
                   case 4 : 
                   case 5 :
                           if(actual == number){
                           System.out.println("\n You choosed right number : " + number + "\n " + "Horray won the game ");
                            break ;
                            }
                           else if(actual > number){
                           System.out.println("\n You choosed lower number try again ----");
                           System.out.println("\n");
                           number = myObj.nextInt();
      
                           }
                          else if(actual < number){
                          System.out.println("\n You choosed higher number try again ----");
                          System.out.println("\n");
                           number = myObj.nextInt();
                          }
                        }
                  if(trail >= 6){
                  System.out.println("Out of chances try again : ========");
                  break ;
                  }
            trail++;
            }
            
        }     
        
        else if(opt == 2){
            System.out.println("\n" + "You choose to exit game thanks for playing ");
        }

        else{
            System.out.println("\n You choosed wrong option");
        }
        myObj.close();
    } 
}
