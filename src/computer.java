import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class computer {
    public static long adv(long a, long op) {
        return (long) (a/(long)(Math.pow(2, op)));
    }
    
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/computer.dat"));
            long a = -1; 
            long b = -1;
            long c = -1;
            while (input.hasNext()) {
                var line = input.nextLine();
                if (a == -1) {
                    var g = line.split(" ");
                    a = Integer.parseInt(g[2]);
                    line = input.nextLine();
                    g = line.split(" ");
                    b = Integer.parseInt(g[2]);
                    line = input.nextLine();
                    g = line.split(" ");
                    c = Integer.parseInt(g[2]);
                    line = input.nextLine();
                } else {
                    var g = line.split(" ");
                    var nums = g[1].split(",");
                    int num = -1;
                    String tg = "";
                    String str = "";
                    for (int i = 0; i < nums.length; i+= 2) {
                        var op = Integer.parseInt(nums[i]);
                        long val = Long.parseLong(nums[i+1]);
                        if (op == 0) {
                            var t = val;
                            t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                            if (val != 7) a = adv(a, t);
                        } else if (op == 1) {
                            b = b^val;
                        } else if (op == 2) {
                            var t = val;
                            t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                            if (val != 7) b = t%8;
                        } else if (op == 3) {
                            if (a != 0) {
                                i = (int) val-2;
                            }
                        } else if (op == 4) {
                            b = b^c;
                        } else if (op == 5) {
                            var t = val;
                            t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                            if (val != 7) str += t%8 +",";
                        } else if (op == 6) {
                            var t = val;
                            t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                            if (val != 7) b = adv(a, t);
                        } else if (op == 7) {
                            var t = val;
                            t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                            if (val != 7) c = adv(a, t);
                        } 
                    }
                    tg = g[1];
                    str = "";
                    System.out.println(tg);
                    int y = 2;
                    // System.out.println(tg);
                    for (int l = 100000000; l < 1000000000; l++) {
                        if (l != 0) {
                            a = (long)Math.pow(10, 11) + l;
                            for (int i = 0; i < nums.length; i+= 2) {
                            var op = Integer.parseInt(nums[i]);
                            long val = Long.parseLong(nums[i+1]);
                            if (op == 0) {
                                var t = val;
                                t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                                if (val != 7) a = adv(a, t);
                            } else if (op == 1) {
                                b = b^val;
                            } else if (op == 2) {
                                var t = val;
                                t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                                if (val != 7) b = t%8;
                            } else if (op == 3) {
                                if (a != 0) {
                                    i = (int) val-2;
                                }
                            } else if (op == 4) {
                                b = b^c;
                            } else if (op == 5) {
                                var t = val;
                                t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                                if (val != 7) str += t%8 +",";
                            } else if (op == 6) {
                                var t = val;
                                t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                                if (val != 7) b = adv(a, t);
                            } else if (op == 7) {
                                var t = val;
                                t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                                if (val != 7) c = adv(a, t);
                            } 
                            if (!tg.substring(0, str.length()).equals(str)) {break;}
                            if (str.length() > y) if (tg.substring(0, str.length()).equals(str)) {System.out.println(((long)Math.pow(10, 11) + l) + " " + str); y += 2;}
                            if (str.length()+1 > tg.length()) {break;}
                            }
                            // System.out.println(a + " " + str);
                            if (str.equals(tg)) {System.out.println(l + " " + str);
                                break;
                            }
                            str = "";
                        }
                    }
                    a = 47530497;
                    // for (int i = 0; i < nums.length; i+= 2) {
                    //     var op = Integer.parseInt(nums[i]);
                    //     var val = Integer.parseInt(nums[i+1]);
                    //     if (op == 0) {
                    //         var t = val;
                    //         t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                    //         if (val != 7) a = adv(a, t);
                    //     } else if (op == 1) {
                    //         b = b^val;
                    //     } else if (op == 2) {
                    //         var t = val;
                    //         t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                    //         if (val != 7) b = t%8;
                    //     } else if (op == 3) {
                    //         if (a != 0) {
                    //             i = val-2;
                    //         }
                    //     } else if (op == 4) {
                    //         b = b^c;
                    //     } else if (op == 5) {
                    //         var t = val;
                    //         t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                    //         if (val != 7) System.out.print(t%8 +",");
                    //     } else if (op == 6) {
                    //         var t = val;
                    //         t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                    //         if (val != 7) b = adv(a, t);
                    //     } else if (op == 7) {
                    //         var t = val;
                    //         t = t == 4 ? a : t == 5 ? b : t == 6 ? c : t;
                    //         if (val != 7) c = adv(a, t);
                    //     } 
                    // }
                }
            }
        
            System.out.println();
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   