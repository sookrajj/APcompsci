package Q3.prog702p;

public class beepers extends Animals{
    private String myfav;
    
   
    

    public beepers(String name, String word, String fav) {
        super(name, word);
        myfav = fav;
    }


    public String getfav() {return myfav;}
    
}
