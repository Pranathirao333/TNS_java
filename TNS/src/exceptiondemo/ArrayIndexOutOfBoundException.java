package exceptiondemo;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
	int[] arr = new int[4];
		
		try {
			int i  = arr[5];
			System.out.println(i);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
		
	}

}
