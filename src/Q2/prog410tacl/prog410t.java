package Q2.prog410tacl;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class prog410t {
  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(new File("Langdat/survey2.dat"));
      Scanner s2 = new Scanner(new File("Langdat/survey.dat"));


      while (s.hasNext()) {

      }
    } catch (IOException e) {
      System.out.println("Can't find data file.");
    }
  }
}