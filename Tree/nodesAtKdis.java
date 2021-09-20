package Tree;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
    }
}

public class nodesAtKdis {

    static void NodesAtK(Node root,int k)
    {
        if(root == null) return;
        if(k==0) { System.out.println(root.key+" ");}
        else 
        {
            NodesAtK(root.left, k-1);
            NodesAtK(root.right, k-1);         
        }  
    }

    public static void main(String[] args) {
        Node root = new Node(10); // For Empty Tree Node root=null;
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
      NodesAtK(root,2);
    }
   
}