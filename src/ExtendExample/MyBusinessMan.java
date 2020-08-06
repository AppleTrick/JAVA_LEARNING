package ExtendExample;

public class MyBusinessMan {
    public static void main(String[] args) {
        BussinessMan bussinessMan = new BussinessMan("ChangHee", "Apple", "CTO");
        bussinessMan.tellYourInfo();
    }
}

class Man {
    String name;

    public Man(String name) {
        this.name = name;
    }

    public void tellYourName() {
        System.out.println("My name is " + name);
    }
}

class BussinessMan extends Man {
    String company;
    String position;

    public BussinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo(){
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellYourName();
    }
}
