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
                  var g = line.split(": );
                  map.put(g[0], Integer.parseInt(g[1]);
              } else {

              }
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}  
