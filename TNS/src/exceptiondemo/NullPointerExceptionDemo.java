package exceptiondemo;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		String st = null;
		try {
			System.out.println(st.length());
		}catch(NullPointerException e) {
			System.out.println("null pointer exception is handled");
		}
		System.out.println("rest of the code");
		
	}

}
