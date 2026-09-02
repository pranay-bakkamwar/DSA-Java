package LinkedList;


public class NodeofLinkedList {
    public static void main(String[] args) {

        Node a =new Node(10);
        Node b =new Node(20);
        Node c =new Node(30);
        Node d =new Node(40);
        Node e =new Node(50);

        //linking of singly linked list
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //FOR PRINTING THE VALUE
        System.out.println(a.val);

        //THIS IS NOTHING BUT
        // A.NEXT = B --> B.NEXT = C --> C.VAL = 30
        System.out.println(a.next.next.val);


        /*/
        THIS WILL EVENTUALLY PRINT THE SAME REFRENE ADRESS CAUSE A.NEXT
        IS UNTIMATELY B AND B IS ALSO HAVING THE  SMA REFRENCE THERE FORE
        THIIS IS THE REAON
         */
        System.out.println(a.next);
        System.out.println(b);


        //the value of last node will be null
        System.out.println(e.next);

    }


}
