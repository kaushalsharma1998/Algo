
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;



public class Kruskals {
	
	public static class Edge {
        int v = 0;
        int w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }			
	public static ArrayList<ArrayList<Edge>>graph=new ArrayList<ArrayList<Edge>>();
	public static ArrayList<ArrayList<Edge>>kgraph=new ArrayList<ArrayList<Edge>>();
	
	public static void  constructgraph(int edge)
	{  System.out.println(graph.size());
	
		for (int i=0;i<edge; i++)
		{ 
			graph.add( new ArrayList<Edge>());
		
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
	
	public static void  kconstructgraph(int edge)
	{  
	
		for (int i=0;i<edge; i++)
		{ 
			kgraph.add( new ArrayList<Edge>());
		
		}
			
		
	}
	public static void kaddedge(int u ,int v ,int w)
	{  if(v<0||u<0||v>=kgraph.size()||u>=kgraph.size()){
		return;
	}
		kgraph.get(u).add(new Edge(v,w));
		kgraph.get(v).add(new Edge(u,w));
		
	}
	public static void kdisplay(){
		for(int i=0;i<kgraph.size();i++){
			System.out.print(i+"->");	
		for(Edge e:kgraph.get(i)){
			
			System.out.print("(" + e.v+ ","+e.w+")" );
		}
			System.out.println();
		}
	
	}
	public static void merge(int p1,int p2,int par[],int size[])
	{
		if(size[p1]<size[p2])
		{	par[p1]=par[p2];
			size[p2]+=size[p1];
		}
		else {
			par[p2]=par[p1];
			size[p1]+=size[p2];
	}
	}
	public static int findParent(int vtx,int par[])
	{
		if(par[vtx]==vtx)
			return vtx;
		par[vtx]=findParent(par[vtx], par);
		return par[vtx];
	}

	public static class Dpair implements Comparable<Dpair>
	{
		int vtx;
		int parent ;
		int wt;
		int wtsf;
		String path;
		public Dpair(int vtx, int parent, int wt) {
			
			this.vtx = vtx;
			this.parent = parent;
			this.wt = wt;
			
		}
		@Override
		public int compareTo(Dpair o) {
			// TODO Auto-generated method stub
			return this.wt-o.wt;
		}
	}
		public static void kruskals_( )
		{	int[] size=new int[graph.size()];
			Arrays.fill(size, 1);
			int[] par=new int[graph.size()];
			for(int i=0;i<graph.size();i++)
				par[i]=i;
			PriorityQueue<Dpair>que=new PriorityQueue<Kruskals.Dpair>();
			que.add(new Dpair(0,1,10));
			que.add(new Dpair(0,3,10));
			que.add(new Dpair(1,2,10));
			que.add(new Dpair(2,3,40));
			que.add(new Dpair(3,4,02));
			que.add(new Dpair(4,5,02));
			que.add(new Dpair(5,6,8));
			que.add(new Dpair(4,6,03));
			

			kconstructgraph(7);
			while(!que.isEmpty())
			{
				Dpair rtvx=que.remove();
				int p1=findParent(rtvx.parent, par);
				int p2=findParent(rtvx.vtx, par);
				if(p1!=p2)
				{
					merge(p1, p2, par, size);
					kaddedge(rtvx.parent, rtvx.vtx, rtvx.wt);
				}
			
			}
		System.out.println();	
		kdisplay();
		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructgraph(7);
		display();
		kruskals_();
	}

}
