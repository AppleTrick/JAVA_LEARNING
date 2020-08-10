package InterfacePractice2;

public class PrinterDriver {
    public static void main(String[] args) {
        String myDoc = "this is a report about ...";

        Printable prn = new sPrinterDrive();
        prn.print(myDoc);
        System.out.println();

        prn = new lPrinterDrive();
        prn.print(myDoc);

    }
}

interface Printable {
    public void print(String doc);
}

class sPrinterDrive implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}

class lPrinterDrive implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From Lg printer");
        System.out.println(doc);
    }
}
