package Q2;

public class Prog210computer {
    private int player;
    private int computer;

    public Prog210computer(int num) {
        player = num;
        computer = 0;
    }

    public void calc() {
        if (player == 1) computer = 4;
        else if (player == 2) computer = 3;
        else if (player == 3) computer = 2;
        else if (player == 4) computer = 1;
    }

    public int getComputer() {return computer;}
}
