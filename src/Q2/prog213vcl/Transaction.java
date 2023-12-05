package Q2.prog213vcl;

public class Transaction {
    private String myType;
    private double myAmount;

    public Transaction(String type, double amount) {
        myType = type;
        myAmount = amount;
    }

    public String getCode() {return myType;}
    public double getAmount() {return myAmount;}
}
