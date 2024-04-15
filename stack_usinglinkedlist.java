public class stack_usinglinkedlist {

    static class Node{
        int data;
        Node next;


        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static class Stack
    {
        public static Node head=null;


        public static boolean isempty()
        {
            if(head==null)
            {
                return true;
            }
            else{
                return false;
            }
        }
        // basically pushbwas a add first and pop was remive first operations

        public static void push(int data)
        {
            Node newnode = new Node(data);
            if(head==null)
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }

        public static int pop()
        {
            if(isempty())
            {
                return -1;

            }
            else{
                int top=head.data;
                head=head.next;
                return top;
            }
            

        }

        public static int peek()
        {
            if(isempty())
            {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[])
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isempty())
        {
            System.out.println(s.pop());
        }
    }
    
}
