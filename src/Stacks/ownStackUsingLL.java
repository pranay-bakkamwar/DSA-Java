package Stacks;
class Node{
    int val;
    Node next;

    Node (int val){
        this.val=val;
    }
}
class Mystack{
    Node head;
    int len;

    int peek(){
    return head.val;
    }
    int pop(){
        if(head==null){
            System.out.println("empty");
            return -1;
        }
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    void push(int val){
        Node temp=new Node(val);
        if(len==0) head=temp;
        else{
            temp.next=head;
            head=temp;
        }
        len++;
    }
    void display()  {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}
public class ownStackUsingLL {
    public static void main(String[] args){
        Mystack st=new Mystack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
    }
}
