package billy.generics.classActivity9;

import java.util.HashMap;
import java.util.Map;

public class GenericRepository<K, V> {

    private Map<K, V> storage = new HashMap<>();

    // Save an entity
    public void save(K key, V value) {
        storage.put(key, value);
    }

    // Retrieve an entity by key
    public V findById(K key) {
        return storage.get(key);
    }

    // Delete an entity by key
    public void delete(K key) {
        storage.remove(key);
    }

    // Print all stored values
    public void printAll() {
        storage.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

}
