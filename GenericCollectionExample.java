
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Pair {
    String name;
    int age;

    public Pair(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the contents of the Pair
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "\n");
    }

    // Override equals and hashCode for HashSet to work properly
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return age == pair.age && name.equals(pair.name);
    }
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }
}

public class GenericCollectionExample {
    public static void main(String[] args) {
        // Create a generic ArrayList to store Pair objects
        ArrayList<Pair> pairsList = new ArrayList<Pair>();

        // Add elements to the ArrayList
        pairsList.add(new Pair("Alice", 30));
        pairsList.add(new Pair("Bob", 25));
        pairsList.add(new Pair("Charlie", 20));

        // Create a HashMap to store Pair objects with name as the key
        HashMap<String, Pair> pairsMap = new HashMap<String, Pair>();

        // Add elements to the HashMap
        pairsMap.put("Alice", new Pair("Alice", 30));
        pairsMap.put("Bob", new Pair("Bob", 25));
        pairsMap.put("Charlie", new Pair("Charlie", 20));

        // Create a HashSet to store Pair objects
        HashSet<Pair> pairsSet = new HashSet<Pair>();

        // Add elements to the HashSet
        pairsSet.add(new Pair("Alice", 30));
        pairsSet.add(new Pair("Bob", 25));
        pairsSet.add(new Pair("Charlie", 20));

        // Print the contents of the ArrayList
        System.out.println("Pairs in the ArrayList:");
        for (Pair pair : pairsList) {
            pair.display();
        }

        // Print the contents of the HashMap
        System.out.println("Pairs in the HashMap:");
        for (String key : pairsMap.keySet()) {
            pairsMap.get(key).display();
        }

        // Print the contents of the HashSet
        System.out.println("Pairs in the HashSet:");
        for (Pair pair : pairsSet) {
            pair.display();
        }
    }
}
