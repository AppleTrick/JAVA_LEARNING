package normalClass.Practice2;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer iobj = Integer.valueOf(10);
        Double dobj = Double.valueOf(3.14);

        System.out.println(iobj);
        System.out.println(dobj);

        System.out.println();

        int num1 = iobj.intValue();
        double num2 = dobj.doubleValue();
        System.out.println(num1);
        System.out.println(num2);

        System.out.println();

        iobj = Integer.valueOf(iobj.intValue() + 10);
        dobj = Double.valueOf(dobj.doubleValue() + 1.2);
        System.out.println(iobj);
        System.out.println(dobj);

    }
}
