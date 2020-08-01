package class_and_method.project4;

public class StaticValNoInst {
    public static void main(String[] args) {
        InstCnt instCnt = new InstCnt();

        InstCnt.instNum -= 15;

        System.out.println(InstCnt.instNum);
    }
}

class InstCnt
{
    static int instNum = 100;

    public InstCnt(){
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}
