package Constants;

import CustomException.InvalidProductException;
import java.util.Scanner;

public class ProductList {
    String productName;

    //array list of products
    public String[] productList = {
            "1: milk",
            "2: bread",
            "3: cheese",
            "4: orange juice"
    };

    public void SearchProduct() throws InvalidProductException{
        //scanner class to get input
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter product number:");
//        productNumber = scanner.nextInt();
//        for (int i=0;i<productList.length;i++) {
//            if (productNumber==i){
//                System.out.println(productList[i]);
//            }
//        }

        System.out.print("Please enter the product name: ");
        productName = scanner.nextLine();

        for (String s : productList) {
            if (productName.equals(s)) {
                System.out.println("Product Found!");
            } else
                throw new InvalidProductException("Invalid Product Name Found please go through list if needed \n Thank you:)");
        }

    }

}
