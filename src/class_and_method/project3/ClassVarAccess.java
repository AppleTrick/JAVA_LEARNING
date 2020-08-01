package class_and_method.project3;

class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        way.num++;
        AccessWay.num++;
        System.out.println("num = " + AccessWay.num);

        AccessWay way2 = new AccessWay();
        way2.num++;
        System.out.println("num = " + way2.num);
    }
}
class AccessWay{
    static int num= 0;

    AccessWay(){
        incrCrt();
    }
    public void incrCrt(){
        num ++;
    }
}
