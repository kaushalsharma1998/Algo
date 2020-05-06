
public class HV_MazeBox_Void {
	
	public static void HVmazeBoxVoid(int sr, int sc, int er, int ec, String ans)
	{
		 if (sr == er && sc == ec)
		    {
		        System.out.println(ans);
		        return ;
		    }
		 //int count = 0;
		    if (sr + 1 <= er)
		    	HVmazeBoxVoid(sr + 1, sc, er, ec, ans + "V");
		   
		    if (sc + 1 <= ec)
		    	HVmazeBoxVoid(sr, sc + 1, er, ec, ans + "H");

		    
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HVmazeBoxVoid(0, 0, 2, 2, "");

	}

}
