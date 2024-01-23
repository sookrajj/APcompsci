package Q3;



public class cl607a {
  private String mydate;
  private String myencode;
  private String code;


  public cl607a(String date) {
    mydate = date;
    code = "";
  }

  public void calc() {
    String hi = "123456789";
    String nice = "101112";
    String lets = "ABCDEFGHIJKL";
    String end = "QRSTUVWXYZ";
    String back = "ZYXWVUTSRQLKJIHGFEDCBA";
    int fir = 80;
    int las = 0;
    for (int lcv = 0; lcv < mydate.length() - 1; lcv++) {
      if (mydate.substring(lcv, lcv + 1).equals("/")) {
        if (lcv < fir) fir = lcv;
        if (las < lcv) las = lcv;
      }
    }

    if (fir > 1) {
      for (int lcv = 0; lcv < nice.length(); lcv += 2) {
        if (nice.substring(lcv, lcv + 2).equals(mydate.substring(0, fir))) {
          code += lets.substring(lcv + 10, lcv + 11);
        }
      }
    } else {
      for (int lcv = 0; lcv < hi.length(); lcv++) {
        if (hi.substring(lcv, lcv + 1).equals(mydate.substring(0, fir))) {
          code += lets.substring(lcv, lcv + 1);
        }
      }
    }

    if (las - fir > 1) {
      for (int h = 0; h < 2; h++) {
        for (int lcv = 0; lcv < hi.length(); lcv++) {
          if (hi.substring(lcv, lcv + 1).equals(mydate.substring(h , h+1))) {
            code += end.substring(lcv, lcv + 1);
          }
        }
      }

      int temp = Integer.valueOf(mydate.substring(las+1, mydate.length()-1));
      if (temp < 100) temp -= 70;
      else temp-= 1970;

      code += back.substring(temp, temp+1);
      


    } else {
      for (int lcv = 0; lcv < hi.length(); lcv++) {
          if (hi.substring(lcv, lcv + 1).equals(mydate.substring(fir , las))) {
            code += end.substring(lcv, lcv + 1);
          }
      }

      int temp = Integer.valueOf(mydate.substring(las+1, mydate.length()-1));
      if (temp < 100) temp -= 70;
      else temp-= 1970;

      code += back.substring(temp, temp+1);
      
    }

    
  }


    
    
  public String getCode();

  public String getDate() {return mydate;}

}
