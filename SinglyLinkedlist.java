
class Node{
    int data ;
    Node next ;
    Node(int d)
    {
        data = d ;
        next = null ;
    }

}

class Test
{
Node head = null ;

public void Insert_At_front(int d)
{
    Node newnode = null ;
    newnode = new Node(d);
    newnode.data = d ;
    newnode.next = null ;
    if(head == null)
    {
       System.out.println("List is empty! Initial position ///////  ");
       head = newnode ;
    }
    else
    {
        newnode.next = head ;
        head = newnode ;
    }
}

public void Insert_At_End(int d)
{
    Node newnode = null ;
    newnode = new Node(d) ;
    newnode.data = d ;
    newnode.next = null ;
    if(head == null)
    {
        System.out.println("List is empty! Initial position ///////  ");
       head = newnode ;

    }
    else
    {
        Node curr = head ;
        while(curr.next != null)
        {
            curr = curr.next ;
        }
        curr.next = newnode ;
        newnode.next = null ;
    }
}

public void Insert_At_Position(int d , int p)
{
  Node newnode = null ;
  newnode = new Node(d);
  newnode.data = d ;
  newnode.next = null ;
  int count = 0 ;
  Node curr = head ;
  Node temp = null; 
  while(curr != null && count < p)
  {
      temp = curr ;
      curr = curr.next ;
      count++ ;
  }
  temp.next = newnode ;
  newnode.next = curr ;
}

public void Delete_At_Front()
{
    if(head == null)
    {
        System.out.println("List is empty");
    }
    else 
    {
        //Node temp = head ;
        head = head.next ;
        
    }
}

public void Delete_At_End()
{
    Node curr = head ;
    Node temp = null ;
    while(curr.next != null)
    {
        temp = curr ;
        curr = curr.next ;
    }
    temp.next = null ;
}

public void Delete_At_position(int k)
{
    Node curr = head ;
    Node temp = null ;
    int count = 0 ;
    while(curr.next != null && count < k)
    {
        temp = curr ;
        curr = curr.next ;
        count++ ;
    }
    temp.next = curr.next ;
}

public void Display()
{
    Node curr = head ;
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

public class SinglyLinkedlist {
   
   public static void main(String[] args) {
       Test T ;
       T = new Test();
       T.Insert_At_front(3);
       T.Insert_At_front(2);
       T.Insert_At_front(1);
       T.Display();
       System.out.println("Inserting in end :  ");
       T.Insert_At_End(7);
       T.Insert_At_End(8);
       T.Display();
       T.Insert_At_Position(5 , 3);
       T.Insert_At_Position(6,4);
       T.Display();
       T.Delete_At_Front();
       T.Display();
       T.Delete_At_End();
       T.Display();
       T.Delete_At_position(2);
       T.Display();
   }
    
}


