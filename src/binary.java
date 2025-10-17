import java.util.*;
import java.io.File;
import java.io.IOException;

public class binary {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/nums.dat"));
            Map<String, Integer> map = new HashMap<>();
            ArrayList<String> eqs = new ArrayList<>();
            boolean check = true;
            while (input.hasNext()) {
              var line = input.nextLine();
              if (line.isEmpty()) {
                check = false;
                line = input.nextLine();
              }
              if (check) {
                  var g = line.split(": ");
                  map.put(g[0], Integer.parseInt(g[1]));
              } else {
                  eqs.add(line);
              }
            }
            while (!eqs.isEmpty()) {
                for (int i = 0; i < eqs.size(); i++) {
                    var eq = eqs.get(i).split(" ");
                    if (map.contains(eq[0]) && map.contains(eq[2])) {
                            var b1 = map.get(eq[0]);
                            var b2 = map.get(eq[2]);
                            if (eq[1].equals("AND")) {
                                    if (b1 == b2 && b1 == 1) map.put(eq[4], 1);
                                    else map.put(eq[4], 0);
                            }
                            if (eq[1].equals("OR")) {
                                    if (b1 == 1 || b2 == 1) map.put(eq[4], 1);
                                    else map.put(eq[4], 0);
                            }
                            if (eq[1].equals("XOR")) {
                                    if ((b2 == 0 && b1 == 1) || (b1 == 0 && b2 == 1)) map.put(eq[4], 1);
                                    else map.put(eq[4], 0);
                            }
                        eqs.remove(i);
                    }

                }
            }
            String bi = "":
            for (String t : map.keySet()) {
                if (t.StartsWith("Z")) {
                    bi += (String) map.get(t);
                }
            }
            long convert = 0;
            for (int i = bi.length()-1; i > 0; i--) {
                convert += Math.pow(2, bi.length -i) * Integer.parseInt(bi.substring(i, i+1);
            }
            System.out.println(convert);
            
//            System.out.println(count);
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}  
