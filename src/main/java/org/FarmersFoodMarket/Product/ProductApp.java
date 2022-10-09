/**
 *  Project Name: Product Find application from Local Food market shop
 *
 *  Description: This is a small application it's showing basic menu following with the options to find
 *  any product from shop customer want. for ex: if customer wants to just check does this shop
 *  have this product or not so sometimes it might throw an exception such as product not found
 *  so to handle that we have created custom exception. and other menu option is additional feature
 *  like to give feedback to store to improve the App. which might also throw exception of file not found.
 *  so we have handled it with try-with-resource.
 *
 *  Author: Team-2
 */

package org.FarmersFoodMarket.Product;

import CustomException.InvalidProductException;
import Services.ShopMenu;

import java.util.InputMismatchException;

public class ProductApp {
    public static void main(String[] args) throws InvalidProductException, InputMismatchException {
        ShopMenu shopMenu = new ShopMenu();
        shopMenu.Init();
    }


}
