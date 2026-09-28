package Binary_Trees;


public class sumofbinarytree {
    public static void main(String[] args){

/*                    3
                     / \
                    4   5
                   / \ / \
/*                6  7 8  9




 */
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

        System.out.println(sumof(a));
    }

    private static int sumof(Node root) {

        if(root==null) return 0;
        return root.val + sumof(root.left) + sumof(root.right);
    }
}
