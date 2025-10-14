import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class restroom {
    public static class robot {
        public int px;
        public int py;
        public int vx;
        public int vy;
        public robot(int px, int py, int vx, int vy) {
            this.px = px;
            this.py = py;
            this.vx = vx;
            this.vy = vy;
        }
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/restroom.dat"));
            int tot = 0;
            // System.out.println((long)Math.pow(10, 13));
            // ArrayList<Long> primes = new ArrayList<>();
            // for (int i = 0; i < Math.pow(10, 12); i++) if (isPrime(i)) primes.add(i);
            int q1 = 0;
            int q2 = 0;
            int q3 = 0;
            int q4 = 0;
            ArrayList<robot> robots = new ArrayList<>();
            int[][] pluh = new int[101][103];
            for (int i = 0; i < 101; i++) {
                for (int l = 0; l < 103; l++) pluh[i][l] = 0;
            }
            while (input.hasNext()) {
                var line = input.nextLine();
                var g = line.split(" ");
                var h = g[0].split(",");
                var px = Integer.parseInt(h[0].substring(2));
                var py = Integer.parseInt(h[1]);
                var v = g[1].split(",");
                var vx = Integer.parseInt(v[0].substring(2));
                var vy = Integer.parseInt(v[1]);
                robots.add(new robot(px, py, vx, vy));
            }
            // for (int i = 0; i < 101; i++) {
            //     for (int l = 0; l < 103; l++) System.out.print(pluh[i][l]);
            //     System.out.println();
            // }
            // System.out.println(q1 + " " + q2 + " " + q3 + " " + q4);
            
            for (long i = 1000000; i < 1000000000; i++) {
//                System.out.print(i + " ");
                for (int l = 0; l < robots.size(); l++) {
                    var r = robots.get(l);
                    pluh[r.px][r.py] = 0;
                    if (r.px + r.vx < 0) {
                        r.px = 101+(r.vx+r.px);
                    } else if (r.px + r.vx >= 101) {
                        r.px = (r.px+r.vx)%101;
                    } else {
                        r.px += r.vx;
                    }
                    if (r.py + r.vy < 0) {
                        r.py = 103+(r.vy+r.py);
                    } else if (r.py + r.vy >= 103) {
                        r.py = (r.py+r.vy)%103;
                    } else {
                        r.py += r.vy;
                    }
                    pluh[r.px][r.py] += 1;
                }
                boolean hline = false;
                for (int y = 0; y < 71; y++) {
                        for (int l = 0; l < 73; l++) {
                            boolean f = true;
                            for (int p = 0; p < 25; p++) {
                                if (pluh[y][l+p] == 0 || pluh[y+p][l] == 0) f = false;

                            }
                            if (f) {hline = true; break;}
                        }
                        if (hline) break;
                    }
                if (hline) {
                    for (int y = 0; y < 101; y++) {
                        for (int l = 0; l < 103; l++) {
                            if (pluh[y][l] == 0) System.out.print(" ");
                            else System.out.print("1");
                        }
                        System.out.println();
                    }
                    System.out.println("break" + i);
                }
                // px += vx * 100;
                // py += vy * 100;
                // px = px%11;
                // py = py%7;
                // System.out.println(px + " " + py);
            }
        
            
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   