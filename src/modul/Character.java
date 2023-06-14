package modul;

import enums.KeyCharacter;

import java.util.Map;


public class Character {
    private Long id;
    private KeyCharacter keyCharacter;
    private String chInfo;
    private Map<KeyCharacter, String> character;
    private double price;

    public Character() {
    }

    public Character(Long id, KeyCharacter keyCharacter, String chInfo, double price) {
        this.id = id;
        this.keyCharacter = keyCharacter;
        this.chInfo = chInfo;
        this.price = price;
    }

    public Character(Long id, KeyCharacter keyCharacter, String chInfo, Map<KeyCharacter, String> character, double price) {
        this.id = id;
        this.keyCharacter = keyCharacter;
        this.chInfo = chInfo;
        this.character = character;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public KeyCharacter getKeyCharacter() {
        return keyCharacter;
    }

    public void setKeyCharacter(KeyCharacter keyCharacter) {
        this.keyCharacter = keyCharacter;
    }

    public String getChInfo() {
        return chInfo;
    }

    public void setChInfo(String chInfo) {
        this.chInfo = chInfo;
    }

    public Map<KeyCharacter, String> getCharacter() {
        return character;
    }

    public void setCharacter(Map<KeyCharacter, String> character) {
        this.character = character;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Character" +
                "id-> " + id +
                ", keyCharacter-> " + keyCharacter +
                ", chInfo-> '" + chInfo + '\'' +
                ", character-> " + character +
                ", price-> " + price ;
    }
}
