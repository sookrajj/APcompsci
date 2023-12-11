package Q2.studentdatalab;

import java.util.*;

public class StudentDatabase {
    public static int indexofstudent(ArrayList<Student> db, int id) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getId() == id) index = lcv;

        }
        return index;
    }

    public static int indexofstudent(ArrayList<Student> db, String last) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getLastName().equals(last)) index = lcv;
        }
        return index;
    }

    public static void printstu(Student stu) {
        System.out.printf("%s\t%s\t%d\t%.2f\n", stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<Student>();

        while (true) {
            System.out.println("\nStudent Menu:\n");
            System.out.println("1 - Add new student");
            System.out.println("2 - Display all students");
            System.out.println("3 - Search for Student (by id");
            System.out.println("4 - Search for Student (by Last Name");
            System.out.println("5 - Modify a student's GPA");
            System.out.println("6 - remove student (by id");
            System.out.print("7 - Exit\n\nPlease enter your choice: ");

            int c = input.nextInt();

            if (c == 1) {
                System.out.print("Enter First name: ");
                String first = input.next();
                System.out.print("Enter last name: ");
                String last = input.next();
                System.out.print("Enter student id: ");
                int id = input.nextInt();
                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();
                Student st = new Student(first, last, id, gpa);
                db.add(st);
            } else if (c == 2) {
                System.out.println("First\tLast\tID\tGPA");
                for (Student temp : db){
                    printstu(temp);
                }
            } else if (c == 3) {
                System.out.print("Enter an Id to Search for: ");
                int id = input.nextInt();
                int index = indexofstudent(db, id);
                if (index != -1) printstu(db.get(index));
                else System.out.println("No student was found with that id.");
            } else if (c == 4) {
                System.out.print("Enter student's last name: ");
                String last = input.next();
                int index = indexofstudent(db, last);
                if (index != -1) printstu(db.get(index));
                else System.out.println("No student was found with that last name.");
            } else if (c == 5) {
                System.out.print("Enter student's id whose GPA you want to change: ");
                int id = input.nextInt();
                int index = indexofstudent(db, id);
                if (index == -1) System.out.println("No student was found");
                else {
                    System.out.print("Enter new GPA: ");
                    double gpa = input.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA updated successfully!");
                }

            } else if (c == 6) {
                System.out.print("Enter an Id to Search for: ");
                int id = input.nextInt();
                int index = indexofstudent(db, id);
                if (index == -1) System.out.println("No student was found");
                else db.remove(index);
            } else if (c == 7) {
                return;
            }
        }
    }
}
