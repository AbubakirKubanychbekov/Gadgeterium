import dataBase.DataBase;
import enums.Category;
import enums.KeyCharacter;
import modul.Character;
import modul.Product;
import service.ProductServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Map<Integer,String>product=new HashMap<>();
        product.put(1,"Iphone");
        product.put(2,"Laptope");
        product.put(3,"SmartWatch");

        Character character1=new Character(10L,KeyCharacter.IP,"You can find out your iPhone where to be with the help of IP",20000);
        Character character2=new Character(20L,KeyCharacter.CPU,"Every laptop has a different CPU",100000);
        Character character3=new Character(30L,KeyCharacter.CAMERA,"Every gadgeterium have CAMERA",70000);
        List<Character>characters=new ArrayList<>(List.of(character1,character2,character3));

        Product product1=new Product(40L,Category.PHONE,KeyCharacter.CAMERA);
        Product product2=new Product(50L,Category.SMARTWATCH,KeyCharacter.IP);
        Product product3=new Product(60L,Category.LAPTOP,KeyCharacter.CPU);
        List<Product>products=new ArrayList<>(List.of(product1,product2,product3));


        DataBase dataBase=new DataBase(characters,products);
        ProductServiceImpl productServiceImpl=new ProductServiceImpl(dataBase);
        System.out.println(productServiceImpl.saveProduct(10L,Category.PHONE,"Iphone 14" , KeyCharacter.RAM, "1T"));
        productServiceImpl.getByIdProduct(products,40L);
        productServiceImpl.searchByProductName(products,"Iphone 14");



    }
}