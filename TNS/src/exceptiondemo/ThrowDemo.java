package exceptiondemo;

public class ThrowDemo {

	public static void main(String[] args) {
		int age = 15;
		if(age < 18) {
			throw new ArithmeticException("You are not eligible for voting");
		}else {
			System.out.println("U r eligible for voting");
		}
		

	}

}
