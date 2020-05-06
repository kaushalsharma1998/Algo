import java.util.ArrayList;

public  class TreeIntro {
	public   static  class Node{
		int data;
		Node left=null;
		Node right=null;
		
		public  Node( int data) {
		this.data=data;	
		
		}
	}
	
	static  int idx=0;
	public static Node constructNode(int arr[] )
	{
		if(idx==arr.length||arr[idx]==-1) {
			idx++;
			return null;
		}
		Node node= new Node(arr[idx]);
		idx++;
		
		node.left=constructNode(arr );
		node.right=constructNode(arr);
		return node;
	}
	public static void display(Node node) {
        if (node == null)
            return;

        System.out.print((node.left != null ? node.left.data : "."));
        System.out.print(" -> " + node.data + " <- ");
        System.out.println((node.right != null ? node.right.data : "."));
        
        display(node.left); // display(2*idx+1);
        display(node.right); // display(2*idx+2);

    }
	public static ArrayList<Node>allPath(Node node,int data)
	{
		if(node==null)
		{
			ArrayList<Node>base=new ArrayList<TreeIntro.Node>();
			return base;
		}
		if(node.data==data)
		{
			ArrayList<Node>base=new ArrayList<TreeIntro.Node>();
			base.add(node);
			return base;
		
		}
		ArrayList<Node>left=allPath(node.left, data);
		if(left.size()!=0)
		{
			left.add(node);
			return left;
		}
		ArrayList<Node>right=allPath(node.right, data);
		if (right.size()!=0)
		{
			right.add(node);
			return right;
		}  
		return new ArrayList<TreeIntro.Node>();
		
	}
	public static int Lca(Node node, int data1,int data2 )
	{
		int ans=-1;
		ArrayList<Node>list1=allPath(node, data1);
		ArrayList<Node>list2=allPath(node, data2);
		int i=list1.size()-1;
		int j=list2.size()-1;
		while(i>=0&&j>=0)
		{	if(list1.get(i)!=list2.get(j))
			{
				break;
			}
		ans=list1.get(i).data;
		i--;
		j--;
		}
		return ans;
	}
	
	public static void solve() {
        int[] arr = { 10, 20, 30, 40, -1, -1, 50, -1, -1, 60, -1, 70, -1, -1, 80, 90, 100, 120, -1, -1, 130, -1, -1,
                110, -1, -1, 140, -1, -1 };

        Node root = constructNode(arr);
        System.out.println(root);
        display(root);
        System.out.println(Lca(root, 30, 60));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	solve();
	
	}


}

