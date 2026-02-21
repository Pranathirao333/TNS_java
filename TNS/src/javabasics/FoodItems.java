package javabasics;

public class FoodItems {
	String name;
	double price;
	String category;
	
	void display() {
		System.out.println("food name :"+ name);
		System.out.println("food price :"+ price);
		System.out.println("food category :"+ category);
		System.out.println("...........................");
	}


	public static void main(String[] args) {
		FoodItems food = new FoodItems();
		food.name = "burger";
		food.price = 99.9;
		food.category = "fast food";
		
		FoodItems food1 = new FoodItems();
		food1.name = "coca cola";
		food1.price = 90;
		food1.category = "beverages";
		
		FoodItems food2 = new FoodItems();
		food2.name = "paneer biryani";
		food2.price = 160.5;
		food2.category = "Hyderabadi";
		
		food.display();
		food1.display();
		food2.display();
		
		
		
		

	}

}
