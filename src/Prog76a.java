import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in any number interger between 1-9");
        int n = input.nextInt();

        int b = n * 9;
        int f = b * 12345679;
        System.out.println("Cool number output: " + f);
    }
}
//Type in any number interger between 1-9
//8
//Cool number output: 888888888