class Node
{
    int data ;
    Node next ;
    Node prev ;
    Node(int d)
    {
        data = d ;
        prev = null ;
        next = null ;
    }
}

class Test
{
    Node Head = null ;

    public void Insert_At_Front(int d)
    {
        Node newnode = null ;
        newnode = new Node(d);
        newnode.data = d ;
        newnode.next = null ;
        newnode.prev = null ;
        if(Head == null)
        {
            newnode.next = null ;
            newnode.prev = null ;
            Head = newnode ;
        }
        else
        {
            newnode.next = Head ;
            newnode.prev= null ;
            Head = newnode ;
        }
    }

    public void Insert_At_End(int d)
    {
        Node newnode = null;
        newnode= new Node(d);
        newnode.data = d;
        newnode.next = null ;
        newnode.prev = null ;
        Node curr = Head ;
        while(curr.next != null)
        {
            curr = curr.next ;
        }
        curr.next = newnode ;
        newnode.prev = curr ;
        newnode.next = null ;
    }

    public void Insert_At_Position(int d, int p)
    {
        Node newnode = null ;
        newnode = new Node(d);
        newnode.data = d ;
        newnode.next = null ;
        newnode.prev = null ;
        Node curr = Head ;
        Node temp = null ;
        int count  = 0 ;
        while(curr != null && count < p)
        {
            temp = curr ;
            curr = curr.next ;
            count++ ;

        }
        newnode.prev = temp ;
        temp.next  = newnode ;
        curr.prev = newnode ;
        newnode.next = curr ;
        
    }

    public void Delete_At_Front()
    {
        Node temp = Head.next ;
        temp.prev = null ;
        Head = temp ;
    }


    public void Delete_At_last()
    {
        Node curr = Head ;
        Node temp = null ;
        while(curr.next != null)
        {
           temp = curr ;
           curr = curr.next ;

        }

        temp.next = null ;
    }

    public void Delete_At_Index(int i)
    {
        Node curr = Head ;
        Node temp = null ;
        for(int j = 0 ; j < i && curr.next != null ; j++)
        {
            temp = curr ;
            
            curr = curr.next ;
            
        }

       temp.next = curr.next ;
       (curr.next).prev = temp ;

    }

    public void Display()
    {
        Node curr = Head ;
        System.out.println("List we made : ");
        int count = 0 ;
        while(curr != null)
        {
    
            System.out.println(curr.data + " ");
            curr = curr.next ;
            count++ ;
        }
        System.out.println("No. of nodes : " + count);
    }

}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Test t ;
       t = new Test();
       t.Insert_At_Front(4);
       t.Insert_At_Front(2);
       t.Insert_At_Front(1);
       t.Insert_At_End(6);
       t.Insert_At_End(7);
       t.Insert_At_Position(3, 3);
       t.Insert_At_Position(5, 4);
       t.Display();
       t.Delete_At_Front();
       t.Display();
       t.Delete_At_last();
       t.Display();
       t.Delete_At_Index(2);
       t.Display();
    }
}
