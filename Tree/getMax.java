package Tree;

public class getMax {
   static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        else 
        return(Math.max(root.key,Math.max(max(root.left),max(root.right))));    
   }

    public static void main(String[] args) {
        Node root = new Node(10); // For Empty Tree Node root=null;
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
       System.out.println(max(root));
    }
    
}
