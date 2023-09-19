import java.util.Scanner;

public class Prog122d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x      y");
        int lcv = -13;
        while (lcv < 16) {
            lcv += 1;
            double m = Math.pow(lcv, 6);
            double l = 3 * Math.pow(lcv, 5);
            double d = 93 * Math.pow(lcv, 4);
            double p = 87 * Math.pow(lcv, 3);
            double n = 1596 * Math.pow(lcv, 2);
            double z = 1380 * lcv;
            double s = m - l - d + p + n - z - 2800;
            System.out.println(lcv + "      " + s);
        }
    }
}
//x      y
//-12      1897280.0
//-11      982800.0
//-10      453600.0
//-9      173888.0
//-8      45360.0
//-7      0.0
//-6      -6400.0
//-5      0.0
//-4      6048.0
//-3      7280.0
//-2      4320.0
//-1      0.0
//0      -2800.0
//1      -2592.0
//2      0.0
//3      2240.0
//4      0.0
//5      -10800.0
//6      -32032.0
//7      -60480.0
//8      -84240.0
//9      -78400.0
//10      0.0
//11      217728.0
//12      671840.0
//13      1496880.0
//14      2872800.0
//15      5033600.0
//16      8276688.0