package Generics1.Practice2;

class Orange {
    @Override
    public String toString() {
        return "I am an Orange";
    }
}

class Apple {
    @Override
    public String toString() {
        return "I am an apple";
    }
}

class Box {
    private Object ob;

    public Object getbox() {
        return ob;
    }

    public void setbox(Object ob) {
        this.ob = ob;
    }
}
public class FruitAndBox {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box oBox = new Box();

        aBox.setbox(new Apple());
        oBox.setbox(new Orange());

        Apple ap = (Apple) aBox.getbox();
        Orange og = (Orange) oBox.getbox();

        System.out.println(ap);
        System.out.println(og);

    }
}
