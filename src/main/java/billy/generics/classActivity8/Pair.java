package billy.generics.classActivity8;

public class Pair <K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

class KeyValueExample {
    public static void main(String[] args) {
        // Creating a Pair of String and Integer
        Pair<String, Integer> studentAge = new Pair<>("Alice", 22);
        System.out.println(studentAge.getKey() + " is " + studentAge.getValue() + " years old.");
    }
}
