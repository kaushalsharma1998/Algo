import java.util.ArrayList;

public class GraphIntro {

	public static class Edge {
        int v = 0;
        int w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }			
	public static ArrayList<ArrayList<Edge>>graph=new ArrayList<ArrayList<Edge>>(10);
	public static ArrayList<Integer>n=new ArrayList<Integer>(7);
	public static void  constructgraph(int edge)
	{  System.out.println(graph.size());
	System.out.println(n.size());
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
	
	

    public static void removeEdge(int u, int v) {
        int i = 0;
        while (i < graph.get(u).size()) {
            Edge e = graph.get(u).get(i);
            if (e.v == v) {
                break;
            }
            i++;
        }

        int j = 0;
        while (j < graph.get(v).size()) {
            Edge e = graph.get(v).get(j);
            if (e.v == u) {
                break;
            }
            j++;
        }

        graph.get(u).remove(i);
        graph.get(v).remove(j);
    }

    public static void removeVtx(int u){
        ArrayList<Edge> list=graph.get(u);
        
        while(list.size()!=0){
            Edge e=list.get(list.size()-1);
            
            removeEdge(u,e.v);
        
        }

    }
	public static void main( String args[])
		{ 
			constructgraph(7);
			display();
			removeVtx(3);
			display();
		}
	
}
