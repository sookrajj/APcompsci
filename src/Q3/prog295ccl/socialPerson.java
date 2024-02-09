package Q3.prog295ccl;

public class socialPerson {
    private String socialSec;
    private String type;
    private String classi;
    private int code;

    public socialPerson(String soc, String ty, String clas, int cod) {
        socialSec = soc;
        type = ty;
        classi = clas;
        code = cod;
    }

    public String getSocial() {return socialSec;}
    public String getType() {return type;}
    public String getClas() {return classi;}
    public int getCode() {return code;}
}
