package Generics1.Practice3;
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
public class FruitAndBoxFault  {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box oBox = new Box();

//        aBox.setbox(new Apple());
//        oBox.setbox(new Orange());
        // 아래 두문장에서는 사과와 오렌지가 아닌 '문자열' 을 넣었다
        aBox.setbox("Apple");
        oBox.setbox("Orange");

        //사과에 과일을 담기지 않았는데 과일을 꺼내려고 한다.
        Apple ap = (Apple) aBox.getbox();
        Orange og = (Orange) oBox.getbox();

        System.out.println(ap);
        System.out.println(og);

    }
}