package Tree;
import java.util.*;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
    }
}

public class HeightofTree {
  
    static int height(Node root)
    {
        if(root==null) return 0;
        else
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(10); // For Empty Tree Node root=null;
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
       System.out.println(height(root));
    }
    
}
