package Q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Basefile {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog213v.dat"));



            while (s.hasNext()) {

            }



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
