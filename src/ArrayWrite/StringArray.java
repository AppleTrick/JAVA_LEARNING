package ArrayWrite;

public class StringArray {
    public static void main(String[] args) {
        String[] st = new String[7];
        st[0] = new String("Java");
        st[1] = new String("System");
        st[2] = new String("Compiler");
        st[3] = new String("Park");
        st[4] = new String("Tree");
        st[5] = new String("Dinner");
        st[6] = new String("Brunch Cafe");

        int cnum = 0;

        for (int i = 0; i < st.length; i++) {
            cnum += st[i].length();

            System.out.println("총 문자 수 : " + cnum);
        }
    }
}

