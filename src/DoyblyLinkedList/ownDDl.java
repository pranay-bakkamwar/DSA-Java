package DoyblyLinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }

}
class DLL{
    ListNode head;
    ListNode tail;
    int size=0;

    void insertAtHead(int val){

        ListNode temp=new ListNode(val);
        temp.next=head;
        head.prev=temp;
        head=temp;
        size++;
    }
    void insertAtTail(int val){

        ListNode temp=new ListNode(val);
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
        size++;
    }


}
public class ownDDl {
    public static void main(String[] args){
        DLL list=new DLL();

    }
}
