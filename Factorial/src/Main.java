
public class Main {
	
	public static void main(String[] args) {
		for (int i = 0; i<=12; i++) {			
			System.out.println("factorialIterative("+ i +")= " + Main.factorialIterative(i));
			System.out.println("factorialRecursive("+ i +")= " + Main.factorialRecursive(i));
		}
	}

	public static long factorialIterative(long n) {
		long result = 1;
		for (int i=1; i<=n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static long factorialRecursive(long n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return factorialRecursive(n-1) * n;
		}
	}
	
}
