package ObjectClass.Practice5;

public class ShallowCopy {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;

        try {
            cpy = (Rectangle) org.clone();  //인스턴스 복사
            org.changePos(2, 2, 7, 7);
            org.showPosition();
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Point implements Cloneable {
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println();

    }

    public void changePos(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Rectangle implements Cloneable {
    private Point upperLeft;    //좌측 상단 좌표
    private Point lowerRight;   //우측 하단 좌표

    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //얕은 복사
        //return super.clone();

        //깊은 복사
        //Object 클래스의 clone 메소드 호출을 통한 복사본 생성
        Rectangle copy = (Rectangle) super.clone();

        //깊은 복사의 형태로 복사본을 완성
        copy.upperLeft = (Point)upperLeft.clone();
        copy.lowerRight = (Point) lowerRight.clone();

        //완성된 복사본의 참조값 변화
        return copy;

    }

    public void showPosition() {
        System.out.println("좌측 상단");
        upperLeft.showPosition();

        System.out.println("우측 상단");
        lowerRight.showPosition();
        System.out.println();
    }
}
