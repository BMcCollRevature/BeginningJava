package recursion;

public class Fib {
	
	public int fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		Fib fib = new Fib();
		
		int result = fib.fibonacci(2);
		System.out.println(result);
		
		result = fib.fibonacci(5);
		System.out.println(result);
		
		result = fib.fibonacci(10);
		System.out.println(result);
		
	}
	
}
