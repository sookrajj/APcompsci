import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class numl {
    public static long calc(long n1) {
        n1 = ((n1*64) ^ n1) % 16777216;
        n1 = ((long)(Math.floor(n1/32)) ^ n1) % 16777216;
        n1 = ((n1*2048) ^ n1) % 16777216;
        return n1;
    }
    // public helper {
    //     Long n1;
    //     Long n2;
    //     Long n3;
    //     Long n4;
        
    //     public helper(Long p1, Long p2, Long p3, Long p4) {

    //     }
    // }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/22nums.dat"));
            Map<Long, Long[]> map = new HashMap<>();
            // long nul = 123;
            // long nl = calc(nul);
            // System.out.println(nl);
            // for (int i = 0; i < 9; i++) {
            //     nl = calc(nl);
            //     System.out.println(nl);
            // }
            Long[] longs = new Long[2000];
            while (input.hasNext()) {
                String line = input.nextLine();
                longs = new Long[2000];
                long nu = Long.parseLong(line);
                long n = calc(nu);
                int i = 0;
                longs[i] = n;
                for (i = 1; i < 2000; i++) {
                    longs[i] = calc(longs[i-1]);
                }
                // n = ((n*64) ^ n) % 16777216;
                // n = ((long)(Math.floor(n/32)) ^ n) % 16777216;
                map.put(nu, longs);
                
                
            }
            long tot = 0;
            var t = map.keySet();
            var iter = t.iterator();
            while (iter.hasNext()) {
                var p = iter.next();
                Long[] pr = map.get(p);
                Long[] plo = new Long[2000];
                for (int i =0; i < pr.length; i++) {
                    plo[i] = pr[i]% 10;
                }
                map.put(p, plo);
                // System.out.println(p + " " + map.get(p));
            }
            iter = t.iterator();
            Map<Integer, Map<Integer, Map<Integer, Map<Integer, Integer>>>> seq = new HashMap();
            while (iter.hasNext()) {
                var p = iter.next();
                ArrayList<Integer> nums1 = new ArrayList<>();
                ArrayList<Integer> nums2 = new ArrayList<>();
                ArrayList<Integer> nums3 = new ArrayList<>();
                ArrayList<Integer> nums4 = new ArrayList<>();
                ArrayList<Integer> nums5 = new ArrayList<>();
                for (int i = 0; i < map.get(p).length-4; i++) {
                    // Integer n1 = Math.toIntExact(map.get(p)[i-1]);
                    Integer n2 = Math.toIntExact(map.get(p)[i]);
                    Integer n3 = Math.toIntExact(map.get(p)[i+1]);
                    Integer n4 = Math.toIntExact(map.get(p)[i+2]);
                    Integer n5 = Math.toIntExact(map.get(p)[i+3]);
                    
                    Integer n1 = Math.toIntExact(map.get(p)[i+4]);
                    
                    n2 = n3 - n2; n3 = n4 - n3; n4 = n5- n4; n5 = n1 - n5;
                    // System.out.print(n1 + " ");
                    var cont = true;
                    // if (n2 == -2 && n3 == 1 && n4 == -1 && n5 == 3) {
                    //     System.out.println(Math.toIntExact(map.get(p)[i]));
                    //     System.out.println(Math.toIntExact(map.get(p)[i+1]));
                    //     System.out.println(Math.toIntExact(map.get(p)[i+2]));
                    //     System.out.println(Math.toIntExact(map.get(p)[i+3]));
                    //     System.out.println(Math.toIntExact(map.get(p)[i+4]));
                    //     System.out.println(n1);
                    // }
                    for (int l = 0; l < nums1.size(); l++) {
                        
                        // System.out.println((nums1.get(l) == n2) +" "+ (nums2.get(l) == n3)
                            // +" "+ (nums3.get(l) == n4) +" "+ (nums4.get(l) == n5));
                        if (nums1.get(l) == n2 && nums2.get(l) == n3
                            && nums3.get(l) == n4 && nums4.get(l) == n5) {
                                cont = false;
                                // if (nums5.get(l) < n1) nums5.set(l, n1);
                                // System.out.println("hi");
                            }
                    }
                   if (cont) {
                        nums1.add(n2);
                        nums2.add(n3);
                        nums3.add(n4);
                        nums4.add(n5);
                        nums5.add(n1);
                   }
                }
                // System.out.println(nums1.size());
                for (int i = 0; i < nums1.size(); i++) {
                    Integer n2 = nums1.get(i);
                    Integer n3 = nums2.get(i);
                    Integer n4 = nums3.get(i);
                    Integer n5 = nums4.get(i);
                    Integer n1 = nums5.get(i);
                        if (seq.containsKey(n2)) {
                        if (seq.get(n2).containsKey(n3)) {
                            if (seq.get(n2).get(n3).containsKey(n4)) {
                                if (seq.get(n2).get(n3).get(n4).containsKey(n5)) {
                                    // System.out.println(seq.get(n2).get(n3).get(n4).get(n5) + " " + n1 + " ");
                                    seq.get(n2).get(n3).get(n4).put(n5, seq.get(n2).get(n3).get(n4).get(n5) + n1);
                                } else {
                                    seq.get(n2).get(n3).get(n4).put(n5, n1);
                                }
                            } else {
                                seq.get(n2).get(n3).put(n4, new HashMap<>());
                                seq.get(n2).get(n3).get(n4).put(n5, n1);
                            }
                        } else {
                            seq.get(n2).put(n3, new HashMap<>());
                            seq.get(n2).get(n3).put(n4, new HashMap<>());
                            seq.get(n2).get(n3).get(n4).put(n5, n1);
                        }
                    } else {
                        seq.put(n2, new HashMap<>());
                        seq.get(n2).put(n3, new HashMap<>());
                        seq.get(n2).get(n3).put(n4, new HashMap<>());
                        seq.get(n2).get(n3).get(n4).put(n5,n1);
                    }
                    // nums1.add(n2);
                    // nums2.add(n3);
                    // nums3.add(n4);
                    // nums4.add(n5);
                    // nums5.add(n1);
                
                }
            }
            var f = seq.keySet();
            var ite = f.iterator();
            // System.out.println(seq);
            while (ite.hasNext()) {
                var p = ite.next();
                var a = seq.get(p).keySet();
                var b = a.iterator();
                // System.out.println(seq.get(p));
                while (b.hasNext()) {
                    var l = b.next();
                    var c = seq.get(p).get(l).keySet();
                    var d = c.iterator();
                    // System.out.println(seq.get(c));
                    while (d.hasNext()) {
                        var o = d.next();
                        var e = seq.get(p).get(l).get(o).keySet();
                        var g = e.iterator();
                        // System.out.println(seq.get(e));
                        while (g.hasNext()) {
                            var h = g.next();
                            int j = seq.get(p).get(l).get(o).get(h);
                            // System.out.print(j + " ");
                            if (j > tot) {
                                tot = j;
                                // System.out.println(p + " " + l + " " + o + " " + h + " " + j);
                            }
                            
                            // if (p == -2 && l == 1 && o == -1 && h == 3) System.out.println(j);
                        }
                    }
                }
            }

            System.out.println(tot);
                
                
            
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   