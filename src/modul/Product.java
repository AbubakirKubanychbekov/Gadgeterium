package modul;

import enums.Category;
import enums.KeyCharacter;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Product {
    private Long id;
    private String name;
    private Category category;
    private KeyCharacter character;
    private List<Map<KeyCharacter,String>> mapsValue;

    public Product() {
        this.mapsValue = new ArrayList<>();
    }

    public Product(Long id, Category category, KeyCharacter character) {
        this.id = id;
        this.category = category;
        this.character = character;
    }

    public Product(Long id, Category category, KeyCharacter character, List<Map<KeyCharacter, String>> mapsValue) {
        this.id = id;
        this.category = category;
        this.character = character;
        this.mapsValue = mapsValue;
    }

    public Product(Long id, String name, Category category, KeyCharacter character, List<Map<KeyCharacter, String>> mapsValue) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.character = character;
        this.mapsValue = mapsValue;
    }

    public Product(List<Map<KeyCharacter, String>> mapsValue) {
        this.mapsValue = mapsValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public KeyCharacter getCharacter() {
        return character;
    }

    public void setCharacter(KeyCharacter character) {
        this.character = character;
    }

    public List<Map<KeyCharacter, String>> getMapsValue() {
        return mapsValue;
    }

    public void setMapsValue(List<Map<KeyCharacter, String>> mapsValue) {
        this.mapsValue = mapsValue;
    }

    @Override
    public String toString() {
        return "Product" +
                "id-> " + id +
                ",name-> " + name +
                ", category-> " + category +
                ", character-> " + character +
                ", mapsValue-> " + mapsValue ;
    }
}
