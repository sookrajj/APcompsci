import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class claw {
    public static class button {
        long x;
        long y;
        public button(long x, long y) {this.x = x; this.y = y;}
        public long getX() {return x;}
        public long getY() {return y;}
    }
    // public static long good(long tks, button ba, button bb, long tx, long ty, long cx, long cy) {
    //     if (cx > tx || cy > ty) {
    //         return Long.MAX_VALUE;
    //     }
    //     if (cx == tx && cy == ty) {
    //         System.out.println("yippie");
    //         return tks;
    //     }
    //     // System.out.println(cx + " " + (cx+bb.getX()) + " " +cy +" " +(cy + ba.getY()));
    //     long l = good((tks+(long)1), ba, bb, tx, ty, cx+bb.getX(), cy+bb.getY());
    //     long f = good((tks+(long)3), ba, bb, tx, ty, cx+ba.getX(), cy+ba.getY());
    //     System.out.println(l + " " + f);
    //     if (l < f) return l;
    //     return f;
        
    // }
    public static boolean isPrime(long n) {
        // Corner case: Numbers less than or equal to 1 are not prime
        if (n < 1) {
            return false;
        }
        // Check for divisibility from 2 up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/claw.dat"));
            int tot = 0;
            // System.out.println((long)Math.pow(10, 13));
            // ArrayList<Long> primes = new ArrayList<>();
            // for (int i = 0; i < Math.pow(10, 12); i++) if (isPrime(i)) primes.add(i);
            while (input.hasNext()) {
                var line = input.nextLine();
                String[] g = line.split(" ");
                var line2 = input.nextLine();
                String[] g2 = line2.split(" ");
                var line3 = input.nextLine();
                String[] g3 = line3.split(" ");
                var ba = new button(Long.parseLong(g[2].substring(2, g[2].length()-1)), Long.parseLong(g[3].substring(2)));
                var bb = new button(Long.parseLong(g2[2].substring(2, g2[2].length()-1)), Long.parseLong(g2[3].substring(2)));
                long tx = Long.parseLong(g3[1].substring(2, g3[1].length()-1)) + (long)Math.pow(10, 13);
                long ty = Long.parseLong(g3[2].substring(2)) + (long)Math.pow(10, 13);
                // System.out.println(bb.x + " " + bb.y);
                long x = 0; long y = 0;
                long ta = 0; 
                long tb = 0;
                // ArrayList<Long> tickets = new ArrayList<>();
                var can = false;
                long cycles = ba.x + bb.x > ba.y+bb.y ? ba.x : ba.y;
                long c = cycles == ba.x ? bb.x : bb.y;
                for (long i = ty/c; i > 0; i-= 2) {
                    if (isPrime(i)) {
                        System.out.println(i);
                        System.out.println(ty%(c * i));
                        for (int l = 1; l < ty%(c * i)/c+1; l+= 2) {
                            if (isPrime(l)) {
                                if (tx % (ba.x*i + bb.x*l) == 0 && ty % (ba.y*i + bb.y*l) == 0) {
                                    System.out.print(l + " ");
                                    ta = i * tx / (ba.x*i + bb.x*l);
                                    tb = l * tx / (ba.x*i + bb.x*l);
                                    can = true;
                                    break;
                                }
                            }
                        }
                        System.out.println();
                        if (can) break;
                    }
                }
                // while (tx/ba.x > x && ty/ba.y > y) {
                //     long w = tx - x;
                //     long e = ty - y;
                //     if (w%bb.x == 0 && e/bb.y == w/bb.x && e %bb.y == 0) {
                //         tb = w/bb.x;
                //         break;
                //     }
                //     x++;
                //     while (!isPrime(x)) x++;
                //     y = x;
                //     ta = x;
                //     if (tx/ba.x == x && ty/ba.x == y) break;
                //     if (tx < x || ty < y) {ta = 0; break;}
                        
                    
                //     System.out.println(ta);
                // }
                // long low = Long.MAX_VALUE;
                // for (long i : tickets) if (i < low) low = i;
                // if (low == 100000) low = 0;
                tot += ta *3 + tb;
                System.out.println(tot);
                if (input.hasNext()) input.nextLine();
            }
            System.out.println(tot);
            
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   