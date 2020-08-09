package ExtendExample;

public class MobileSmartPhone {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("010-5555-7777","nugat");
        phone.answer();
        phone.playApp();

        MobilePhone phone1 = new SmartPhone("010-1111-2222","icecream");
        phone1.answer();
    }
}

class MobilePhone {
    protected String number;    //전화번호

    public MobilePhone(String number) {
        this.number = number;
    }
    public void answer() {
        System.out.println("Hi ~ from " + number);
    }
}

class SmartPhone extends MobilePhone {
    private String androidVer;

    public SmartPhone(String number, String androidVer) {
        super(number);
        this.androidVer = androidVer;
    }

    public void playApp() {
        System.out.println("App is running in " + androidVer);
    }
}
