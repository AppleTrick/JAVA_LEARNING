package ExtendExample;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS.count ++;

        SuperCLS superCLS1 = new SuperCLS();
        SuperCLS superCLS2 = new SuperCLS();

        SubCLS subCLS = new SubCLS();

        subCLS.showCount();
    }
}

class SuperCLS {
    protected static int count = 0;

    public SuperCLS() {
        count ++;
    }
}

class SubCLS extends SuperCLS {
    public void showCount() {
        System.out.println(count);
    }
}


