
public class Equi_Set 
{
 public static int EquiSet(int arr[],int vidx,int set1,int set2,String ans1,String ans2)
 {
	 if(vidx==arr.length)
  
	 { 
	 
		 if(set1==set2)
	 	
		 {
			 System.out.println(ans1+"="+ans2);
			 return 1;
	  
  
		 }
	 return 0;
  
	 }
	 int count=0;
	 count+=EquiSet(arr, vidx+1, set1+arr[vidx], set2, ans1+arr[vidx]+" ", ans2);
	 count+=EquiSet(arr, vidx+1, set1, set2+arr[vidx], ans1, ans2+arr[vidx]+" ");
	return count;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {10,20,30,40,50,60,70};
	EquiSet(arr, 0, 0, 0, "", "");
	}

}
