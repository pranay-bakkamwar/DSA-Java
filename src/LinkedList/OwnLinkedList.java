package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class linkedlist {
    Node head;
    Node tail;
    int size;
    void addhead(int i) {
        Node temp = new Node(i);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addtail(int i) {

        if (tail == null) {
            addhead(i);
            return;
        } else {
            Node temp = new Node(i);
            tail.next = temp;
            tail = temp;
            size++;
        }
    }
    void deletefromhead() {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
                size--;
            }
            size--;
        }
    }
    void display() {
        if (head == null) {
            System.out.println("empty linkedlist");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public int get(int k) {
        Node temp = head;
        // Fixed: The original loop (i <= k) skipped the actual index 'k'
        // because it moved 'next' one extra time. Changing to (i < k) fixes it.
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index " + k + " is out of bounds.");
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Index " + k + " is out of bounds.");
        }
        return temp.val;
    }
    public int search(int i) {
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if (temp.val==i){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;

    }
    void insert(int val, int idx) {
        if (idx>size||idx<0) {
            System.out.println("this is invalid index");
            return;
        }
        if(idx==size)addtail(val);
        if (idx==0)addhead(val);

    Node temp =head;

        for (int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        Node t=new Node(val);
        t.next=temp.next;
        temp.next=t;
        size++;
    }
    public void delete(int idx) {
         if (idx<0||idx>=size){
             System.out.println("invalid index");
             return;
         }
        if (idx==0){
            deletefromhead();
            return;
        }

        Node temp =head;
        for(int i = 1; i <= idx-1 ;i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1)tail=temp;
        size--;
    }


}

public class OwnLinkedList {
    public static void main(String[] args) {
        System.out.println("Instance created");
        linkedlist l1 = new linkedlist();
        linkedlist l2 = new linkedlist();

        System.out.println("initialization");
        l1.addhead(10);
        l1.addtail(20);
        l1.addtail(40);
        l1.addtail(50);
        l1.addtail(60);
        l1.insert(30,2);

/*
        System.out.println("display in progress");
        l1.display(); // Output: 10 20 30 40 50

        System.out.println("we are removing head");
        l1.deletefromhead();

        System.out.println("displaying the deleted item ");
        l1.display(); // Output: 20 30 40 50

        System.out.println("adding head again");
        l1.addhead(10);

        System.out.println("displaying the original list back");
        l1.display(); // Output: 10 20 30 40 50

        System.out.println("get element at index 3:");
        System.out.println(l1.get(3)); // Output: 40
        System.out.println(l1.size);

        System.out.println(l1.search(10));

        //inserting element
        l1.insert(30,-1);

*/


        l1.delete(3);
        l1.display();
    }
}
