package class_and_method.project4;

public class HowMethod {
    public static void main(String[] args) {
        AreaMath am = new AreaMath();
        PerimeterMath pm = new PerimeterMath();

        System.out.println("원의 넓이 : " + am.calCircleArea(2.4));
        System.out.println("직사각형 둘래 : " + pm.calRectanglePeri(2.0, 4.0));
    }
}

class AreaMath{
    public double calCircleArea(double rad) {
        SimpleMath sm = new SimpleMath();
        double result = sm.mul(rad,rad);
        result = sm.mul(result, SimpleMath.PI);
        return result;
//        원의 넓이 구하기
    }

    public double calRectangleArea(double width, double height) {
        SimpleMath sm = new SimpleMath();
        return sm.mul(width, height);
//        사각형 넓이 구하
    }
}

class PerimeterMath {
    public double calCirclePeri(double rad) {
        SimpleMath sm = new SimpleMath();
        double result = sm.mul(rad, 2);
        result = sm.mul(result, SimpleMath.PI);
        return result;
    }

    public double calRectanglePeri(double width, double height) {
        SimpleMath sm = new SimpleMath();
        return sm.add(sm.mul(2, width), sm.mul(2, height));
    }
}

class SimpleMath {
    public static final double PI = 3.1415;

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double min(double n1, double n2) {
        return n1 - n2;
    }

    public double mul(double n1, double n2) {
        return n1 * n2;
    }
}