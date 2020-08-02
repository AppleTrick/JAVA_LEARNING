package overloadingPractice.over;

public class Overloading {
    public static void main(String[] args) {
        Person man = new Person(951025, 1870008467);
        Person woman = new Person(951025);
        man.showInfo();
        woman.showInfo();
    }
}

class Person {
    private int perId;
    private int milId;

    public Person(int pId, int mId){
        perId = pId;
        milId = mId;
    }
    public Person(int pId){
        perId = pId;
        milId = 0;
    }
    public void showInfo() {
        System.out.println("민번 : " + perId);
        if (milId != 0) {
            System.out.println("군번 " + milId + '\n');
        } else {
            System.out.println("군과 관게 없음 \n");
        }
    }

}
