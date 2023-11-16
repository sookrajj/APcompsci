package Q2.test;

public class test {
    public static void main(String[] args) {
        int[] te = new int[30];
        for (int lcv = 0; lcv < te.length; lcv++) {
            int temp = (int) (Math.random() * 30);
            te[lcv] = temp;
        }
        for (int lcv = 0; lcv < te.length; lcv++) {
            testcl pop = new testcl(te[lcv]);
        }
    }
}
