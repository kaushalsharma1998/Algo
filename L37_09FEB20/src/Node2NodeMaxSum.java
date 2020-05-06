

public class Node2NodeMaxSum {

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
	public static int maxSum=Integer.MIN_VALUE;
	
	public static  int maxPathSum(  Node node) {
		if(node==null)
			return Integer.MIN_VALUE;
		if(node.left==null&&node.right==null)
			return node.data;
		int lmaxSum= maxPathSum(node.left);
		int rmaxSum=maxPathSum(node.right);
		int maxbranch=Math.max(lmaxSum, rmaxSum);
		maxSum=Math.max(Math.max(maxSum, node.data), Math.max(maxbranch+node.data, lmaxSum+rmaxSum+node.data));
		return Math.max(maxbranch+node.data, node.data);   
	    }

	public static void solve() {
        int[] arr = { 10, 20, 30, 40, -1, -1, 50, -1, -1, 60, -1, 70, -1, -1, 80, 90, 100, 120, -1, -1, 130, -1, -1,
                110, -1, -1, 140, -1, -1 };

        Node root = constructNode(arr);
        System.out.println(root);
        display(root);
        System.out.println(maxPathSum(root));
        System.out.println(maxSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	solve();
	
	}
}
