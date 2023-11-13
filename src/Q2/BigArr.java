package Q2;

public class BigArr {
    public static void main(String[] args) {
        int[] big = new int[19];

        for (int lcv = 0; lcv < 19; lcv++) {
            big[lcv] =(int) (Math.random() * (91-20) + 20);
        }
        for ( int lcv = 0; lcv < big.length; lcv++) {
            System.out.print(big[lcv] + " ");
        }
        System.out.println();

        for ( int temp: big) {
            System.out.print(temp + " ");
        }
        System.out.println();

        System.out.print("The middle number is " + big[big.length/2]);

        double avg = big[0] + big[big.length-1] + big[big.length/2];
        System.out.println("Average of first, middle, and last = " + (avg/3));

        int smallest = big[0];
        int largest = big[0];
        for (int temp : big) {
            if (temp < smallest) smallest = temp;
            if (temp > largest) largest = temp;

        }
        System.out.println(" The smallest number is " + smallest);
        System.out.println(" The largest number is " + largest);

        for (int lcv = 0; lcv < big.length; lcv++) {
            if (big[lcv] == smallest) big[lcv] = largest;
            else if (big[lcv] == largest) big[lcv] = smallest;
        }
        for (int x : big) {
            System.out.print(x + " ");
        }
        System.out.println();

        int rannum = (int) (Math.random() * 10 + 1);
        big[big.length/2] = rannum;
        for (int x : big) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int lcv = 0; lcv < big.length; lcv++) {
            big[lcv] += 10;
            System.out.print(big[lcv] + " ");
        }
        System.out.println();

        int mythird = big[2];
        big[2] = 5;
        System.out.println("The number that was ousted is " + mythird);

    }
}
