package interfaces;

import modul.Product;
import java.util.Map;
import java.util.List;

public interface ProductService {
   Product saveProduct(Long id, Enum ee,String ss, Enum e, String s);
    void updateProduct(List<Map<String,Integer>>products,String newProduct);
    void getByIdProduct(List<Product>products,Long id);
   void searchByProductName(List<Product>products,String name);
    void filterByCharacter();
    void sortByCharacter();
    void deleteByProduct();
    void getAllProduct();
    void deleteCharacterByKeyName();
    void deleteAllCharacters();

}