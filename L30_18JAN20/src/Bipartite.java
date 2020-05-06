import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class Bipartite {
	
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
		addedge(0,1,10);
		addedge(0,3,10);
		addedge(1,2,10);
		addedge(2,3,40);
		addedge(3,4,2);
		addedge(4,5,2);
		addedge(5,6,8);
		addedge(4,6,3);
		//addedge(2,5,7);
		//addedge(0, 6, 12);
		
		
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
	public static class Pair
	{ 
	
		  int p1, p2;
		  
		  Pair(int a, int  b)
		  {
		    this.p1 = a;
		    this.p2 = b;
		  }
		   int first()
		  {
		    return this.p1;
		  }
		   int second()
		   {
			   return this.p2;
		   }
		  
		}
		
	

	public static boolean bipartite(int vtx,int vis[] )
	{	boolean flag=true;
		Queue<Pair> que= new LinkedList<Pair>();
		que.add(new Pair(vtx,0 ));
		while(que.size()>0)
		{
			Pair rtvx=que.remove();
			if(vis[rtvx.first()]!=-1)
			{
				if (vis[rtvx.first()]!=rtvx.second())
						{
							System.out.println("conflict");
							flag=false;
						}
			continue;
			}
		vis[rtvx.first()]=rtvx.second();
		for(Edge e:graph.get(rtvx.first()))
				{
					if(vis[e.v]==-1)
					{
						que.add(new Pair(e.v, (rtvx.second()+1)%2));
					}
				}
			
		}
		return flag; 
	}
	public static void bipartite_()
	{
		int vis[]= new int[graph.size()];
		Arrays.fill(vis, -1);
		int count =0;
		for(int i=0;i<graph.size();i++)
		{
			if(vis[i]==-1)
			{
				count ++;
				System.out.println(count+" "+bipartite(i, vis));
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructgraph(7);
		display();
		bipartite_();
	}

}
