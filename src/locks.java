import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class java {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/restroom.dat"));
            Map<Integer, ArrayList<Integer>> lock = new HashMap<>();
            Map<Integer, ArrayList<Integer>> keys = new HashMap<>();
            
            while (input.hasNext()) {
                var line = input.nextLine();
                if (line.contains(".") {
                    keys.add(keys.size(), new ArrayList<>());
                    keys.get(keys.size()-1).add(0);
                    keys.get(keys.size()-1).add(0);
                    keys.get(keys.size()-1).add(0);
                    keys.get(keys.size()-1).add(0);
                    keys.get(keys.size()-1).add(0);
                    for (int i = 0; i < 5; i++) {
                      var s = input.nextLine();
                      for (int l = 0; l < 5; l++) {
                        if (s.substring(l,l+1).equals(".")) {
                          keys.get(keys.size()-1).put(l, keys.get(keys.size()-1).get(l)+1);
                        }
                      }
                    }
                    
                } else {
                    lock.add(lock.size(), new ArrayList<>());
                    lock.get(lock.size()-1).add(0);
                    lock.get(lock.size()-1).add(0);
                    lock.get(lock.size()-1).add(0);
                    lock.get(lock.size()-1).add(0);
                    lock.get(lock.size()-1).add(0);
                    for (int i = 0; i < 5; i++) {
                      var s = input.nextLine();
                      for (int l = 0; l < 5; l++) {
                        if (s.substring(l,l+1).equals(".")) {
                          lock.get(lock.size()-1).put(l, lock.get(lock.size()-1).get(l)+1);
                        }
                      }
                    }
                }
              input.nextLine();
              input.nextLine();
            }
          int tot = 0;
            for (Integer h : lock.keySet()) {
              var t = lock.get(h);
              for (Integer i : keys.keySet()) {
                  boolean good = true;
                  var e = keys.get(i);
                  for (int l = 0; l < 5; l++) {
                    if (t.get(l) + e.get(l) > 5) good = false;
                  }
                if (good) tot++;
              }
            }
          System.out.println(tot);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
