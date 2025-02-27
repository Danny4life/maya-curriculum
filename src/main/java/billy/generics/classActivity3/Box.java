package billy.generics.classActivity3;

public class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println(stringBox.getValue());

        Box<Integer> intergerBox = new Box<>();
        intergerBox.setValue(100);
        System.out.println(intergerBox.getValue());
    }
}
