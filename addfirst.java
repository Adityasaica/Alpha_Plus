public class addfirst {

    public static int size;

    public static class Node
    {

        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }

    public static Node head;
    public static Node tail;

    public static void addfirst(int data)
    {
        size++;
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            head.next=null;
        }
        else{
            newnode.next=head;
            head=newnode;

        }
        
    }

    public static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void addlast(int data)
    {
        size++;
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            tail.next=null;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public static void addmiddle(int index,int data)
    {
        size++;
        Node temp=head;
        if(index==0)
        {
            addfirst(data);
            return;

        }
        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        Node newnode=new Node(data);
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static void removefirst()
    {
        if(size==0)
        {
            System.out.println("Ll is Emplty");
            System.out.println(Integer.MIN_VALUE);
        }
        else if(size==1)
        {
            System.out.println(head.data);
            size--;

            head=tail=null;
        }
        else
        {
            head=head.next;
            size--;

        }
        

    }

    public static void removelast()
    {
        if(size==0)
        {
            System.out.println("Linked List is empty");
            System.out.println(Integer.MIN_VALUE);
            return;
        }
        else if(size==1)
        {
            System.out.println(head.data);
            head=null;
            tail=null;
            size--;
            return;
        }
        else
        {
            Node prev=head;
            for(int i=0;i<size-2;i++)
            {
                prev=prev.next;
            }
            System.out.println(prev.next.data);
            prev.next=null;
            tail=prev;
            size--;
            return;
        }

    }
    public static int search(int n)
    {
        int c=0;
        Node temp=head;
        while(temp!=null)
        {
            
            if(temp.data==n)
            {
                return c;
            }
            else{
                temp=temp.next;
                c++;
            }
        }
        return -1;
    }

    public static int recurs(Node head,int key)
    {
        if(head!=null)
        {
            if(head.data==key)
            {
                System.out.println("Key was found  "+key);
                return size;
            }
            else{
                return recurs(head.next,key);
            }
        }
        else{
            System.out.println("Key was Not Found!");
            return -1;
        }
    }

    public static void main(String args[])
    {
        addfirst l=new addfirst();
        l.addfirst(1);
        l.addfirst(2);
        l.print(head);
        System.out.println(tail);
        l.addlast(3);
        // l.print(head);
        // adding in the middle
        // or inserting a node st a particular index
        // we dont need to copy and paste the elememts

        // Add in the middle total will be O(n) but for the operation it was O(1)
        l.addlast(4);
        l.addlast(5);
        l.print(head);

        l.addmiddle(2,6);
        System.out.println("\n\n\n");
        l.print(head);


        // Finding the sizeof a linkedlist
        System.out.println("Size of the linked list is "+l.size);
        // remove operation in linkedlist

        l.removefirst();
        l.print(head);
        
        // remove the elements in the last

        // the removed nodes will be deleted by the garbage collector

        l.removelast();
        l.print(head);

        // searching in the linkedlist;
        System.out.println("at index "+search(3));
       if(search(7)==-1)
       {
        System.out.println("item not Found");
       }


    //    Recursive search in linked list
        System.out.println(recurs(head,3));


    //    reversing of a llinked list

    // iterative approach
    // without using the additional space
    // we need three variables current,previous,next variables
    

       


    }
    
}
