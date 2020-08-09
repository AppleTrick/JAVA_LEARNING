package ExtendExample2;

public class YummyCakeSize {
    public static void main(String[] args) {
        CheeseCake ca1 = new CheeseCake(5,7);
        Cake ca2 = ca1;

        System.out.println("Bread Ounces " + ca2.size);

        System.out.println("Cheese Ounces " + ca1.size);
        System.out.println();

        ca1.showCakeSize();
        System.out.println();
        ca2.showCakeSize();
    }
}

class Cake {
    public int size;

    public Cake(int size) {
        this.size = size;
    }
    public void showCakeSize(){
        System.out.println("Bread Ounces: " + size);
    }
}

class CheeseCake extends Cake {
    public int size;

    public CheeseCake(int sz, int sz1) {
        super(sz);
        size = sz1;
    }

    @Override
    public void showCakeSize() {
        System.out.println("Bread Ounces: " + super.size);

        System.out.println("Cheese Ounces " + size);
    }
}
