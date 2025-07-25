
package fortuna1;

import java.util.Scanner;

public class Fortuna1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String name;
            int science, history, math, soc, arts, total;
            double percentage;
            String remarks;
            System.out.print("Enter name: ");
            name = input.nextLine();
            System.out.print("Enter marks in Science: ");
            science = input.nextInt();
            System.out.print("Enter marks in History: ");
            history = input.nextInt();
            if (history < 76) {
                System.out.println("History grade: Poor");
            }   System.out.print("Enter marks in Math: ");
            math = input.nextInt();
            if (math >= 71 && math <= 75) {
                System.out.println("Math grade: Fair");
            }   System.out.print("Enter marks in Social Studies: ");
            soc = input.nextInt();
            System.out.print("Enter marks in Arts: ");
            arts = input.nextInt();
            // Calculate total and percentage
            total = science + history + math + soc + arts;
            percentage = total / 5.0;
            // Remarks based on percentage
            if (percentage < 70) {
                remarks = "Fail";
            } else if (percentage <= 75) {
                remarks = "Fair";
            } else if (percentage <= 85) {
                remarks = "Good";
            } else if (percentage <= 90) {
                remarks = "Very Good";
            } else {
                remarks = "Excellent";
            }   // Output results
            System.out.println("\n--- Results ---");
            System.out.println("Student: " + name);
            System.out.println("Total Marks: " + total);
            System.out.printf("Percentage: %.2f%%\n", percentage);
            System.out.println("Remarks: " + remarks);
            if (remarks.equals("Fail")) {
                System.out.println("Try Again, " + name + ".");
            } else {
                System.out.println("Congrats " + name + ", you passed!");
            }
        }
    }
}
