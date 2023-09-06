public class mathtest {

    public static void main(String[] args) {
        int twocubed = (int)Math.pow(2, 3); // 2*3

        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        int num4 = 5;
        int sum = num1 + num2 + num3 + num4;
        sum /= 4; // sum = sum / 4

        num1 = num1 + 1;
        num1 += 1;


        int test = 3/4;
        System.out.println(test);

        double myWallet = 235.963475;
        double myWRounded = Math.round(myWallet * 100.0) / 100.0;

        System.out.println(myWRounded);
        System.out.printf("myWRounded = %.2f\n", myWallet);
    }
}
       //0
       // 235.96
       //myWRounded = 235.96