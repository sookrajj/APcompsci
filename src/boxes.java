import java.util.*;
import java.io.File;
import java.io.IOException;

public class boxes {
    public static void things(int px, int py, String dirs, String[][] mat) {
        if (dirs.isEmpty()) return;
        else {
            if (dirs.substring(0, 1).equals(">")) {
                if (mat[px][py+1].equals(".")) {
                    mat[px][py] = ".";
                    mat[px][py+1] = "@";
                    things(px, py+1, dirs.substring(1), mat);
                } else if (mat[px][py+1].equals("#")) {
                    things(px, py, dirs.substring(1), mat);
                } else {
                    var num = 1;
                    var can = false;
                    while (py + num < mat[0].length) {
                        if (mat[px][py+num].equals(".")) can = true;
                        else num++;
                    }
                    if (can) {
                        for (int i = py+num; i > py; i--) {
                            mat[px][i] = "O";
                        }
                        mat[px][py+1] = "@";
                        mat[px][py] = ".";
                        things(px, py+1, dirs.substring(1), mat);
                    } else {
                        things(px, py, dirs.substring(1), mat);
                    }
                }
            } else if (dirs.substring(0, 1).equals("<")) {
                if (mat[px][py-1].equals(".")) {
                    mat[px][py] = ".";
                    mat[px][py-1] = "@";
                    things(px, py-1, dirs.substring(1), mat);
                } else if (mat[px][py-1].equals("#")) {
                    things(px, py, dirs.substring(1), mat);
                } else {
                    var num = 1;
                    var can = false;
                    while (py - num > 0) {
                        if (mat[px][py-num].equals(".")) can = true;
                        else num++;
                    }
                    if (can) {
                        for (int i = py-num; i < py; i++) {
                            mat[px][i] = "O";
                        }
                        mat[px][py-1] = "@";
                        mat[px][py] = ".";
                        things(px, py-1, dirs.substring(1), mat);
                    } else {
                        things(px, py, dirs.substring(1), mat);
                    }
                }
            } else if (dirs.substring(0, 1).equals("^")) {
                if (mat[px+1][py].equals(".")) {
                    mat[px][py] = ".";
                    mat[px+1][py] = "@";
                    things(px+1, py, dirs.substring(1), mat);
                } else if (mat[px+1][py].equals("#")) {
                    things(px, py, dirs.substring(1), mat);
                } else {
                    var num = 1;
                    var can = false;
                    while (px + num < mat.length) {
                        if (mat[px+num][py].equals(".")) can = true;
                        else num++;
                    }
                    if (can) {
                        for (int i = px+num; i > px; i--) {
                            mat[i][py] = "O";
                        }
                        mat[px+1][py] = "@";
                        mat[px][py] = ".";
                        things(px+1, py, dirs.substring(1), mat);
                    } else {
                        things(px, py, dirs.substring(1), mat);
                    }
                }
            } else if (dirs.substring(0, 1).equals("v")) {
                if (mat[px-1][py].equals(".")) {
                    mat[px][py] = ".";
                    mat[px-1][py] = "@";
                    things(px-1, py, dirs.substring(1), mat);
                } else if (mat[px-1][py].equals("#")) {
                    things(px, py, dirs.substring(1), mat);
                } else {
                    var num = 1;
                    var can = false;
                    while (px - num > 0) {
                        if (mat[px-num][py].equals(".")) can = true;
                        else num++;
                    }
                    if (can) {
                        for (int i = px-num; i < px; i++) {
                            mat[i][py] = "O";
                        }
                        mat[px-1][py] = "@";
                        mat[px][py] = ".";
                        things(px-1, py, dirs.substring(1), mat);
                    } else {
                        things(px, py, dirs.substring(1), mat);
                    }
                }
            }
        }
      return;
      
    }
  
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/muls.dat"));
            ArrayList<String> pre = new ArrayList<>();
            while (input.hasNext()) {
                String line = input.nextLine();
                pre.add(line);
            }
          int size = 0;
          for (int i = 0; i < pre.size(); i++) if (pre.get(i).equals("")) {size = i-1; break;}
            String[][] mat = new String[size][pre.get(0).length()]
            var px = 0;
            var py = 0;
            for (int i = 0; i < size; i++) {
              var line = pre.get(pre.size()-i-1);
              for (int l = 0; l < line.length(); l++) {
                mat[i][l] = line.substring(l, l+1);
                if (line.substring(l, l+1).equals("@")) px = i; py = l;
              }
            }
          for (int i = 0; i < size+1; i++) pre.remove(0);
          var dirs = "";
          for (int i = 0; i < pre.size(); i++) dirs += pre.get(i);
            things(px, py, dirs, mat);
          int tot = 0;
          for (int i = 0; i < mat.length; i++) {
              for (int l = 0; l < mat[i].length; l++) {
                if (mat[i][l].equals("O")) tot += (i+1) * (l+1);
              }
            }
          System.out.println(tot);
            
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
