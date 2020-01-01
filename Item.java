import java.util.Map;
import java.util.HashMap;

public class Item {
    String itemName;
    Map<String, Double> nutrition;

    public Item() {
        this("NotanItem", new HashMap<>());
    }

    public Item(String itemName, Map<String, Double> nutrMap) {
        this.itemName = itemName;
        this.nutrition = nutrMap;
    }

    public Map<String, Double> getNutrition() {
        return this.nutrition;
    }
}