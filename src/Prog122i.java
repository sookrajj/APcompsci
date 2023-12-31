import java.util.*;

public class Prog122i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lcv = -25;
        double r = 3;
        double y = 1;
        double w = y/r;
        System.out.println("number      cube root      cube");
        while (lcv < 26) {
            if (lcv < 0) {
                double p = lcv * -1;
                double h = Math.pow(lcv, 3);
                double k = Math.pow(p, w);
                double t = k * -1;
                System.out.println(lcv + "      " + t + "      " + h);
                lcv += 1;
            }
            else {
                double h = Math.pow(lcv, 3);
                double k = Math.pow(lcv, w);
                System.out.println(lcv + "      " + k + "      " + h);
                lcv += 1;
            }
        }
    }
}
//number      cube root      cube
//-25.0      -2.924017738212866      -15625.0
//-24.0      -2.8844991406148166      -13824.0
//-23.0      -2.8438669798515654      -12167.0
//-22.0      -2.802039330655387      -10648.0
//-21.0      -2.7589241763811203      -9261.0
//-20.0      -2.7144176165949063      -8000.0
//-19.0      -2.668401648721945      -6859.0
//-18.0      -2.6207413942088964      -5832.0
//-17.0      -2.571281590658235      -4913.0
//-16.0      -2.5198420997897464      -4096.0
//-15.0      -2.46621207433047      -3375.0
//-14.0      -2.4101422641752297      -2744.0
//-13.0      -2.3513346877207573      -2197.0
//-12.0      -2.2894284851066637      -1728.0
//-11.0      -2.2239800905693152      -1331.0
//-10.0      -2.154434690031884      -1000.0
//-9.0      -2.080083823051904      -729.0
//-8.0      -2.0      -512.0
//-7.0      -1.912931182772389      -343.0
//-6.0      -1.8171205928321397      -216.0
//-5.0      -1.7099759466766968      -125.0
//-4.0      -1.5874010519681994      -64.0
//-3.0      -1.4422495703074083      -27.0
//-2.0      -1.2599210498948732      -8.0
//-1.0      -1.0      -1.0
//0.0      0.0      0.0
//1.0      1.0      1.0
//2.0      1.2599210498948732      8.0
//3.0      1.4422495703074083      27.0
//4.0      1.5874010519681994      64.0
//5.0      1.7099759466766968      125.0
//6.0      1.8171205928321397      216.0
//7.0      1.912931182772389      343.0
//8.0      2.0      512.0
//9.0      2.080083823051904      729.0
//10.0      2.154434690031884      1000.0
//11.0      2.2239800905693152      1331.0
//12.0      2.2894284851066637      1728.0
//13.0      2.3513346877207573      2197.0
//14.0      2.4101422641752297      2744.0
//15.0      2.46621207433047      3375.0
//16.0      2.5198420997897464      4096.0
//17.0      2.571281590658235      4913.0
//18.0      2.6207413942088964      5832.0
//19.0      2.668401648721945      6859.0
//20.0      2.7144176165949063      8000.0
//21.0      2.7589241763811203      9261.0
//22.0      2.802039330655387      10648.0
//23.0      2.8438669798515654      12167.0
//24.0      2.8844991406148166      13824.0
//25.0      2.924017738212866      15625.0