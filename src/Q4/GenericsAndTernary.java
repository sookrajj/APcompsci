package Q4;

public class GenericsAndTernary {
    static class myBox<T> { // Define template type "T"
        private T myVal;

        public myBox(T thing) {myVal = thing;}
        public void setValue(T thing) {myVal = thing;}
        public T getVal() {return myVal;}
    }

    public static void main(String[] args) {
        var box = new myBox<Integer>(5); // "var" = type of right hand side
        String msg = (box.getVal() >= 5? "val >= 5" : box.getVal() != 0? "val != 0" : "val < 5");
        //Ternary Operator -> (condition) "if" ... : "else" ...
        System.out.println(msg);
        box.setValue(10);
        System.out.println(box.getVal());
        var sbox = new myBox<String>("Hello");
        System.out.println(sbox.getVal());
        //Only ever use var when using "new" keyword
        //And type is not child class or interface
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
