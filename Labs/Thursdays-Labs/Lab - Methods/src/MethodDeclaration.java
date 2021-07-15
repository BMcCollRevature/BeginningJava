
public class MethodDeclaration {
	public static void main(String[] args)
	{
		//create class instance
		MethodDeclaration md = new MethodDeclaration();
		
		//call your first method here
		md.talk();
		md.talk();
		md.talk();
	}
		
		public void talk() {
			System.out.println("Inside of talk method");
		}
}
