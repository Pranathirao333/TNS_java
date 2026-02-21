package tns;

class Human {
    int age;
    String name;
}

public class BeforeEncapsulation {

	public static void main(String[] args) {
		  Human obj = new Human();
	        obj.age = 26;
	        obj.name = "Rashmi";

	        System.out.println(obj.age);
	        System.out.println(obj.name);
	    }
	}


