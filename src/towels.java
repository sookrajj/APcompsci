import java.util.*;
import java.io.File;
import java.io.IOException;

public class towels {
    public static boolean check(String checkto, Map<String, ArrayList<String>> map) {
        // if (checkto.isEmpty()) return true;
        if (map.containsKey(checkto.substring(0,1)) {
            var coms = map.get(checkto.substring(0,1));
            for (int i = 0; i < coms.size(); i++) {
              if (checkto.contains(coms.get(i)) {
                  if (checkto.equals(coms.get(i)) return true;
                  else {
                      check(checkto.substring(coms.get(i).length), map);
                  }
              }
            }
        }

        return false;
    }
  
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/muls.dat"));
            Map<String, ArrayList<String>> map = new HashMap();
            var change = false;
            int tot = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.isEmpty()) {
                    change = true;
                    line = input.nextLine();
                }
                //System.out.println(line);
                if (!change) {
                  var g = line.split(", ");
                  for (int i = 0; i < g.length; i++) {
                    if (map.containsKey(g[i].substring(0,1)) {
                        map.get(g[i].substring(0,1)).add(g[i]);
                    } else {
                      map.put(g[i].substring(0,1), new ArrayList<>());
                      map.get(g[i].substring(0,1)).add(g[i]);
                    }
                  }
                } else {
                    tot += check(line, map) ? 1 : 0;
                }
            }
          System.out.println(tot);
                
                
            
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
