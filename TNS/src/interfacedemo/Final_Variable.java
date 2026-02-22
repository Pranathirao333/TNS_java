package interfacedemo;
class UPIApp{
	final int Max_Daily_Limit = 10000;
	
	void showLimit(){
		System.out.println("Daily transfer limit:"+ Max_Daily_Limit);
	}
}

public class Final_Variable {

	public static void main(String[] args) {

		UPIApp upi = new UPIApp();
		upi.showLimit();


	}

}
