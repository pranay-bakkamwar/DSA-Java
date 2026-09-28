package Binary_Trees;
class Node{
    int val;
    Node left ;
    Node right ;
    Node (int val){
        this.val=val;
    }
}
public class minoftree {
    public static void main(String[] args){
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(7);
        Node f=new Node(8);
        Node g=new Node(9);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;

        System.out.println(minof(a));

    }

    private static int minof(Node root) {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minof(root.left),minof(root.right)));
    }
}
