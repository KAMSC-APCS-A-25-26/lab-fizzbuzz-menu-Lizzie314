import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu
{
    public static void main(String[] args)
    {
        // Define variables and scanners
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        // This is what runs the program
        while (run)
        {
            // Set up menu
            System.out.println("\n--- FizzBuzz Menu ---");
            System.out.println("1. Fizz (Multiples of 3)");
            System.out.println("2. Buzz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5)");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            // Store choice
            int choice = sc.nextInt();

            // This is what happens for each option
            switch (choice)
            {
                case 1:
                    for (int x = 1; x <= 100; x++) {
                        if (x % 3 == 0) {
                            System.out.print(x + " ");
                        }
                    }
                    break;
                case 2:
                    for (int x = 1; x <= 100; x++) {
                        if (x % 5 == 0) {
                            System.out.print(x + " ");
                        }
                    }
                    break;
                case 3:
                    for (int x = 1; x <= 100; x++) {
                        if (x % 3 == 0 && x % 5 == 0) {
                            System.out.print(x + " ");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Goodbye!");
                    run = false;
                    break;
            }
        }
    }
}