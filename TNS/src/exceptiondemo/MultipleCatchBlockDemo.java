package exceptiondemo;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
	int[] numbers = new int[4];
		
		try {
			numbers[9] = 50/9;
		}catch(ArithmeticException  e) {
			System.out.println("arithmeticException:"+ e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayIndexOutOfBound:"+ e.getMessage());
		}


	}

}
