package tns;

public class DataTypeDemo {

	public static void main(String[] args) {
		  // primitive datatype
        int orderId = 101;
        double price = 299.99;
        boolean isDelivered = false;
        char rating = 'A';
        float deliveryDistance = 5.3f;
        long deliveryBoyPhone = 98322345671L;
        byte deliveryTime = 45;
        short restaurantId = 12;

        // non primitive datatype
        String customerName = "Anjali";
        String foodItems[] = {"burger", "fries", "coke"};

        // order summary
        System.out.println("Order Summary");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Order id : " + orderId);
        System.out.println("Restaurant id : " + restaurantId);
        System.out.println("DeliverBoy Number : " + deliveryBoyPhone);

        System.out.println("Food items : ");
        for (String item : foodItems) {
            System.out.println("- " + item);
        }

        System.out.println("Total price : " + price);
        System.out.println("Deliver distance : " + deliveryDistance);
        System.out.println("Is Delivered : " + isDelivered);
        System.out.println("Rating : " + rating);
    }
}

