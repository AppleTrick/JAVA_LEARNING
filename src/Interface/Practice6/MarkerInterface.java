package Interface.Practice6;

public class MarkerInterface {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Report doc = new Report("Simple Funny News~");

        printer.printContents(doc);
    }
}

interface Upper {
    // 마커 인터페이스
}

interface Lower {
    //마커 인터페이스
}

interface Printable {
    String getContents();
}

class Report implements Printable, Upper {
    String cons;

    public Report(String cons) {
        this.cons = cons;
    }

    @Override
    public String getContents() {
        return cons;
    }
}

class Printer {
    public void printContents(Printable doc) {
        if (doc instanceof Upper) {
            System.out.println((doc.getContents()).toUpperCase());
        } else if (doc instanceof Lower) {
            System.out.println((doc.getContents()).toLowerCase());
        } else {
            System.out.println(doc.getContents());
        }
    }
}