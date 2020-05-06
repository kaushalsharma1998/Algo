import java.util.ArrayList;
import java.util.Stack;


public class Topological {
	
	public static class Edge {
        int v = 0;
        int w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }			
	public static ArrayList<ArrayList<Edge>>graph=new ArrayList<ArrayList<Edge>>(10);
	
	public static void  constructgraph(int edge)
	{ 
	
		for (int i=0;i<edge; i++)
		{ 
			graph.add( new ArrayList<Edge>());
		
		}
		addedge(0, 1, 10);
		addedge(1, 2, 10);
		addedge(2, 3, 10);
		addedge(0, 4, 10);
		addedge(4, 5, 10);
		
		addedge(5, 6, 10);
		addedge(5, 7, 10);
		addedge(7, 8, 10);
		addedge(8, 5, 10);
		addedge(6, 3, 10);
	}
	public static void addedge(int u ,int v ,int w)
	{  if(v<0||u<0||v>=graph.size()||u>=graph.size()){
		return;
	}
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

	
	
	
	public static void topo_()
	{   boolean vis[]=new boolean[graph.size()];
		Stack<Integer>stack= new Stack<Integer>();
		for(int i=0;i<graph.size();i++)
		{
			if(!vis[i])
			{
				topo(i,stack,vis);
			}
		}
	while(stack.size()!=0)
	{
		System.out.print(stack.pop()+" ");
	}
	
	}
	public static void  topo(int vtx,Stack<Integer>stack,boolean vis[])
	{
		vis[vtx]=true;
		for(Edge e:graph.get(vtx))
		{
			if (!vis[e.v])
			{
				topo(e.v,stack,vis);
			}
			
		}
	stack.push(vtx);
	}
	

	public static void topoC_()
	{	boolean res=false;
		boolean vis[]=new boolean [graph.size()];
		boolean visC[]=new boolean[graph.size()];
		Stack<Integer>stack=new Stack<Integer>();
		for(int i=0;i<graph.size();i++)
		{
			if(!vis[i])
			{
				res=res|topoC(i,vis,visC,stack);
			}
			
			
			
		}
		
		while(stack.size()!=0)
		{
			System.out.print(stack.pop()+" ");
		}
	System.out.println(res);
	}
	public static boolean topoC(int vtx,boolean[] vis,boolean[] visC,Stack<Integer>stack)
	{   boolean res=false;
		vis[vtx]=true;
		visC[vtx]=true;
		for(Edge e:graph.get(vtx))
		{
			if(!vis[e.v])
				res=res|topoC(e.v, vis, visC, stack);
			else if (visC[e.v])
				return true;
		}
		stack.push(vtx);
		visC[vtx]=false;
		return res;
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 constructgraph(9);
 display();
 topoC_();
	}

}