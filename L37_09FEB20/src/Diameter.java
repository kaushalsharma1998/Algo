

public class Diameter {
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
	public static int height(Node node)
	{
		if(node==null)
			return -1;
		return(Math.max(height(node.left), height(node.right)))+1;
	}

	public static int diameter_01(Node node)
	{
		if(node==null)
			return 0;
		int ld= diameter_01(node.left);
		int rd= diameter_01(node.right);
		int lh=height(node.left);
		int rh=height(node.right);
		return Math.max(Math.max(ld, rd), lh+rh+2);
	}
	public static int [] diameter_02(Node node)
	{
		if(node==null)
		{
			return new int[] {0,-1};
		}
	int[] ld=diameter_02(node.left);
	int[] rd=diameter_02(node.right);
	int[] myAns=new int[2];
	myAns[0]=Math.max(Math.max(ld[0], rd[0]), ld[1]+rd[1]+2);
	myAns[1]=Math.max(ld[1], rd[1])+1;
	return myAns;
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, -1, -1, 50, -1, -1, 60, -1, 70, -1, -1, 80, 90, 100, 120, -1, -1, 130, -1, -1,
                110, -1, -1, 140, -1, -1 };

        Node root = constructNode(arr);
        //System.out.println(root);
        display(root);
        int[]ans=(diameter_02(root));
        for(int a:ans)
        {
        	System.out.print(a+" ");
        	
        }
        System.out.println(diameter_01(root));
	}

}
