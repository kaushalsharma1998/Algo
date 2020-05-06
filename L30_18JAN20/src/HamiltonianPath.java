import java.util.ArrayList;



public class HamiltonianPath {
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
		addedge(2,5,7);
		addedge(0, 6, 12);
		
		
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
	 public static int hamiltonian(int vtx,int osrc,int vtxCount,boolean vis[],String path)
	{
		if (vtxCount==graph.size()-1)
		{	 boolean flag=false;
		  for(Edge e:graph.get(vtx))
		  {
			  if (e.v==osrc)
			  {
				  System.out.println("cycle "+ path+""+vtx);
			  flag=true;
			  }
		  }
		  if(!flag)
			  System.out.println("path "+path+""+vtx);
		  
		  
			
		return 1;
				
			
		}
		int count=0;
		for(Edge e:graph.get(vtx))
		{  vis[vtx]=true;
			if (!vis[e.v])
				count+=hamiltonian(e.v, osrc, vtxCount+1,vis, path+vtx+"");
			vis[vtx]=false;
		}
	return count;
	}
	public static void main(
			String[] args) {
		// TODO Auto-generated method stub

	constructgraph(7);
	display();
	System.out.println(hamiltonian(0, 0,0, new boolean[7], ""));
 
}
}
