package olga.map.classActivity1A;

public class HashCodeEx {
    public static void main(String[] args) {
        String key = "Apple";

        Integer num = 10;

        int hashName = key.hashCode();

        int hashNum = num.hashCode();

        System.out.println("Hash name value " + hashName);
        System.out.println("Hash number value " + hashNum);
    }
}
