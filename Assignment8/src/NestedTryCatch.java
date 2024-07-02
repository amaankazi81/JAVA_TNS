
public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		try {
			int b = a/10;
			
			try {
				int c = 1/0;
			}
			catch(NullPointerException e) {
				System.out.println("Exception Caught "+e.getMessage());
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Caught "+e.getMessage());
		}
		finally {
			System.out.println("It will executed anyways");
		}
			
		
	}

}
