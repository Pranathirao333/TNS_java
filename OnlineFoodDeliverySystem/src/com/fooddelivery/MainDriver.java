package com.fooddelivery;

import java.util.Scanner;

public class MainDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerService customerService = new CustomerService();
        FoodService foodService = new FoodService();
        OrderService orderService = new OrderService();

        while (true) {

            System.out.println("\n1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    adminMenu(sc, foodService);
                    break;

                case 2:
                    customerMenu(sc, customerService);
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void adminMenu(Scanner sc, FoodService foodService) {

        while (true) {

            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Restaurant");
            System.out.println("2. View Restaurants");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Restaurant ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Restaurant Name: ");
                    String name = sc.nextLine();

                    Restaurant restaurant = new Restaurant(id, name);
                    foodService.addRestaurant(restaurant);

                    break;

                case 2:

                    foodService.viewRestaurants();
                    break;

                case 3:

                    System.out.println("Exiting Admin Module");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void customerMenu(Scanner sc, CustomerService customerService) {

        while (true) {

            System.out.println("\nCustomer Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter Contact No: ");
                    long contact = sc.nextLong();

                    Customer customer = new Customer(id, username, contact);
                    customerService.addCustomer(customer);

                    break;

                case 2:

                    System.out.println("Exiting Customer Module");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}