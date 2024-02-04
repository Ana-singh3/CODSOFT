import java.util.*;

public class task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Engineering Physics");
        double phy = sc.nextDouble();

        System.out.println("Enter the marks of Engineering Chemistry");
        double chem = sc.nextDouble();

        System.out.println("Enter the marks of Java");
        double jav = sc.nextDouble();

        System.out.println("Enter the marks of Soft Skills");
        double sts = sc.nextDouble();

        // calculating TOTAL
        double total = phy + chem + jav + sts;
        double avgper = total / 4;
        char g;

        if (avgper >= 90 && avgper <= 100) {
            g = 'S'; // S for Superior
        } else if (avgper >= 80 && avgper < 90) {
            g = 'A';
        } else if (avgper >= 70 && avgper < 80) {
            g = 'B';
        } else if (avgper >= 60 && avgper < 70) {
            g = 'C';
        } else if (avgper >= 50 && avgper < 60) {
            g = 'D';
        } else if (avgper >= 40 && avgper < 50) {
            g = 'E';
        } else {
            g = 'F';
        }

        System.out.println("Total Marks obtained: " + total);
        System.out.println("Average Percentage obtained: " + avgper);
        System.out.println("Grade obtained: " + g);
    }
}

