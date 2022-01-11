package Day_15_Eception_Handling;

public class Exception_HandlingDemo1 {

	public static void main(String[] args) {
		try {
		int data=100/0;
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("Exception Handling Demo");

	}

}