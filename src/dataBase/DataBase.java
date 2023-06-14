package dataBase;
import modul.Product;
import modul.Character;
import java.util.List;

public class DataBase {
  private List<Character>characters;
  private List<Product>products;

  public DataBase(List<Character> characters, List<Product> products) {
    this.characters = characters;
    this.products = products;
  }

  public DataBase() {
  }

  public List<Character> getCharacters() {
    return characters;
  }

  public void setCharacters(List<Character> characters) {
    this.characters = characters;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
