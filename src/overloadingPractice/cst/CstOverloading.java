package overloadingPractice.cst;

public class CstOverloading {
    public static void main(String[] args) {
        Person man = new Person(951025, 187008467, 1995, 10, 25);
        Person woman = new Person(951111, 1995, 11, 11);

        man.showinfo();
        woman.showinfo();
    }
}

class Person {
    private int perId;
    private int milId;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Person(int perId, int milId, int birthYear, int birthMonth, int birthDay) {
        this.perId = perId;
        this.milId = milId;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public Person(int perId, int birthYear, int birthMonth, int birthDay) {
        this(perId, 0, birthYear, birthMonth, birthDay);
    }

    public void showinfo()
    {
        System.out.println(" 민번 " + perId);
        System.out.println(" 생년 월일 " + birthYear + " / " + birthMonth + " / " + birthDay);
        if (milId != 0) {
            System.out.println("군번 : " + milId);
        } else {
            System.out.println("군과 관계 없음");
        }
    }
}
