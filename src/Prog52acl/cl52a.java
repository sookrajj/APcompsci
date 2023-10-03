package Prog52acl;

public class cl52a { //rectangle (helper class)
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    //input section (constructor)
    public cl52a(int len, int wid) {
        //set up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;

    }

    //calculation section (mutators/setters)
    public void calc() {
        myArea = myLen * myWid;
        myPerim = 2 * myLen + 2 * myWid;
    }

    //output section (accessors/getters)
    public int getArea() {return myArea;}
    public int getPerim() {return myPerim;}

}
