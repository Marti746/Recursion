package TailRecursionEX;

public class TailRecursion {
	
	public static void print(int n) {
		if (n < 0)
			return;
		System.out.println("Hello: " + n);
		print(n - 1); // tail recursive
	}
	
	static long factTR(long n, long a) {
		System.out.println("Value of n: " + n + " and a: " + a);
		if (n == 0)
			return a;
		return factTR(n-1, n*a);
	}
	// A wrapper method over FactTR
	static long fact(long n) {
		return factTR(n, 1);
	}
	
	public static void main(String[] args) {
		//print(8);
		fact(10);
	}
	
}
