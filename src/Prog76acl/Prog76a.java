package Prog76acl;
import java.util.*;

public class Prog76a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("A whole number between 1-9");
    int num = input.nextInt();

    cl76a w = new cl76a(num);
    w.calc();

    int cool = w.getNumber();

    System.out.println("cool number: " + cool);
  }
}
//A whole number between 1-9
//5
//cool number: 555555555