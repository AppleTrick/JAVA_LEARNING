package ObjectClass.Practice3;

public class StringEquality {
    public static void main(String[] args) {
        String str1 = new String("So Simple");
        String str2 = new String("So Simple");
        String str3 = "So simple";
        String str4 = "So simple";


        if (str1 == str2) {
            System.out.println("str1 , str2 참조 대상 동일하다");
        } else {
            System.out.println("str1 , str2 참조 대상 다르다");
        }

        if (str1.equals(str2)) {
            System.out.println("str1 , str2 참조 대상 동일하다");
        } else {
            System.out.println("str1 , str2 참조 대상 다르다");
        }

        if (str3 == str4) {
            System.out.println("str1 , str2 참조 대상 동일하다");
        } else {
            System.out.println("str1 , str2 참조 대상 다르다");
        }

    }
}
