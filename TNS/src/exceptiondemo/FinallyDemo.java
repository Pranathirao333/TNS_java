package exceptiondemo;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			int data = 10/0;
			System.out.println(data);
		}catch(Exception e) {
			System.out.println("Exception caught :"+ e);
		}
		finally {
			System.out.println("this block is always executed");
		}

	}

}
