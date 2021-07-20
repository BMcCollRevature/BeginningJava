package recursionmethod;

public class ExampleOne {
	
	public static void main(String[] args) {
		
		int input = 5;
		
		ExampleOne eo = new ExampleOne();
		
		System.out.println(eo.factorial(input));
	}
	
	public int factorial (int num) {
		if(num <= 0) return 0;
		if(num == 1) return 1;
		
		return num * factorial(num-1);
	}
}
