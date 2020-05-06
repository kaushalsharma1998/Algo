
public class Fibonacci {

	public static int fibo(int n) {
		if (n <= 1) {

			return n;
		}

		return fibo(n - 2) + fibo(n - 1);
	}

	public static int fibo01(int n, int dp[]) {
		if (n <= 1)
			return dp[n] = n;

		if (dp[n] != 0)
			return dp[n];
		return dp[n] = fibo01(n - 1, dp) + fibo01(n - 2, dp);
	}

	public static int fibo02(int n, int dp[]) {
		for ( int i = 0; i <= n; i++) {
			if (i <= 1) {

				dp[i] = i;
				continue;
			}
			dp[i] = dp[i - 1] + dp[i - 2];
		}
return dp[n];
	}
	public static int fibo03(int n )
	{	if(n<=1)
		return n;
		int a=0,b=1,c=1; 
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}

	public static void main(String args[]) {
//		System.out.println(fibo(3));
//		int dp[] = new int[10];
//		System.out.println(fibo02(9, dp));
//		for (int a : dp)
//			System.out.print(a + " ");
		System.out.println(fibo03(9));
	}
}
