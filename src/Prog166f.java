import java.util.*;

public class Prog166f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 100;
        int num2 = 1;
        int count = 0;
        while (num2 <= 110) {
            count += num2;
            num2 += 1;
            while (num2 <= num1) {
                count += num2;
                num2 +=1;
            }
            System.out.println("The sum of numbers is " + count);
        }
    }
}
//The sum of numbers is 5050
//The sum of numbers is 5151
//The sum of numbers is 5253
//The sum of numbers is 5356
//The sum of numbers is 5460
//The sum of numbers is 5565
//The sum of numbers is 5671
//The sum of numbers is 5778
//The sum of numbers is 5886
//The sum of numbers is 5995
//The sum of numbers is 6105