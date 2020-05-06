import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class KhansAlgo {
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
		addedge(6,4,3);	
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
	public static void kahnsAlgo() {
	 int[] inDeg=new int[graph.size()];
	
	   for (int i =0;i<graph.size();i++)
		for(Edge e:graph.get(i))
			inDeg[e.v]++;
	
	Queue<Integer>que=new LinkedList<Integer>();
	for(int i=0;i<graph.size();i++ )
	{
		if(inDeg[i]==0)
			que.add(i);
	}
	Stack<Integer>ans=new Stack<Integer>();
	while(que.size()!=0)
	{	int rtvx=que.remove();
		ans.add(rtvx);
		for(Edge e:graph.get(rtvx))
		{
			inDeg[e.v]--;
			if(inDeg[e.v]==0)
				que.add(e.v);
		}
	
	}
	if(ans.size()!=graph.size())
		System.out.println("cycle");
	else 
	{
		while(!ans.empty())
		{
			System.out.print(ans.pop()+" ");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructgraph(7);
		display();
		kahnsAlgo();
	}

}