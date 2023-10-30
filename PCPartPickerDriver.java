import java.util.Scanner;
public class PCPartPickerDriver
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int form, caseSwitch, cpuBrand, cpuSpeed, auxMemory, monitorBrand, monitorSize, keyboardBrand, keyboardType,mouseBrand, mouseType, powerSupply, motherBoard, motherBoardType;
        boolean exit = true;

        System.out.print("Thank you for choosing Alex's geek and tech shop to build your PC!");
         do
         {
            form = twoChoices("Please select an option: \n1.Laptop \n2. Desktop");

            switch (form) {
                case 1:
                    break;
                case 2:
                    break;
            }
        }while(exitProgram());
    }

    private static int twoChoices(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                if (value >= 1 && value <= 2) {
                    return value;
                } else {
                    System.out.print("Please choose a valid option between 1 and 2.\n");
                }
            } else {
                scanner.nextLine();  // Clear the invalid input
                System.out.print("Invalid input. Please enter a valid integer.\n");
            }
        }
    }

    private static int threeChoices(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                if (value >= 1 && value <= 3) {
                    return value;
                } else {
                    System.out.print("Please choose a valid option between 1 and 3.\n");
                }
            } else {
                scanner.nextLine();  // Clear the invalid input
                System.out.print("Invalid input. Please enter a valid integer.\n");
            }
        }
    }

    private static int fourChoices(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                if (value >= 1 && value <= 4) {
                    return value;
                } else {
                    System.out.print("Please choose a valid option between 1 and 4.\n");
                }
            } else {
                scanner.nextLine();  // Clear the invalid input
                System.out.print("Invalid input. Please enter a valid integer.\n");
            }
        }
    }

        private static boolean exitProgram() {
            while (true) {
                System.out.print("Would you like to run again? (Y/N): ");
                String exitValid = scanner.next().toUpperCase(); // Convert to uppercase for case-insensitive check

                if (exitValid.equals("Y")) {
                    return true; // Run again
                } else if (exitValid.equals("N")) {
                    System.out.print("\nThank you for using this program, have a great day!\n");
                    return false; // Do not run again
                } else {
                    System.out.print("Invalid input. Please enter 'Y' or 'N'.\n");
                }
            }
        }
    }
}