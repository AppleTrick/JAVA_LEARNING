package Generics1.Practice4;

class Apple {
    @Override
    public String toString() {
        return "I am an Apple";
    }
}

class Orange {
    @Override
    public String toString() {
        return "I am an Orange";
    }
}

class Box<T> {
    private T ob;

    public void set(T ob) {
        this.ob = ob;
    }

    public T get() {
        return ob;
    }
}
public class FruitAndBox2_Generic {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>();
        Box<Orange> oBox = new Box<Orange>();

        aBox.set(new Apple());
        oBox.set(new Orange());

        Apple ap = aBox.get();
        Orange og = oBox.get();

        System.out.println(ap);
        System.out.println(og);

    }
}
