package service;

import dataBase.DataBase;
import enums.Category;
import enums.KeyCharacter;
import interfaces.ProductService;
import modul.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
 DataBase dataBase=new DataBase();

    public ProductServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public Product saveProduct(Long id, Enum ee,String ss, Enum e, String s) {
        Product product=new Product();
        product.setId(id);
        Map<Category, String> map1 = new HashMap<>();
        Map<KeyCharacter, String> map2 = new HashMap<>();
        map1.put((Category) ee,ss);
        map2.put((KeyCharacter) e,s);
        List<Map<KeyCharacter, String>> categoryList = product.getMapsValue();
        List<Map<KeyCharacter, String>> characterList = product.getMapsValue();
        characterList.add(map2);
        product.setMapsValue(characterList);
        return product;



    }

    @Override
    public void updateProduct(List<Map<String, Integer>> products, String newProduct) {

    }


    @Override
    public void getByIdProduct(List<Product>products, Long id) {
        for (int i = 0; i < dataBase.getProducts().size(); i++) {
          if (dataBase.getProducts().get(i).getId().equals(id)){
              System.out.println(dataBase.getProducts().get(i));
          }
        }
    }

    @Override
    public void searchByProductName(List<Product> products, String name) {
        for (int i = 0; i < dataBase.getProducts().size(); i++) {
            if (dataBase.getProducts().get(i).getName().equals(name)){
                System.out.println(dataBase.getProducts().get(i));
            }
        }

    }

    @Override
    public void filterByCharacter() {

    }

    @Override
    public void sortByCharacter() {

    }

    @Override
    public void deleteByProduct() {

    }

    @Override
    public void getAllProduct() {

    }

    @Override
    public void deleteCharacterByKeyName() {

    }

    @Override
    public void deleteAllCharacters() {

    }
}
