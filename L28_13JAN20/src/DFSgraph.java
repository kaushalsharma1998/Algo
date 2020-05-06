	import java.util.ArrayList;
	
	
	
	
	
	public class DFSgraph {
	
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
	public static void haspath(int src,int des,boolean vis[],String path )
	{ 
	  ArrayList<Edge>list=graph.get(src);
	  if (src==des)
	  {
	  System.out.println(path);
	  }
	   
	  for(Edge e: list)
	  { vis[src]=true;
		  if (!vis[e.v])	
		  
		   
		haspath(e.v, des, vis, path+e.v+"");
	    
	  }
	  }
	public static int allpath(int src, int des, boolean vis[],String path)
	{
		if (src==des)
		{
			System.out.println(path);
			return 1;
		}
		int count=0;
		vis[src]=true;
		for (Edge e:graph.get(src))
		{
			
			if (!vis[e.v])
			{
			 count +=allpath(e.v, des, vis, path+e.v+"");
				}
				
			}
			vis[src]=false;
		
			
			return count;
		}
		public static int lwsf=-1;
		public static int swsf=9999;
	  public static void allpathweight(int src,int des,boolean vis[],int weight,String path)
	  {
		  if (src==des)
		  {
			  System.out.println(path+" @ "+weight);
		  if(weight<swsf)
		  {
			  swsf=weight;
		  }
		  if(weight>lwsf)
		  {
			  lwsf=weight;
		  }
	  }
	  for (Edge e:graph.get(src))
	  {
		  vis[src]=true;
		  if(!vis[e.v])
			  allpathweight(e.v, des, vis, weight+e.w, path+e.v+"");
			  vis[src]=false;
		  }
	  }
	   static void dfs(int src, boolean vis[])
	  {
		  vis[src]=true;
		  for (Edge e:graph.get(src))
		  {
			  if (!vis[e.v])
			  {
				 dfs(e.v,vis); 
			  }  
		  }
		  
	  }
	  
	  public static int getgcc()
	  {  int comp=0;
		 boolean vis[]=new boolean[7];
		 for (int i=0;i<vis.length;i++)
		 {   if(!vis[i])
			 comp+=1;
			 dfs(i, vis);
		 }
		 return comp; 
		  
	  }
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			constructgraph(7);
			display();
			//haspath(0, 6, new boolean[8], "0");
			//System.out.println(allpath(0, 6, new boolean[8], ""+0));
			//allpathweight(0, 6, new boolean[7], 0, 0+"");
			//System.out.println("largest is "+lwsf+" and smallest is  "+swsf);
			System.out.println(getgcc());
		}
	
	}
