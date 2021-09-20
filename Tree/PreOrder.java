package Tree;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
    }
}

public class PreOrder {

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10); // For Empty Tree Node root=null;
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        preorder(root);
    }

}
