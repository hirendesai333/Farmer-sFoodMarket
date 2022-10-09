package Services;

import Constants.ProductList;
import CustomException.InvalidProductException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopMenu {
    //declaring constant variables
    static String shopName = "Farmer's Food Market";

    //declaring mutable variables
    String customerName = "", productName = null;
    public int option;

    //scanner class to get input from customer
    Scanner input = new Scanner(System.in);

    //flag variable
    public boolean flag = true;

    //welcome method to show menu and getting input from user
    public void Init() throws InvalidProductException {
        System.out.println("\nWelcome to "+ shopName +" \n");
        System.out.print("Please enter your name: ");
        customerName = input.nextLine();
        System.out.println("Hello " + customerName + " We hope you will enjoy this shopping system");

        //product list object
        ProductList productList = new ProductList();

        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Check Product list");
            System.out.println("2. Search product");
            System.out.println("3. Submit Feedback");
            System.out.println("4. Exit");

            //try catch finally block
            try{
                System.out.print("\nPlease enter the option: ");
                option = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("oops!!! wrong input");
            }finally {
                flag = false;
            }

            switch (option){
                case 1:
                    System.out.println("\nList of products:");
                    for (String number : productList.productList) {
                        System.out.println(number);
                    }
                    break;
                case 2:
                    productList.SearchProduct();
                    break;
                case 3:
                    new Feedback().FeedbackFromCustomer();
                    break;
                case 4:
                    System.out.println("exiting the app");
                    break;
                default:
                    System.out.println("Please select the correct option\nThank you :)");
                    break;
            }
        }while(option!=4);

    }
}
