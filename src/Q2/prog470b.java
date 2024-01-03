package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog470b {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];
            int mtot = 0;
            int stot = 0;
            System.out.println("Original Matrix");
            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    mat[lcv][lcv2] = s.nextInt();
                    System.out.print(mat[lcv][lcv2] + " ");
                    if (lcv == lcv2) mtot += mat[lcv][lcv2];
                    else if (lcv == 0 && lcv2 == 4) stot += mat[lcv][lcv2];
                    else if (lcv == 1 && lcv2 == 3) stot += mat[lcv][lcv2];
                    if (lcv == 2 && lcv2 == 2) stot += mat[lcv][lcv2];
                    else if (lcv == 3 && lcv2 == 1) stot += mat[lcv][lcv2];
                    else if (lcv == 4 && lcv2 == 0) stot += mat[lcv][lcv2];
                }
                System.out.println();
            }
            
            System.out.print("\nThe main diagnal total is " + mtot + "\nThe other diagnal total is " + stot);

        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Original Matrix
//45 67 89 12 -3
//-3 -6 -7 -4 -9
//96 81 -8 52 12
//14 -7 72 29 -1
//19 43 28 63 87
//
//The main diagnal total is 147
//The other diagnal total is -3
//Process finished with exit code 0