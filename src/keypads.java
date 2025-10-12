import java.util.*;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class keypads {
    //optimize with a map<String, Map<String, String>>
    //                    dir,        nexdir, dirs to get to nextdir
    //v<<AA>^AAA>AvA^A<vAAA>^AvA^A
    //<<^^^A>AvvvA>A
    //780A
    String[][] dir = {{"", "^", "A"}, {"<", "v", ">"}};
    String[][] num = {{"7", "8", "9"}, {"4", "5", "6"}, {"1", "2", "3"}, {"", "0", "A"}};
    public static String directionalkeypad(String directions) {
        String str = "";
        var cx = 0;
        var cy = 2;
        while (directions.length() > 0) {
            var place = directions.substring(0, 1);
            if (place.equals("^")) {
                while (cy != 1) {
                    if (cy < 1) {
                        str += ">";
                        cy++;
                    } else {
                        str += "<";
                        cy--;
                    }
                }
                if (cx != 0) {
                    str += "^";
                    cx = 0;
                }
            } else if (place.equals("A")) {
                while (cy != 2) {
                    str += ">";
                    cy++;
                }
                if (cx != 0) {
                    str += "^";
                    cx = 0;
                }
            } else if (place.equals("<")) {
                while (cy != 0) {
                    if (cx != 1) {
                    str += "v";
                    cx = 1;
                }
                    str += "<";
                    cy--;
                }
                if (cx != 1) {
                    str += "v";
                    cx = 1;
                }
            } else if (place.equals("v")) {
                while (cy != 1) {
                    if (cy < 1) {
                        str += ">";
                        cy++;
                    } else {
                        str += "<";
                        cy--;
                    }
                }
                if (cx != 1) {
                    str += "v";
                    cx = 1;
                }
            } else if (place.equals(">")) {
                while (cy != 2) {
                    str += ">";
                    cy++;
                }
                if (cx != 1) {
                    str += "v";
                    cx = 1;
                }
            }
            str += "A";
            directions = directions.substring(1);
        }
        return str;
    }
    public static String numericalkeypad(String directions) {
        String str = "";
        var cx = 3;
        var cy = 2;
        while (directions.length() > 0) {
            var place = directions.substring(0, 1);
            if (place.equals("7")) {
                while (cy != 0) {
                    if (cx == 3) {
                        while (cx != 0) {
                            cx --;
                            str += "^";
                        }
                    }
                    str += "<";
                    cy--;
                }
                while (cx != 0) {
                    cx --;
                    str += "^";
                }
            } else if (place.equals("8")) {
                while (cy != 1) {
                    if (cy < 1) {
                        str += ">";
                        cy++;
                    } else {
                        str += "<";
                        cy--;
                    }
                }
                while (cx != 0) {
                    cx --;
                    str += "^";
                }
                
            } else if (place.equals("9")) {
                while (cy != 2) {
                    str += ">";
                    cy++;
                }
                while (cx != 0) {
                    cx --;
                    str += "^";
                }
            } else if (place.equals("4")) {
                while (cy != 0) {
                    if (cx == 3) {
                        while (cx != 1) {
                            if (cx > 1 ) {
                                cx --;
                                str += "^";
                            } else {
                                cx++;
                                str += "v";
                            }
                        }
                    }
                    str += "<";
                    cy--;
                }
                while (cx != 1) {
                    if (cx > 1 ) {
                        cx --;
                        str += "^";
                    } else {
                        cx++;
                        str += "v";
                    }
                }
            } else if (place.equals("5")) {
                while (cx != 1) {
                    if (cx > 1 ) {
                        cx --;
                        str += "^";
                    } else {
                        cx++;
                        str += "v";
                    }
                }
                while (cy != 1) {
                    if (cy < 1) {
                        str += ">";
                        cy++;
                    } else {
                        str += "<";
                        cy--;
                    }
                }
            } else if (place.equals("6")) {
                while (cx != 1) {
                    if (cx > 1 ) {
                        cx --;
                        str += "^";
                    } else {
                        cx++;
                        str += "v";
                    }
                }
                while (cy != 2) {
                    str += ">";
                    cy++;
                }
            } else if (place.equals("1")) {
                while (cy != 0) {
                    if (cx == 3) {
                        while (cx != 2) {
                            if (cx > 2 ) {
                                cx --;
                                str += "^";
                            } else {
                                cx++;
                                str += "v";
                            }
                        }
                    }
                    str += "<";
                    cy--;
                }
                while (cx != 2) {
                    if (cx > 2) {
                        cx --;
                        str += "^";
                    } else {
                        cx++;
                        str += "v";
                    }
                }
            } else if (place.equals("2")) {
                while (cx != 2) {
                    if (cx > 2 ) {
                        cx --;
                        str += "^";
                    } else {
                        cx++;
                        str += "v";
                    }
                }
                while (cy != 1) {
                    if (cy < 1) {
                        str += ">";
                        cy++;
                    } else {
                        str += "<";
                        cy--;
                    }
                }
            } else if (place.equals("3")) {
                while (cx != 2) {
                    if (cx > 2 ) {
                        cx --;
                        str += "^";
                    } else {
                        cx++;
                        str += "v";
                    }
                }
                while (cy != 2) {
                    str += ">";
                    cy++;
                }
            } else if (place.equals("0")) {
                while (cx != 3) {
                    if (cy == 0) {
                        while (cy != 1) {
                            if (cy < 1) {
                                str += ">";
                                cy++;
                            } else {
                                str += "<";
                                cy--;
                            }
                        }
                    }
                    cx++;
                    str += "v";
                }
                while (cy != 1) {
                    if (cy < 1) {
                        str += ">";
                        cy++;
                    } else {
                        str += "<";
                        cy--;
                    }
                }
            } else if (place.equals("A")) {
                while (cx != 3) {
                    if (cy == 0) {
                       while (cy != 2) {
                            str += ">";
                            cy++;
                        } 
                    }
                    cx++;
                    str += "v";
                }
                while (cy != 2) {
                    str += ">";
                    cy++;
                }
                
            }
            str += "A";
            directions = directions.substring(1);

        }
        return str;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/keypads.dat"));
            int count = 0;
            ArrayList<String> str = new ArrayList<>();
            while (input.hasNext()) {
                var line = input.nextLine();
                var num = Integer.parseInt(line.substring(0, line.length()-1));
                var y = numericalkeypad(line);
                for (int i = 0; i < 25; i++) {
                    System.out.println(i);
                    y = directionalkeypad(y);
                }
                // System.out.println(num);
                // System.out.println(y + " " + y.length());
                count += num*(y.length());
            }
            
            System.out.println(count);
            

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}   

