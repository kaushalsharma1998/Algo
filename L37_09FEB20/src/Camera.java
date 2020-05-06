

public class Camera {
	public   static  class Node{
		int data;
		Node left=null;
		Node right=null;
		
		public  Node( int data) {
		this.data=data;	
		
		}
	}
	
	public static int cameras=0;
	public static int mincameras_(Node node)
	{
		if(node==null)
			return 0;
		int left=mincameras_(node.left);
		int right=mincameras_(node.right);
		if(left==-1||right==-1)
		{
			cameras++;
			return 1;
		}
		if(left==1||right==1)
		{
			return 0;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
