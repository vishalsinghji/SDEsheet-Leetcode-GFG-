package Tree;

public class LeftView {
    
    static void leftview(Node root)
    {
        
    }
    
    public static void main(String[] args) {
        Node root = new Node(10); // For Empty Tree Node root=null;
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
       leftview(root);
    }
    
}
