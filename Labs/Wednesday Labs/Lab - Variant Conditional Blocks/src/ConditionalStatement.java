
public class ConditionalStatement {
	
	public static void main (String[] args) {
	
		boolean b = false;
		
		if(b) {
			System.out.println("Inside the if-statement");
		}
		else {
			System.out.println("Inside the else-statement");
		}
		System.out.println("Outside the if-statement");
		
		boolean firstCondition = false;
		boolean secondCondition = true;
		
		if(firstCondition)
		{
			System.out.println("Inside the if-statement"); 
		
			if(secondCondition) {
				System.out.println("Inside the nested if-statement");
			}
		}else if(secondCondition)
		{
			System.out.println(5);
		}else
		{
			System.out.println("Inside the else-Statement");
		}
		System.out.println("Outside the if-statement");
	}
	
}
