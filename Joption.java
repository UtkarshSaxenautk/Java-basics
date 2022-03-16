import javax.swing.JOptionPane;


public class Joption {
    public static void main(String[] args) {
       String sname ;
       String lname ;

       sname = JOptionPane.showInputDialog("Enter the first name : ");
       lname = JOptionPane.showInputDialog("Enter the last name : ");

       JOptionPane.showMessageDialog(null , "Hello " + sname + " " + lname);
       int n1 ;
       int n2 ;
       String input1 = JOptionPane.showInputDialog("Enter the number 1 : ");
       n1 = Integer.parseInt(input1);
       String input2 = JOptionPane.showInputDialog("Enter the number 2 : ");
       n2 = Integer.parseInt(input2);

       double av = (n1 + n2) / 2.0 ;
      JOptionPane.showMessageDialog(null , "Average of numbers " + n1 + " and " + n2 + " = " + av );

      System.exit(0);

   }
}
