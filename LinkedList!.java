class Node
{
    int data ;
    Node next ;
    Node(int d)
    {
        data = d ;
        next = null ;
    }
}

 class LinkedList{
    public static void main(String[] args)
    {
        Node head = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);

        head.next = temp1 ;
        temp1.next = temp2 ;

        Node temp = head ;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next ;
        }
    }
}

