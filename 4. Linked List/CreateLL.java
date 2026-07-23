public class CreateLL {
    public static void main(String[] args) {
        //Manually create a linked list(user define)
        Node a = new Node(10);   //head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);   //tail
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.next);  //b ka address
        System.out.println(b.next);
        System.out.println(b.data);
        System.out.println(c.next);
        System.out.println(d.data);
        System.out.println(e.next);   //null
    }
}
class Node{
    int data;
    Node next;
    Node(int data){     //constructor
        this.data = data;
        this.next = null;    //initially every next of node is null
    }
}