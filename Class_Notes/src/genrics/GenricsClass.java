package genrics;

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenricsClass {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer Value: " + intBox.getValue());
        
        
        Box<String> strBox = new Box<>();
        strBox.setValue("Hellow Genrics!");
        System.out.println("String: " + strBox.getValue());
    }
}
