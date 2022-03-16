import javax.swing.JOptionPane;
public class Boolean {
    public static void main(String[] args)
    {
         boolean b1 = true ; 
         boolean b2 = false ;
         int n ;
         if ((b1 == false && b2 == false)  ){
             n = 0 ;
             JOptionPane.showMessageDialog(null , "N = " +  n);
        }
        else if (b1 == true && b2 == false || b1 == false && b2 == true) {
            n = 3 ;
            JOptionPane.showMessageDialog(null , "N = " + n);
        }
        else {
            n = 6 ;
            JOptionPane.showMessageDialog(null , "N = " + n);
        }
    }
}
