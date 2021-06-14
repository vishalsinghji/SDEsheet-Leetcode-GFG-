import java.util.*;
public class AdjencyList {

    static void addEdge(ArrayList<ArrayList<Integer> > adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 

	static void printGraph(ArrayList<ArrayList<Integer>> adj) 
	{ 
		for (int i = 0; i < adj.size(); i++) { 
			for (int j = 0; j < adj.get(i).size(); j++) { 
				System.out.print(adj.get(i).get(j)+" "); 
			} 
			System.out.println(); 
		} 
	} 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V = sc.nextInt(); 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

        System.out.println("Enter the number of Edges \n:");
        int n=sc.nextInt();

        System.out.println("Enter the  adjaency list");
		// Adding edges one by one 
        for(int i=0;i<n;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            addEdge(adj, u, v);
        }

		printGraph(adj); 
        sc.close(); 
    }
    
}
