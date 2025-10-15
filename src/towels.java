import java.util.*;
import java.io.File;
import java.io.IOException;

public class towels {
    public static boolean check(String checkto, Map<String, ArrayList<String>> map, int iter) {
        // if (checkto.isEmpty()) return true;
        ArrayList<String> tried = new ArrayList<>();
        if (iter > 10) return false;
        boolean hi = false;
        if (map.containsKey(checkto.substring(0,1))) {
            var coms = map.get(checkto.substring(0,1));
            for (int i = 0; i < checkto.length(); i++) {
                if (coms.contains(checkto)) return true;
                if (coms.contains(checkto.substring(0,i))) {
                    hi = check(checkto.substring(i), map, iter+1);
//                    break;
                }
            }
//            for (int i = 0; i < coms.size(); i++) {
//                for (String l : tried) if (l.contains(coms.get(i))) break;
//                tried.add(coms.get(i));
//              if (checkto.length() >= coms.get(i).length()) {
//                    if (checkto.startsWith(coms.get(i))) {
//                        System.out.println(checkto);
//                        if (checkto.equals(coms.get(i))) return true;
//                        else {
//                            hi = check(checkto.substring(coms.get(i).length()), map);
//                            break;
//                        }
//                    }
//                }
//            }
        }

        return hi;
    }
  
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/towels.dat"));
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
                    if (map.containsKey(g[i].substring(0,1))) {
                        map.get(g[i].substring(0,1)).add(g[i]);
                    } else {
                      map.put(g[i].substring(0,1), new ArrayList<>());
                      map.get(g[i].substring(0,1)).add(g[i]);
                    }
                  }
                } else {
                    System.out.println("hi");
                    tot += check(line, map, 0) ? 1 : 0;
                }
            }
          System.out.println(tot);
                
                
            
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
