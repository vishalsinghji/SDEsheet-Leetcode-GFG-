import java.util.*;
/**
 * AdjaencyMatrix
 */
public class AdjaencyMatrix {
    private boolean adjMatrix[][];
    private int numVertices;

    // Initalize the Matrix
    public AdjaencyMatrix(int numVertices){
        this.numVertices=numVertices;
        adjMatrix=new boolean[numVertices][numVertices];
    }

    // Add Edges
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Remove Edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++){
            s.append(i + ": ");
            for(boolean j: adjMatrix[i]){
                s.append((j? 1:0)+" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of vertices\n");
        int n=sc.nextInt();
        AdjaencyMatrix g = new AdjaencyMatrix(n);

        System.out.println("Enter the no. of edges between nodes");
        int edges=sc.nextInt();
        System.out.println("Enter the nodes where edges lies : \n");
        for(int i=0;i<edges;i++)
        { 
            int a=sc.nextInt();
            int b=sc.nextInt();
            g.addEdge(a, b);
        }
        
        System.out.print(g.toString());
        sc.close();
    }
}