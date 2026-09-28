package Binary_Trees;

public class maxinbinarytree {
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

        System.out.println(maxof(a));
    }

    private static int maxof(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxof(root.left),maxof(root.right)));
    }
}
