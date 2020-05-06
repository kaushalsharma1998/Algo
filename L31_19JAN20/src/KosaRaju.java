import java.util.ArrayList;
import java.util.Stack;



public class KosaRaju {

public  static class  Edge {
		
		int v=0;
		int w=0;
		Edge(int v,int w)
		{
		  this.v=v;
		  this.w=w;
		}
	}
	
	 public static ArrayList<ArrayList<Edge>>graph=new ArrayList<ArrayList<Edge>>();
	
	
	public static void constructgraph( int edge)
	{ 
		
	
		for (int i=0;i<edge; i++)
		 
		graph.add( new ArrayList<Edge>());
		  
		
		addedge(1, 0,7); 
	    addedge(0, 2,7); 
	    addedge(2, 1,7); 
	    addedge(0, 3,7); 
	    addedge(3, 4,7); 
	  	}
	public static void addedge(int u ,int v ,int w)
	{  if(v<0||u<0||v>=graph.size()||u>=graph.size())
		return;
	
		graph.get(u).add(new Edge(v,w));
		//graph.get(v).add(new Edge(u,w));
		
	}
	public static void display(){
		for(int i=0;i<graph.size();i++){
			System.out.print(i+"->");	
		for(Edge e:graph.get(i)){
			
			System.out.print("(" + e.v+ ","+e.w+")" );
		}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Edge>>graphrev=new ArrayList<ArrayList<Edge>>();
	public static void constructgraphrev( int edge)
	{ 
		
	
		for (int i=0;i<edge; i++)
		 
		graphrev.add( new ArrayList<Edge>());
		  
		
		addedgerev(0, 1,7); 
	    addedgerev(2, 0,7); 
	    addedgerev(1, 2,7); 
	    addedgerev(3, 0,7); 
	    addedgerev(4, 3,7); 
	  	}
	public static void addedgerev(int u ,int v ,int w)
	{  if(v<0||u<0||v>=graphrev.size()||u>=graphrev.size())
		return;
	
		graphrev.get(u).add(new Edge(v,w));
		//graph.get(v).add(new Edge(u,w));
		
	}

	public static void displayRev(){
		for(int i=0;i<graphrev.size();i++){
			System.out.print(i+"->");	
		for(Edge e:graph.get(i)){
			
			System.out.print("(" + e.v+ ","+e.w+")" );
		}
			System.out.println();
		}
	}
	public static void kosaRaju()
	{
		 Stack<Integer>stack=new Stack<Integer>();
		 boolean vis[]=new boolean[graph.size()];
	 
		 for(int i=0;i<graph.size();i++)
	 {
		 if(!vis[i])
		 {
			 topo(i, vis,stack);
		 }
	 }
	 
	System.out.println(stack);
	int count=0;
	boolean visRev[]=new boolean[graph.size()];
	constructgraphrev(5);
	displayRev();
	while(stack.size()!=0) 
	{
		int rtvx=stack.pop();
		if(!visRev[rtvx])
			{ count++;
			dfs(rtvx, visRev );}
	}	
	
	System.out.println("count is "+count);
	}

	public static void dfs(int rtvx, boolean[] visRev) 
	{
		visRev[rtvx]=true;
		for(Edge e:graphrev.get(rtvx))
		{
			if(!visRev[e.v])
			{
				dfs(e.v, visRev);
			}
		}
		
	}
	public static void topo(int vtx, boolean vis[],Stack<Integer>stack)
	{
	 
		 vis[vtx]=true;
	 for(Edge e:graph.get(vtx))
	 {
		 if(!vis[e.v])
		 {
			 topo(e.v, vis,stack);
		 }
	 }
	 
	stack.add(vtx);
	}

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			constructgraph(5);
			display();
			kosaRaju();
		
	 }
}

