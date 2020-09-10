package Generics1.Practice9;

interface Eatable {
    public String eat();
}

class Apple implements Eatable {
    @Override
    public String toString() {
        return "I am an Apple";
    }

    @Override
    public String eat() {
        return "It tastes so good";
    }
}

class Box<T extends Eatable> {
    T ob;

    public void set(T ob) {
        this.ob = ob;
    }

    public T get() {
        System.out.println(ob.eat());   //Eatable로 제한 하였기에 eat 호출 가
        return ob;
    }
}
public class BoundedInterfaceBox {
    public static void main(String[] args) {

        Box<Apple> box = new Box<>();
        box.set(new Apple());

        Apple ap = box.get();
        System.out.println(ap);

    }
}
