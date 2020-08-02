package overloadingPractice.StringTest;

public class ImmutableString {
    public static void main(String[] args) {
        String AAA = "안녕하세요";
        String BBB = "안녕하세요";
        AAA = "내용이 바꼈어요";

        String str1 = "My String";
        String str2 = "My String";
        String str3 = "Your String";

        if (str1 == str2) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }

        if (str1 == str3) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }

    }
}
