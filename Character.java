public class Character {
       public static void main(String[] args) {
           char c1 , c2 , c3 ;
           c1 = 'X';
           c2 = 'G';
           System.out.println(" c1 = " + c1 + " c2 = " + c2);
           c1++ ;
           c2 =  (char) ((char) c2 + 2) ;
           c3 = (char) (c2 + 6) ;
           System.out.println(" c1 = " + c1 + " c2 = " + c2
           + " c3 = " + c3);

       } 
    }
    
