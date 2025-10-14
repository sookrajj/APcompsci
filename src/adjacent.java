import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class adjacent {
    public static void main(String[] args) {
        try {
            //hi
            Scanner input = new Scanner(new File("src/adjacentest.dat"));
            Map<String, ArrayList<String>> map = new HashMap<>();
            while (input.hasNext()) {
                var line = input.nextLine();
                String[] g = line.split("-");
                if (map.containsKey(g[0])) {
                    map.get(g[0]).add(g[1]);
                } else {
                    map.put(g[0], new ArrayList<>());
                    map.get(g[0]).add(g[1]);
                }
                if (map.containsKey(g[1])) {
                    map.get(g[1]).add(g[0]);
                } else {
                    map.put(g[1], new ArrayList<>());
                    map.get(g[1]).add(g[0]);
                }
            }
            int count = 0;
            Map<String, Map<String, ArrayList<String>>> checks = new HashMap<>();
            for (String i : map.keySet()) {
                int seen = 0;
                for (String l : map.get(i)) {
                    int saw = 0;
                    if (map.containsKey(l)) {
                        for (String t : map.get(l)) {
                            if (t.contains("t")) {
                                count++;
                            } else {
                                seen++;
                                saw++;
                            }
                            
                            if (checks.containsKey(i)) {
                                if (checks.get(i).containsKey(l)) {
                                    if (!checks.get(i).get(l).contains(t)) {
                                        if (t.contains("t")) {
                                count++;
                            } else {
                                seen++;
                                saw++;
                            }
                                        checks.get(i).get(l).add(t);
                                    }
                                } else {
                                    checks.get(i).put(l, new ArrayList<>());
                                    checks.get(i).get(l).add(t);
                                }
                            } else {
                                checks.put(i, new HashMap<>());
                                checks.get(i).put(l, new ArrayList<>());
                                checks.get(i).get(l).add(t);
                            }
                        }
                    }
                }
            }
            System.out.println(checks);
            for (String i : checks.keySet()) {
                int seen = 0;
                    for (String d : checks.get(i).keySet()) {
                        int saw = 0;
                            for (String y : checks.get(i).get(d)) {
                                if (y.contains("t")) {
                                    count++;
                                } else {
                                    seen++;
                                    saw++;
                                }
                            }
                        if (d.contains("t") && saw > 0) {
                            count+= saw;
                            seen = 0;
                        }
                    }
                if (i.contains("t") && seen > 0) {
                    count += seen;
                    break;
                }
            }
            System.out.println(count);
            
            
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
