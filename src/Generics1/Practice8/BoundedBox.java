package Generics1.Practice8;

class Box<T extends Number> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}
public class BoundedBox {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();    //Integer 는 Number을 상속
        iBox.set(15);

        Box<Double> dBox = new Box<>();     //Double 은 Number을 상속
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
