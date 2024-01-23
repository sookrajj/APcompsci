package Q3.prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prog701gm {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog701g.dat"));
            List<persons> list = new ArrayList<persons>();



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
