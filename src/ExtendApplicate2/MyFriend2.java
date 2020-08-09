package ExtendApplicate2;

public class MyFriend2 {
    public static void main(String[] args) {
        Friend[] friends = new Friend[4];
        int cnt = 0;
        //대학 동창의 정보
        friends[cnt++] = new UnivFriend("LEE", "computer", "010-1111-1111");
        friends[cnt++] = new UnivFriend("SEO", "Electronics", "010-2222-2222");

        //직장 동료의 정보 저장
        friends[cnt++] = new CompFriend("YOON", "R&D 1 ", "010-3333-3333");
        friends[cnt++] = new CompFriend("PARK", "R&D 2 ", "010-4444-4444");

        //모든 동창 및 동료의 정보 전체 출력
        for (Friend e : friends) {
            e.showInfo();
            System.out.println();
        }
    }
}

class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phone);
    }
}

class UnivFriend extends Friend{      //대학 동기
    private String major;

    public UnivFriend(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("전공 : " + major);
    }
}

class CompFriend extends Friend {      //직장 동료
    private String department;

    public CompFriend(String name, String phone, String department) {
        super(name, phone);
        this.department = department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("부서 : " + department);
    }
}
