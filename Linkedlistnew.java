public class Linkedlistnew {
    // linked list will be containing the data and the address of the next node

    //to end the linkedlist we can definthe address of the next node as NULL

    //we have to use the reference variable

    //reference variables will point towords the object
    // class node
    // {
    //     int data;
    //     //reference variable will be of type class node

    //     node next;

    //     public node(int data)
    //     {
    //         this.data=data;
    //         this.next=NULL;

    //     }

    // }


    public static class Node{

        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        //above code represents the node

    }

    public static Node head;
    public static Node tail;
    // define a function to do particular tasks such as adding,removing ,adding at the end and printing the linked list

    public static void addfirst(int data)
    {
        // create a newnode
        Node newnode= new Node(data);

        if(head==null)
        {
            head=tail=newnode;
            
            
        }
        // point to head
        newnode.next=head;
        // define newnode as head;
        head=newnode;
    }


    public static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
    public static void addlast(int data)
    {
        // create node
        Node newnode=new Node(data);
        if(tail==null)
        {
            tail=newnode;
        }
        else{

            tail.next=newnode;
            tail=newnode;
        }
        
    }
    public static void main(String args[])
    {
        // if we have the head node we can traverse the complete linked list wth the help of the next node address
        // if next of head node is NULL then it will have only one node
        Linkedlistnew l1= new Linkedlistnew();

        l1.head=new Node(1);
        l1.head.next= new Node(2);

        // we make proper methods for the operations in linked list


        // Adding to the first of the linkedlist
        // create a new node
        // new nodes next is equal to head
        // head=newnode
        l1.addfirst(1);
        l1.addfirst(2);
        // add first wad O(1) time complexity

        l1.print(head);


        // adding last

        // create the node
        // tail.next equal to the newnode  tail.next=newnode
        // tail was new node
        System.out.println(tail);
        l1.addlast(3);
        l1.addlast(4);
        // complexity od O(1) constant time operation

        // printing a linked list
        System.out.println("\n\n\n\n");
        l1.print(head);







    }
    
}
