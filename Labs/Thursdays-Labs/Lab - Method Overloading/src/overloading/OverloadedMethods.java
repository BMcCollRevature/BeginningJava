package overloading;

public class OverloadedMethods {
	public static void main(String[] args) {
		// create instance here
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		om.print("Second print method");
		om.print("second","third");
	}
	
	//overload methods here
	public void print()
	{
		System.out.println("Original pring method");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
}
