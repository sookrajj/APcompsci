package Q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog702q {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog213v.dat"));



            while (s.hasNext()) {
              int num = s.nextInt();
              if (num == 1) {

              } else if (num == 2) {

              } else {

              }
            }



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
