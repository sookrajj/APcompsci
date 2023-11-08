package Q2.prog435acl;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog435a.dat"));
            cl435a[] list = new cl435a[1000];
            int cnt = 0;

            while (input.hasNext()) {
              int ctype = input.nextInt();
              int gate = input.nextInt();

               if(ctype != -999) {
                   cl435a yikes = new cl435a(ctype, gate);
                   list[cnt] = yikes;
                   cnt++;
               }

            }
            for (int lcv = 0; lcv < cnt; lcv++) {
                list[lcv].calc();
            }
            for (int lcv =0; lcv < cnt; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//compact car	$1.0	$1.35	$1.35
//small car	$1.3	$2.5	$3.25
//medium size car	$1.6	$4.1	$6.56
//full size car	$2.0	$5.5	$11.0
//truck	$2.4	$2.0	$4.8
//16 wheeler	$2.7	$3.25	$8.775
//compact car	$1.0	$4.8	$4.8
//small car	$1.3	$6.0	$7.800000000000001
//medium size car	$1.6	$1.35	$2.16
//full size car	$2.0	$2.5	$5.0
//truck	$2.4	$4.1	$9.839999999999998
//16 wheeler	$2.7	$5.5	$14.850000000000001
//compact car	$1.0	$6.0	$6.0
//small car	$1.3	$1.35	$1.7550000000000001
//medium size car	$1.6	$2.0	$3.2
//full size car	$2.0	$2.5	$5.0
//truck	$2.4	$3.25	$7.8
//16 wheeler	$2.7	$4.1	$11.07