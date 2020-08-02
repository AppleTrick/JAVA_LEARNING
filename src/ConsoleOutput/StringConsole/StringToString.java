package ConsoleOutput.StringConsole;

public class StringToString {
    public static void main(String[] args) {
        Friend fnd1 = new Friend("박창희");
        Friend fnd2 = new Friend("박박");

        System.out.println(fnd1);
        System.out.println(fnd2);

        System.out.println(fnd1.newStirng());
    }
}
class Friend
{
    String myName;

    public Friend(String myName) {
        this.myName = myName;
    }

    public String toString() {
        return " 제 이름은 " + myName + "입니다";
    }

    public String newStirng() {
        return "내이름은 " + myName;
    }
}
