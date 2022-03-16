class Node{
    int data ;
    Node next ;
    Node(int d)
    {
        data = d ;
        next = null ;
    }

}

class Test {
    Node head = null ;

    public void Insert_At_Front(int d)
    {
        Node newnode = null ;
        newnode= new Node(d);
        if(head == null)
        {
           head = newnode ;
           newnode.next = head ;
        }
        else
        {
        Node curr = head ;
        
        while(curr.next != head)
        {
            curr = curr.next ;
        }
        curr.next  = newnode ;
        newnode.next = head ;
        head = newnode ;
        }
    }
    public void Display()
    {
        System.out.println("List we made : ");
        int count =0;
        Node curr = head ;
        do
        {
           System.out.println(curr.data);
           curr = curr.next ;
           count++ ;
        }while(curr != head);
        System.out.println("No of nodes : " + count);
    }
}

public class Clinkedlist {
    public static void main(String[] args)
    {
       Test t ;
       t = new Test() ;
       t.Insert_At_Front(4);
       t.Insert_At_Front(5);
       t.Insert_At_Front(6);
       t.Display();

    }
    
}
