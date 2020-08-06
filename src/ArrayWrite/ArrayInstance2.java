package ArrayWrite;

public class ArrayInstance2 {
    public static void main(String[] args) {
        Box[] ar = new Box[5];
        System.out.println("length : " + ar.length);
    }
}

class Box {
    private String conts;

    Box(String conts) {
        this.conts = conts;
    }

    public String toString() {
        return conts;
    }
}

