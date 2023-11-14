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

        for (int temp : big) {
            if (temp >= 50 && temp <= 59) System.out.print(temp + " ");
        }
        System.out.println();

        for (int lcv = 0; lcv < big.length; lcv++) {
            if (big[lcv]%4 == 0) System.out.print(big[lcv] + " ");
        }
        System.out.println();

        boolean sixty = false;
        for (int temp : big) {
            if (temp == 60) sixty = true;
        }
        System.out.println("Is 60 in the list? " + sixty);

        boolean btf = true;
        for (int lcv = 0; lcv < big.length; lcv++) {
            if (big[lcv] != big[big.length-1-lcv]) btf = false;
        }
        System.out.println("Is the array palindromic? " + btf);

        double avg2 = 0;
        for (int temp : big) {
            avg2 += temp;
        }
        avg2 /= big.length;

        int cnt = 0;
        for (int lcv = 0; lcv < big.length; lcv++) {
            if (big[lcv] > avg2) cnt++;
        }
        System.out.printf("There are %d numbers greater than the average\n", cnt);

        int evens = 0;
        for (int temp : big) {
            if (temp%2 == 0) evens++;
        }
        System.out.printf("There are %d even numbers\n", evens);

        int[] back = new int[big.length];
        for (int lcv = 0; lcv < big.length; lcv++) {
            back[lcv] += big[big.length-1-lcv];
        }
        for (int n : back) {
            System.out.print(n + " ");
        }
        System.out.println();

        int[] shiftbig= circularShiftRight(big);
        for (int n : shiftbig) {
            System.out.print(n + " ");
        }
        System.out.println();

        int sum = 0;
        for (int n : big) {
            int digitsum = 0;
            int temp = n;
            while (temp > 0) {
                int num = temp%10;
                temp/=10;
                digitsum += num;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements = " + sum);
    }

    public static int[] circularShiftRight(int[] big) {
        int temp = big[big.length-1];
        int[] shifted = new int[big.length];

        for (int lcv = 1; lcv < big.length; lcv++) {
            shifted[lcv] = big[lcv-1];
        }
        shifted[0] = temp;
        return shifted;
    }
}
//C:\Users\sookraj.j\.jdks\openjdk-20.0.2\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=53834:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\sookraj.j\Desktop\ap2\out\production\ap2 Q2.BigArr
//59 84 48 78 32 79 35 23 26 53 50 31 57 31 66 48 81 40 30
//59 84 48 78 32 79 35 23 26 53 50 31 57 31 66 48 81 40 30
//The middle number is 53Average of first, middle, and last = 47.333333333333336
// The smallest number is 23
// The largest number is 84
//59 23 48 78 32 79 35 84 26 53 50 31 57 31 66 48 81 40 30
//59 23 48 78 32 79 35 84 26 7 50 31 57 31 66 48 81 40 30
//69 33 58 88 42 89 45 94 36 17 60 41 67 41 76 58 91 50 40
//The number that was ousted is 58
//58 50
//8836607640
//Is 60 in the list? true
//Is the array palindromic? false
//There are 9 numbers greater than the average
//There are 9 even numbers
//40 50 91 58 76 41 67 41 60 17 36 94 45 89 42 88 5 33 69
//40 69 33 5 88 42 89 45 94 36 17 60 41 67 41 76 58 91 50
//Sum of all digits of all elements = 178