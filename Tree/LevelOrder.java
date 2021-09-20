package Tree;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
    }
}

public class LevelOrder {
    static void level(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (q.size()>1) {
            Node curr = q.poll();
            if(curr==null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10); // For Empty Tree Node root=null;
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        level(root);
    }

}
