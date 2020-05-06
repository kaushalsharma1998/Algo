import java.util.Arrays;

public class Queue {
	int queue[];
	int head=0;
	int tail=-1;
	
	public Queue() {
		queue = new int[10];

	}

	public Queue(int arr[]) {

		queue = Arrays.copyOf(arr, 2 * arr.length);
		tail=arr.length-1;
	}
	public  boolean push(int data)
	{
		
		tail=((tail+1)%queue.length);
		if(tail+1==queue.length)
			return false;
		
		queue[tail]=data;
		
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
