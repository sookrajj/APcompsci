package Q3.prog607a;



public class cl607a {
  private int mymonth;
  private int myday;
  private int myyear;
  private int change;
  private String code;


  public cl607a(int month, int day, int year) {
    mymonth = month;
    myday = day;
    myyear = year;
    code = "";
    change = 0;
  }

  public void calc() {
    String hi = "123456789";
    String nice = "101112";
    String lets = "ABCDEFGHIJKL";
    String end = "QRSTUVWXYZ";
    String back = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    int fir = 80;
    int las = 0;

    code += lets.substring(mymonth-1, mymonth);
    change = myday;
    if (myday > 20) {
      code += end.substring(1, 2);
      change -= 20;
    }else if (myday > 10 ) {
      code += end.substring(0, 1);
      change -= 10;
    }
    code += end.substring(change-1, change);

    change = myyear;
    if (myyear > 1000) change -= 1970;
    else change -= 70;

    if (change > 20) {
      code += back.substring(20, 21);
      change -= 20;
    } else if (change > 10) {
      code += back.substring(10,11);
      change -= 10;
    }
    code += back.substring(change-1, change);


//    for (int lcv = 0; lcv < mydate.length() - 1; lcv++) {
//      if (mydate.substring(lcv, lcv + 1).equals("/")) {
//        if (lcv < fir) fir = lcv;
//        if (las < lcv) las = lcv;
//      }
//    }
//
//    if (fir > 1) {
//      for (int lcv = 0; lcv < nice.length(); lcv += 2) {
//        if (nice.substring(lcv, lcv + 2).equals(mydate.substring(0, fir))) {
//          code += lets.substring(lcv + 10, lcv + 11);
//        }
//      }
//    } else {
//      for (int lcv = 0; lcv < hi.length(); lcv++) {
//        if (hi.substring(lcv, lcv + 1).equals(mydate.substring(0, fir))) {
//          code += lets.substring(lcv, lcv + 1);
//        }
//      }
//    }
//
//    if (las - fir > 1) {
//      for (int h = 0; h < 2; h++) {
//        for (int lcv = 0; lcv < hi.length(); lcv++) {
//          if (hi.substring(lcv, lcv + 1).equals(mydate.substring(h , h+1))) {
//            code += end.substring(lcv, lcv + 1);
//          }
//        }
//      }
//
//      int temp = 0;
//      for (int lcv = mydate.length(); lcv > las; lcv--) {
//
//      }
//
//      if (temp < 100) temp -= 70;
//      else temp-= 1970;
//
//      code += back.substring(temp, temp+1);
//
//
//
//    } else {
//      for (int lcv = 0; lcv < hi.length(); lcv++) {
//          if (hi.substring(lcv, lcv + 1).equals(mydate.substring(fir , las))) {
//            code += end.substring(lcv, lcv + 1);
//          }
//      }
//
//      int temp = Integer.valueOf(mydate.substring(las+1, mydate.length()-1));
//      if (temp < 100) temp -= 70;
//      else temp-= 1970;
//
//      code += back.substring(temp, temp+1);
//
//    }

    
  }


    
    
  public String getCode() {return code;};

  public String toString() {
    return mymonth + "/" + myday + "/" + myyear;
  }

}
