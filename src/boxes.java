import java.util.*;
import java.io.File;
import java.io.IOException;

public class boxes {
//    public static void things(int px, int py, String dirs, String[][] mat) {
////        System.out.println(dirs);
////        if (dirs.length() == 700) System.out.println(px + " " + py);
//
//        return;
//
//    }
  
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/boxestest.dat"));
            ArrayList<String> pre = new ArrayList<>();
            while (input.hasNext()) {
                String line = input.nextLine();
                pre.add(line);
            }
            int size = 0;
            for (int i = 0; i < pre.size(); i++) if (pre.get(i).equals("")) {size = i; break;}
            String[][] mat = new String[size][pre.get(0).length()*2];
            System.out.println(size);
            var px = 0;
            var py = 0;
            for (int i = 0; i < size; i++) {
              var line = pre.get(size-i-1);
              for (int l = 0; l < line.length(); l++) {
                  if (line.substring(l, l+1).equals("#")) {mat[i][l*2] = line.substring(l, l+1); mat[i][l*2+1] = line.substring(l, l+1);}
                  else if (line.substring(l, l+1).equals(".")) {mat[i][l*2] = line.substring(l, l+1); mat[i][l*2+1] = line.substring(l, l+1);}
                  else if (line.substring(l, l+1).equals("O")) {mat[i][l*2] = "["; mat[i][l*2+1] = "]";}
                  else if (line.substring(l, l+1).equals("@")) {mat[i][l*2] = "@"; mat[i][l*2+1] = "."; px = i; py = l*2;}
              }
            }
            for (int i = 0; i < mat.length; i++) {
                for (int l = 0; l < mat[0].length; l++) {
                    System.out.print(mat[i][l]);
                    if (mat[i][l].equals("@")) {px = i; py = l; }
                }
                System.out.println();
            }
//            System.out.println(px + " " + py);
            for (int i = 0; i < size; i++) pre.remove(0);
            var dirs = "";
            for (int i = 0; i < pre.size(); i++) dirs += pre.get(i);
            while (!dirs.isEmpty()) {
                if (dirs.substring(0, 1).equals(">")) {
                    if (py+1 >= mat[0].length-1) {
                        dirs = dirs.substring(1);
                    } else if (mat[px][py+1].equals(".")) {
                        mat[px][py] = ".";
                        mat[px][py+1] = "@";
                        py++;
                        dirs = dirs.substring(1);
                    } else if (mat[px][py+1].equals("#")) {
                        dirs = dirs.substring(1);
                    } else {
                        var num = 1;
                        var can = false;
                        while (py + num < mat[0].length) {
                            if (mat[px][py+num].equals(".")) {can = true; break;}
                            else if (mat[px][py+num].equals("#")) break;
                            else num++;
                        }
                        if (can) {
                            for (int i = py+num; i > py; i--) {
                                mat[px][i] = "O";
                            }
                            mat[px][py+1] = "@";
                            mat[px][py] = ".";
                            py++;
                            dirs = dirs.substring(1);
                        } else {
                            dirs = dirs.substring(1);
                        }
                    }
                } else if (dirs.substring(0, 1).equals("<")) {
                    if (py-1 < 1) {
                        dirs = dirs.substring(1);
                    } else if (mat[px][py-1].equals(".")) {
                        mat[px][py] = ".";
                        mat[px][py-1] = "@";
                        py--;
                        dirs = dirs.substring(1);
                    } else if (mat[px][py-1].equals("#")) {
                        dirs = dirs.substring(1);
                    } else {
                        var num = 1;
                        var can = false;
                        while (py - num > 0) {
                            if (mat[px][py-num].equals(".")) {can = true; break;}
                            else if (mat[px][py-num].equals("#")) break;
                            else num++;
                        }
                        if (can) {
                            for (int i = py-num; i < py; i++) {
                                mat[px][i] = "O";
                            }
                            mat[px][py-1] = "@";
                            mat[px][py] = ".";

                            py--;
                            dirs = dirs.substring(1);
                        } else {
                            dirs = dirs.substring(1);
                        }
                    }
                } else if (dirs.substring(0, 1).equals("^")) {

                    if (px+1 >= mat.length-1) {
                        dirs = dirs.substring(1);
                    } else if (mat[px+1][py].equals(".")) {
                        mat[px][py] = ".";
                        mat[px+1][py] = "@";
                        px++;
                        dirs = dirs.substring(1);
                    } else if (mat[px+1][py].equals("#")) {
                        dirs = dirs.substring(1);
                    } else {
                        var num = 1;
                        var can = false;
                        while (px + num < mat.length) {
                            if (mat[px+num][py].equals(".")) {can = true; break;}
                            else if (mat[px+num][py].equals("#")) break;
                            else num++;
                        }
                        if (can) {
                            for (int i = px+num; i > px; i--) {
                                mat[i][py] = "O";
                            }
                            mat[px+1][py] = "@";
                            mat[px][py] = ".";
                            px++;
                            dirs = dirs.substring(1);
                        } else {
                            dirs = dirs.substring(1);
                        }
                    }
                } else if (dirs.substring(0, 1).equals("v")) {
                    if (px-1 < 1) {
                        dirs = dirs.substring(1);
                    } else if (mat[px-1][py].equals(".")) {
                        mat[px][py] = ".";
                        mat[px-1][py] = "@";
                        px--;
                        dirs = dirs.substring(1);
                    } else if (mat[px-1][py].equals("#")) {
                        dirs = dirs.substring(1);
                    } else {
                        var num = 1;
                        var can = false;
                        while (px - num > 0) {
                            if (mat[px-num][py].equals(".")) {can = true; break;}
                            else if (mat[px-num][py].equals("#")) break;
                            else num++;
                        }
                        if (can) {
//                        System.out.println(px + " " + num);
                            for (int i = px-num; i < px; i++) {
                                mat[i][py] = "O";
                            }
                            mat[px-1][py] = "@";
                            mat[px][py] = ".";

                            px--;
                            dirs = dirs.substring(1);
                        } else {
                            dirs = dirs.substring(1);
                        }
                    }
                }
            }
//            System.out.println("hi");
            int tot = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int l = 0; l < mat[i].length; l++) {
                    System.out.print(mat[i][l]);
                }
                System.out.println();
            }
            for (int i = 0; i < mat.length; i++) {
                for (int l = 0; l < mat[i].length; l++) {
//                    System.out.print(mat[i][l]);
                    if (mat[i][l].equals("O")) {tot += 100 * (size-i-1) + (l);}
                }
//                System.out.println();
            }
            System.out.println(tot);
            
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   
