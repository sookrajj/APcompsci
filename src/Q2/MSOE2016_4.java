package Q2;

public class MSOE2016_4 {
  public static void main(String[] args) {

    double turkeywithsomestuffin = Math.round(Math.random() * 10000);
    int[] onmydinnertable = new int[100];
    int cnt = 2;
    int cnt2 = 0;
    int cnt3 = 0;
    int cnt4 = 2;
    int tot = 0;
    //while (turkeywithsomestuffin > 1) {
    //for (int lcv = 0; lcv < turkeywithsomestuffin; lcv++) {
    //for (int lcv2 = 2; lcv <= cnt; lcv++) {
    //while (turkeywithsomestuffin%lcv2 = 0) {
    //onmydinnertable[lcv] = lcv2;
    //turkeywithsomestuffin /= lcv2;
    //}
    //}
    // cnt++;
    while (turkeywithsomestuffin > 2) {
      if (turkeywithsomestuffin % cnt == 0) {
        turkeywithsomestuffin /= cnt;
        onmydinnertable[cnt2] += cnt;
        cnt2++;
      } else cnt++;

    }
    for (int lcv = 0; lcv < cnt; lcv++) {
      while (onmydinnertable[lcv] == cnt4) {
        cnt3++;
        lcv++;
      }
      tot += Math.pow(cnt4, cnt3 - 1) * (cnt4 - 1);
      cnt3 = 0;
      cnt4++;
    }

    System.out.println(onmydinnertable + " = " + tot);


  }
}
