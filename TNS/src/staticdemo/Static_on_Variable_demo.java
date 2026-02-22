package staticdemo;

class Users2{
	String username;
	static String appName = "InstaClone";
	
	Users2(String username){
		this.username = username;
		
	}
	void showDetails() {
		System.out.println("Users:"+ username + " "+",Appname:" + appName);
		
	}
}

public class Static_on_Variable_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users2 user = new Users2("Alice");
		Users2 user1 = new Users2("Bob");
		user.showDetails();
		user1.showDetails();


	}

}
