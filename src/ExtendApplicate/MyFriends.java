package ExtendApplicate;

public class MyFriends {
    public static void main(String[] args) {
        //대학 동창의 관리를 위한 배열과 변수
        UnivFriend[] univFriends = new UnivFriend[2];
        int ucnt = 0;

        //직장 동료의 관리르 위한 배열과 변수
        CompFriend[] compFriends = new CompFriend[2];
        int ccnt = 0;

        //대학 동창의 정보
        univFriends[ucnt++] = new UnivFriend("LEE", "computer", "010-1111-1111");
        univFriends[ucnt++] = new UnivFriend("SEO", "Electronics", "010-2222-2222");

        //직장 동료의 정보 저장
        compFriends[ccnt++] = new CompFriend("YOON", "R&D 1 ", "010-3333-3333");
        compFriends[ccnt++] = new CompFriend("PARK", "R&D 2 ", "010-4444-4444");

        //모든 동창 및 동료의 정보 전체 출력
        for (UnivFriend e : univFriends) {
            e.showInfo();
            System.out.println();
        }

        for (CompFriend c : compFriends) {
            c.showInfo();
            System.out.println();
        }
    }
}

class UnivFriend {      //대학 동
    private String name;
    private String major;
    private String phone;

    public UnivFriend(String name, String major, String phone) {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전공 : " + major);
        System.out.println("전화 : " + phone);
    }
}

class CompFriend {      //직장 동료
    private String name;
    private String department;
    private String phone;

    public CompFriend(String name, String department, String phone) {
        this.name = name;
        this.department = department;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전공 : " + department);
        System.out.println("전화 : " + phone);
    }
}
