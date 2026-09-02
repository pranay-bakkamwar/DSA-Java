package LinkedList;

import OOPS.StaticKeyword;




public class DisplayList {
    public static void display(Node head){



        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();


      /*
          for (Node temp=head;temp!=null;temp=temp.next){
          System.out.println(temp.val+" ");
         }
        */

        /*
this is false practice
        System.out.print(head.val+" "+head.next.next+"-->");
        System.out.print(head.next.val+" "+head.next.next+"-->");
        System.out.print(head.next.next.val+" "+head.next.next.next+"-->");
        System.out.print(head.next.next.next.val+" "+head.next.next.next.next+"-->");
        System.out.print(head.next.next.next.next.val+" "+head.next.next.next.next.next+"-->");
*/


    }
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b =new Node(20);
        Node c =new Node(30);
        Node d =new Node(40);
        Node e =new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
//        System.out.println(a.val);
    }
}
