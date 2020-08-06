package EnhanceFor;

public class EnhancedForInst {
    public static void main(String[] args) {
        Box[] ar = new Box[5];
        ar[0] = new Box(101,"coffe");
        ar[1] = new Box(202,"Computer");
        ar[2] = new Box(303, "Apple");
        ar[3] = new Box(404,"Dress");
        ar[4] = new Box(505,"Fairy-tale");

        for (Box e : ar) {
            if (e.getBoxNum() == 505) {
                System.out.println(e);
            }
        }
    }
}
class Box{
    private int boxNum;
    private String contents;

    public Box(int boxNum, String contents) {
        this.boxNum = boxNum;
        this.contents = contents;
    }

    public int getBoxNum() {
        return boxNum;
    }
    public String toString() {
        return contents;
    }
}
