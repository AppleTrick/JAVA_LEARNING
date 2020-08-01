package class_and_method.project4;

class NumberPrinter{
    public static void showInt(int n){
        System.out.println(n);
    }

    public static void showDouble(double n) {
        System.out.println(n);
    }
}

public class ClassMethod {
    public static void main(String[] args) {
        NumberPrinter.showInt(20);
        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);

    }
}

//인스턴스를 생성하지 않아도 static 메소드를 호출할 수 있음