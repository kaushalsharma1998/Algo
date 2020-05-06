import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

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
	 public static ArrayList<ArrayList<Edge>>dgraph=new ArrayList<ArrayList<Edge>>();
	 
	
	public static void constructgraph( int edge)
	{ 
		for (int i=0;i<edge; i++)
		{ 
			graph.add( new ArrayList<Edge>());
		   // System.out.println(graph);
	}
	addedge(0,1,10);
	addedge(0,3,10);
	addedge(1,2,10);
	addedge(2,3,40);
	addedge(3,4,2);
	addedge(4,5,2);
	addedge(5,6,8);
	addedge(4,6,3);	
}
	public static void addedge(int u ,int v ,int w)
	{  if(v<0||u<0||v>=graph.size()||u>=graph.size()){
	return;
	}
	graph.get(u).add(new Edge(v,w));
	graph.get(v).add(new Edge(u,w));
	
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
	
	
	public static void constructgraphD( int edge)
	{ 
		for (int i=0;i<edge; i++)
		{ 
			dgraph.add( new ArrayList<Edge>());
		   // System.out.println(graph);
	}
		
}
	public static void addedgeD(int u ,int v ,int w)
	{  if(v<0||u<0||v>=dgraph.size()||u>=dgraph.size()){
	return;
	}
	dgraph.get(u).add(new Edge(v,w));
	dgraph.get(v).add(new Edge(u,w));
	
}
	public static void displayD(){
	for(int i=0;i<dgraph.size();i++){
		System.out.print(i+"->");	
		for(Edge e:dgraph.get(i)){
	
	System.out.print("(" + e.v+ ","+e.w+")" );
	}
		System.out.println();
	}

}

	public static class Dpair implements Comparable<Dpair>
	{
		int vtx;
		int parent ;
		int wt;
		int wtsf;
		String path;
		
		public Dpair(int vtx, int parent, int wt, int wtsf) {
			
			this.vtx = vtx;
			this.parent = parent;
			this.wt = wt;
			this.wtsf = wtsf;
		}
		

		@Override
		public int compareTo(Dpair arg0) {
			// TODO Auto-generated method stub
			return this.wt-arg0.wt;
		}
		
		
	}
	 public static void 	dijsktra( int src)
	{ 	
		constructgraphD(7); 
		int[] dshortest=new int[7];
		PriorityQueue<Dpair>que=new PriorityQueue<Dijkstra.Dpair>();
		que.add(new Dpair(src, -1, 0, 0));
		boolean[] vis= new boolean[graph.size()];
		
		while(que.size()!=0)
		{
			 Dpair rtvx=que.remove();
			 if(vis[rtvx.vtx])
			 {
				 continue;
			 }
		if(rtvx.parent!=-1)
		{
			addedgeD(rtvx.parent, rtvx.vtx, rtvx.wt);
			dshortest[rtvx.vtx]=rtvx.wtsf;
		}
		vis[rtvx.vtx]=true;
		for (Edge e:graph.get(rtvx.vtx))
		{
			if(!vis[e.v])
				que.add(new Dpair(e.v, rtvx.vtx, e.w, rtvx.wtsf+e.w));
		}
		}
	
	System.out.println();
	for(int i:dshortest)
	System.out.print(i+" ");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructgraph(7);
		display();
		dijsktra(0);
		System.out.println();
		displayD();
	}

}
