package Binary_Trees;

public class productoftree {
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

        System.out.println(producof(a));
    }

    private static int producof(Node root) {
        if (root==null) return 1;
        return root.val*producof(root.left)*producof(root.right);
    }
}
