import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class BFSgraph {
	
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
		System.out.println(graph);
	
		for (int i=0;i<edge; i++)
		 
			graph.add( new ArrayList<Edge>());
		  
		
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
	{  if(v<0||u<0||v>=graph.size()||u>=graph.size())
		return;
	
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
	
	public static void  Bfs(int src,int des)
	{
	Queue<Integer>que= new LinkedList<Integer>(); 
	boolean[] vis=new boolean[7];
	que.add(src);
	que.add(-1);
	int level =0;
	int cycle=0;
	 

	while(que.size()!=1)
	{  
		int head= que.remove();
		if (head==-1)
		  {  level++;
			 
		    que.add(-1);
			continue; 
					                                        
		 }
	   
	     if (vis[head])
	     { cycle+=1;
	         System.out.println("cycle " + (cycle)+ " @ " +head);
	         continue;
	     }
		
	     if (head == des)
	        {
	            System.out.println( "ypiee! i got destination at lowest no of edges from src: " + level );
	        }
	     vis[head]=true;
		
		
		for (Edge e:graph.get(head))
		{
		 if (!vis[e.v])
		 {
			 que.add(e.v);
			 
		 }
		 
		 }
	
	}
	}
	  public static void Bfs2(int src,int  des)
	 {
		 Queue<Integer>que=new LinkedList<Integer>();
		 boolean vis[]=new boolean[graph.size()];
		 boolean isdest=false;
		 int cycle=0;
		 int levl=0;
		 que.add(src);
		 while (que.size()!=0)
		 {   int size=que.size();
			 while(size>0)
			 {  size--;
				int rtvx=que.remove();
				if(vis[rtvx])
				{	cycle++;
					System.out.println("cycle "+cycle+" @ "+rtvx);
					continue;
				}
				
				if(rtvx==des&&!isdest)
				{
				 System.out.println("destination at lowest level "+levl);	
				 isdest=true;
				
				}
				
				vis[rtvx]=true;
				for(Edge e:graph.get(rtvx))
				{
					if(!vis[e.v])
						que.add(e.v);
				}
			 
			 
			 }
			 
			levl++;
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructgraph(7);
		display();
		//Bfs(0, 6);
		Bfs2(0,	 6);
	}
	
	}

 
