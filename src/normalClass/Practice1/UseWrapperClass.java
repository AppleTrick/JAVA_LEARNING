package normalClass.Practice1;

public class UseWrapperClass {
    public static void main(String[] args) {
        Integer iInst = Integer.valueOf(3);
        showData(iInst);
        showData(Double.valueOf(7.15));
    }

    public static void showData(Object object) {
        System.out.println(object);
    }
}
