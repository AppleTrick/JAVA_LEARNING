package Generics1.Practice1;

public class FruitAndBox {
    public static void main(String[] args) {
        AppleBox appleBox = new AppleBox();
        OrangeBox orangeBox = new OrangeBox();

        appleBox.setAp(new Apple());
        orangeBox.setOr(new Orange());

        Apple ap = appleBox.getAp();
        Orange or = orangeBox.getOr();

        System.out.println(ap);
        System.out.println(or);
    }
}

class Apple {
    @Override
    public String toString() {
        return "I am an apple";
    }
}

class Orange {
    @Override
    public String toString() {
        return "I am an Orange";
    }
}

class AppleBox {
    private Apple ap;

    public Apple getAp() {      //사과를 꺼낸다
        return ap;
    }

    public void setAp(Apple ap) { // 사과를 담는다
        this.ap = ap;
    }
}

class OrangeBox {
    private Orange or;

    public Orange getOr() { //오렌지를 꺼낸다
        return or;
    }

    public void setOr(Orange or) {// 오렌지를 담는다
        this.or = or;
    }
}

