import java.util.HashMap;

public class Maxseries {
	public static void maxseries(int arr[]) {
		int size=0;
		
		int number=0;
		
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for (int a : arr)
			map.putIfAbsent(a, true);
		
		for (int key : map.keySet()) {
			if (map.containsKey(key - 1)) {
				map.put(key, false);

			}
		}
		for(int key:map.keySet())
		{ 
			if(map.get(key))
			{ 	int num=key+1;
			 	int smallsize=1;
				while(map.containsKey(num))
			{ 		num++;
					smallsize++;
				
					
			}
				if(smallsize>size)
				{
					size=smallsize;
					number=key;
				}
			
				
			}
		}
		 System.out.println(number+" "+size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxseries(new int[] {1,2,3,4,5,6,99,98,97,96,95,94,93,92,91,90});

	}

}
