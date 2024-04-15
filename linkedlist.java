public class linkedlist {

    public static class Node
    {
        int data;
        Node next;
        //constructor

        public Node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String args[])
    {
        //we usually store two values of the linkedl list that is head node and tail node
        //with the help of head node we can get data of all the data in the linked list
        //as sonn as we know next value is null it was the last node
        linkedlist l1=new linkedlist();
        l1.head=new Node(1);
        l1.head.next=new Node(2);
        // we will make methods for the various purpposes

        

    }
    
}
