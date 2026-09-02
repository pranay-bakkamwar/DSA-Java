package LinkedList;



public class getfunction {
    private static int get(Node head, int idx) {
        Node temp=head;

        for (int i=1;i<=idx;i++){
            temp=temp.next;

        }
        return temp.val;




//        Node current = head;
//        int idxcount = 0;
//
//        while (current != null) {
//            if (idxcount == idx) {
//                return current.val;
//            }
//            current = current.next;
//            idxcount++;
//        }
//
//        throw new IndexOutOfBoundsException("Index: " + idx + " is out of bounds.");

    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // This will now correctly output 30 (index 2)
        System.out.println(get(a, 2));
    }
}