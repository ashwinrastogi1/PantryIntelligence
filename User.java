import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class User {
    String username;
    Map<Integer, ArrayList<Item>> groceryHistory;

    public User() {
        this("DEFAULT_USERNAME", new HashMap<Integer, ArrayList<Item>>());
    }

    public User(String username, Map<Integer, ArrayList<Item>> groceryHistory) {
        this.username = username;
        this.groceryHistory = groceryHistory;
    }

    public void newGroceryEntry(ArrayList<Item> newTrip) {
        this.groceryHistory.put(groceryHistory.size(), newTrip);
    }

    public ArrayList<Item> getEntry(int key) {
        return this.groceryHistory.get(key);
    }

    public ArrayList<Item> removeEntry(int key) {
        return this.groceryHistory.remove(key);
    }

    public Map<String, Double> getAvgNutrientIntake() {
        Map<String, Double> avgNutrients = new HashMap<>();

        for (ArrayList<Item> items: this.groceryHistory.values()) {
            for ()
        }

        return avgNutrients;
    }
}