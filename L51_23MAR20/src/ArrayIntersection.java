import java.util.HashMap;

public class ArrayIntersection {
	public static void intersection01(int arr[],int arr2[])
	{
	 HashMap<Integer, Boolean>map=new HashMap<Integer, Boolean>();
	 for(int a: arr)
	 {
		 map.put(a, false);
		 
	 }
	 for(int a:arr2)
	 {
	  if(map.containsKey(a))
	  {
		  System.out.print(a+" ");
		  map.remove(a);
	  }
		 
	 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 intersection01(new int[] {1,1,1,2,2,4,5},new int[] {1,1,2,2,2,3,3,4,5} );
 System.out.println();
 intersection02(new int[] {1,1,1,2,2,4,5},new int[] {1,1,2,2,2,3,3,4,5} );
	}
	public static void intersection02(int arr[],int arr2[])
	{
	 HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
	 for(int a: arr)
	 {
		 map.put(a, map.getOrDefault(a, 0)+1);
		 
	 }
	 for(int a:arr2)
	 {
	  if(map.containsKey(a))
	  {	if(map.get(a)>0)
		  System.out.print(a+" ");
		  map.put(a,map.getOrDefault(a, 0)-1);
	  }
		 
	 }
	}

}

