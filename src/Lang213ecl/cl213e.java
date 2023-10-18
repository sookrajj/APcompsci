package Lang213ecl;

public class cl213e {
    private int q;
    private int w;
    private int e;
    private int r;
    private int t;
    private int family;
    private double qt;
    private double wt;
    private double et;
    private double rt;
    private double tt;

    public cl213e(int fam) {
        q = 0;
        w = 0;
        e = 0;
        r = 0;
        t = 0;
        family = fam;
        qt = 0;
        wt = 0;
        et = 0;
        rt = 0;
        tt = 0;
    }

    public void calc() {
        if (family < 20) q++;
        else if (family < 40) w++;
        else if (family < 60) e++;
        else if (family < 80) r++;
        else t++;

        qt = q / (q+w+e+r+t);
        wt = w / (q+w+e+r+t);
        et = e / (q+w+e+r+t);
        rt = r / (q+w+e+r+t);
        tt = t / (q+w+e+r+t);
    }

    public int getq() {return q;}
    public int getw() {return w;}
    public int gete() {return e;}
    public int getr() {return r;}
    public int gett() {return t;}
    public double getqt() {return qt;}
    public double getwt() {return wt;}
    public double getet() {return et;}
    public double getrt() {return rt;}
    public double gettt() {return tt;}
}
