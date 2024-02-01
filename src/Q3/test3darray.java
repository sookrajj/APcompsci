package Q3;

public class test3darray {
    public static void main(String[] args) {

        int[][][] hi = new int[4][12][6];
        System.out.println(hi.length);
        System.out.println(hi[0].length);
        System.out.println(hi[0][0].length);
        int cnt = 1;
        for (int z = 0; z < hi.length; z++) {
            for (int y = 0; y < hi[0].length; y++) {
                for (int x = 0; x < hi[0][0].length; x++) {
                    hi[z][y][x] = cnt;
                    cnt++;
                }
            }
        }
        for (int z = 0; z < hi.length; z++) {
            for (int y = 0; y < hi[0].length; y++) {
                for (int x = 0; x < hi[0][0].length; x++) {
                    System.out.print(hi[z][y][x] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
