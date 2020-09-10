package Generics1.Practice6;

public class PrimitivesAndGenric {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<Integer>();
        iBox.set(125);
        int num = iBox.get();
        System.out.println(num);
    }
}
class Box<T> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}
