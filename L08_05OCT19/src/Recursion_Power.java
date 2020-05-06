
public class Recursion_Power {

	public static int rec_power(int a, int b) {
		if (b < 1) {
			return 1;
		}  {
			return a * rec_power(a, b - 1);
		}

	}

	public static long rec_power_half(int a, int b) {
		 
		
		
		if (b < 1) {
			System.out.println("1");
			return 1;

		}
		long res=rec_power_half(a, b / 2);
		if ((b % 2) == 0) {
			System.out.println("even");
			return (res* res);

		}

		else {
			System.out.println("odd");
			return (a * res*res);
		}
	}

	public static void main(String args[]) {
//System.out.println(rec_power(2, 5));
		
		
		//System.out.println(rec_power_half(2,-1	));

	}
}
