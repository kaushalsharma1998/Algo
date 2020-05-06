import java.util.ArrayList;
import java.util.PriorityQueue;



public class Prims {
	public static class Edge
	{
		int v;
		int w;
		Edge(int v,int w)
		{
			this.v=v;
			this.w=w;
		}
	}
	public static ArrayList<ArrayList<Edge>>graph=new ArrayList<ArrayList<Edge>>();
	public static ArrayList<ArrayList<Edge>>pgraph=new ArrayList<ArrayList<Edge>>();
	public static void constructgraph(ArrayList<ArrayList<Edge>>graphc,int edge)
	{
		for(int i=0;i<edge;i++)
		graphc.add(new ArrayList<Prims.Edge>());
		addedge(graphc,0,1,10);
		addedge(graphc,0,3,10);
		addedge(graphc,1,2,10);
		addedge(graphc,2,3,40);
		addedge(graphc,3,4,2);
		addedge(graphc,4,5,2);
		addedge(graphc,5,6,8);
		addedge(graphc,4,6,3);	
	
	}
	public static  void addedge(ArrayList<ArrayList<Edge>>graphc,int u,int v,int w)
	{
		if(u>=graphc.size()||v>=graphc.size()||u<0||v<0)
		{
			return;
		}
		graphc.get(u).add(new Edge(v, w));
		graphc.get(v).add(new Edge(u, w));
	}
	
	public static void display(ArrayList<ArrayList<Edge>>graphc){
		for(int i=0;i<graphc.size();i++){
			System.out.print(i+"->");	
			for(Edge e:graphc.get(i)){
		
		System.out.print("(" + e.v+ ","+e.w+")" );
		}
			System.out.println();
		}

	}
	public static class Dpair implements Comparable<Dpair>{
		int vtx;
		int parent ;
		int wt;
		int wtsf;
		public Dpair(int vtx, int parent, int wt, int wtsf) {
			
			this.vtx = vtx;
			this.parent = parent;
			this.wt = wt;
			this.wtsf = wtsf;
		}
		@Override
		public int compareTo(Dpair o) {
			// TODO Auto-generated method stub
			return this.wt-o.wt;
			
		}
	}
		public static void prims()
		{	for(int i=0;i<7;i++)
			pgraph.add(new ArrayList<Prims.Edge>());
		
			PriorityQueue<Dpair>que=new PriorityQueue<Prims.Dpair>();
			que.add(new Dpair(0, -1, 0, 0));
			
			boolean vis[]=new boolean[graph.size()];
			while(que.size()!=0)
			{   Dpair rpair= que.remove();
				
				if(vis[rpair.vtx])
				{
					continue;
				}
				if(rpair.parent!=-1)
				{
					addedge(pgraph, rpair.parent, rpair.vtx, rpair.wt);
				}
			vis[rpair.vtx]=true;
			for(Edge e:graph.get(rpair.vtx))
			{
				if(!vis[e.v])
					que.add(new Dpair(e.v, rpair.vtx, e.w, rpair.wtsf+e.w));
			}
			}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructgraph(graph, 7);
		display(graph);
		System.out.println();
		prims();
		display(pgraph);
	}

}
