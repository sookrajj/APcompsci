import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class filereader {
    // public static int counter = 0;
    //1 = north, 2 = east, 3 = south, 4 = west
    // public static int puzzlesolver(int tot, int placex, int placey, int endx, int endy, String[][] mat, int iter, int prev, Map<Integer, Stack<Integer>> map) {
        
    // }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/file.dat"));
            String nums = "";
            int count = 0;
            boolean pre = true;
            while (input.hasNext()) {
                var line = input.next();
                nums += line;
            }
            int numnums = 0;
            ArrayList<Integer> num = new ArrayList<>();
            for (int i = 0; i < nums.length(); i++) {
                if (i % 2 == 0) {
                    var val = Integer.parseInt(nums.substring(i, i+1));
                    for (int l = 0; l < val; l++) {
                        num.add(count);
                        numnums++;
                    }
                    count++;
                } else {
                    var val = Integer.parseInt(nums.substring(i, i+1));
                    for (int l = 0; l < val; l++) {
                        num.add(-1);
                    }
                }
            }
            System.out.println(num.size());
            ArrayList<Integer> used = new ArrayList<>();
            used.add(0);
            for (int i = num.size()-1; i > 0; i--) {
                // System.out.println(i);
                if (num.get(i) != -1) {
                    int place = num.get(i);
                    int pos = 0;
                    for (int r = i; r > 0; r--) {
                        // if (place == 8) System.out.println(r);
                        if (num.get(r) == place && !used.contains(place)) pos++;
                        else {
                            used.add(place);
                            break;
                        }
                    }
                    // for(int o : num) System.out.print(o + " ");
                    // if (place == 4) System.out.println(place + " " + pos);
                    for (int l = 0; l < i; l++) {
                        if (num.get(l) == -1) {
                            int negs = 0;
                            for (int r = l; r < numnums; r++) {
                                if (num.get(r) == -1) negs++;
                                else {
                                    // l += negs;
                                    break;
                                }
                            }
                            // System.out.println(place + " " + negs);
                            if ( pos <= negs && negs != 0 && pos != 0) {
                                // System.out.println(pos + " " + negs);
                                for (int r = 0; r < pos; r++) {
                                    // System.out.println(place);
                                    // System.out.println(num.get(num.indexOf(place)));
                                    num.set(l+r, place);
                                    num.set(i-r, -1);
                                    
                                }
                                // used.add(place);
                                negs -= pos;
                                i++;
                                // l += pos+1;
                                // for(int o : num) System.out.print(o + " ");
                                break;
                            }

                        }
                    }
                    // if (used.contains(place)) i--;
                    i -= pos;
                    
                }
            }
            
            // for(int i : num) System.out.print(i + " ");
            long tot = 0;
            for (int i = 0; i < num.size()/2; i++) {
                // System.out.print(num.get(i) + " ");
                if (num.get(i) != -1) {
                    System.out.print(num.get(i) + " " + i + " ");
                    tot += num.get(i) * i;
                }
            }
            
            System.out.println(tot);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   