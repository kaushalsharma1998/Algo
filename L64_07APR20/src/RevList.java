public class RevList {

	public static  class Node{
		int data=0;
		Node next=null;
	Node(int data)
	{
		this.data=data;
	}
	@Override
	public String toString() {
		return this.data+"";
	}
	
}
	 
	public static Node getNodeAt(Node node,int idx)
	{ 	 Node curr=node;
		while(idx-->0&&curr.next!=null)
		curr=curr.next;
	 return curr;	
	}
	public static void display(Node node)
	{ Node curr=node; 
		while(curr!=null)
		{	System.out.print(curr+" ");
		curr=curr.next;
		}
	}
	public static void  rev (Node node,int si,int ei ) {
		Node curr=node;
		while(si<ei) {
		Node st= getNodeAt(curr, si);
		Node et= getNodeAt(curr, ei);
		int temp=st.data;
		st.data=et.data;
		et.data=temp;
		si++;
		ei--;
		}
		display(curr);
		
	}
public static void main(String args[])

{ Node node=new Node(10);
	node.next=new Node(20);
	node.next.next=new Node(30);
	node.next.next.next=new Node(40);
	node.next.next.next.next=new 	Node(50);
	//display(node);
	rev(node, 0,4);
	displa
}
}
