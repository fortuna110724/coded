package fortuna1;

import java.util.Scanner;

public class Fortuna2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            
            if (num == 0) {
                System.out.println("Inputted number Zero");
            } else if (num % 2 == 0) {
                System.out.println("Inputted number is even");
            } else {
                System.out.println("Inputted number is odd");
            }
        }
    }
}
