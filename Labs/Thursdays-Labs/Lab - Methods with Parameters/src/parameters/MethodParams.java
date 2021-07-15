package parameters;

public class MethodParams {
	public static void main(String[] args) {
		// create class instance
		MethodParams mp = new MethodParams();
		//call method here
		double d = mp.convertIntToDouble(44);
		
		//Printing
		System.out.println(d);
		System.out.println(mp.sum(1.0, 2, 3));
	}
	
	//Create first method here
	public double convertIntToDouble(int num) {
		return (double)num;
	}
	
	//Sum Method 
	public double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
}
