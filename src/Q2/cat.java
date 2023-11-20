package Q2;

public class cat {
    /**
     * Cat
     * Use with Cats with BigArrayLists
     */

        private String myName;
        private double myWeight;
        private int myAge;
        private double myCost;

        public cat() {
            myName = "";
            myWeight = 0;
            myAge = 0;
            myCost = 0;
        }

        public cat(String name, double weight, int age, double cost) {
            myName = name;
            myWeight = weight;
            myAge = age;
            myCost = cost;
        }

        /**
         * Methods
         */
        public void setWeight(double weight) { myWeight = weight; }
        public void setCost(double cost) { myCost = cost; }
        public void setAge(int age){ myAge = age; }
        public void setName(String name) { myName = name; }

        public int getAge() { return myAge; }
        public double getCost() { return myCost; }
        public double getWeight() { return myWeight; }
        public String getName() { return myName; }




}
