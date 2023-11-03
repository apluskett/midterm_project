import java.util.Scanner;
public class PCPartPickerDriver
{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        PCBuilder pcBuilder = new PCBuilder();
        int form, caseSwitch, lapSwitch, cpuBrand, cpuSpeed, auxMemoryBrand, auxMemorySize, monitorBrand, monitorSize, keyboardBrand, keyboardType,mouseBrand, mouseType, powerSupplyBrand, powerSupplySize, motherBoardBrand, motherBoardType, ramBrand, ramSpeed, gpuBrand, gpuSize;
        String name;
        System.out.print("Thank you for choosing Alex's geek and tech shop to build your PC!\n");
         do
         {
            name = getName("What will the name be for the this order?\n");
             form = twoChoices("Please select an option: \n1.Desktop \n2.Laptop \n");

            switch (form) {
                case 1:
                   caseSwitch = fourChoices(pcBuilder.getCaseClass().caseOutput());
                   cpuBrand = twoChoices(pcBuilder.getCpu().cpuBOut());
                   cpuSpeed = fourChoices(pcBuilder.getCpu().cpuSOut());
                   motherBoardBrand = fourChoices(pcBuilder.getMobo().moboBrand());
                   motherBoardType = fourChoices(pcBuilder.getMobo().moboType());
                   gpuBrand = fourChoices(pcBuilder.getGpu().gpuBrand());
                   gpuSize = fourChoices(pcBuilder.getGpu().gpuSize());
                   ramBrand = fourChoices(pcBuilder.getRam().ramBrand());
                   ramSpeed = fourChoices(pcBuilder.getRam().ramSize());
                   auxMemoryBrand = fourChoices(pcBuilder.getMem().auxMemBrand());
                   auxMemorySize = fourChoices(pcBuilder.getMem().auxMemSize());
                   powerSupplyBrand = fourChoices(pcBuilder.getPowSup().powSupBrand());
                   powerSupplySize = fourChoices(pcBuilder.getPowSup().powSupSize());
                   monitorBrand = fourChoices(pcBuilder.getMon().monBrand());
                   monitorSize = fourChoices(pcBuilder.getMon().monSize());
                   keyboardBrand = fourChoices(pcBuilder.getKey().keyboBrand());
                   keyboardType = fourChoices(pcBuilder.getKey().keyboType());
                   mouseBrand = fourChoices(pcBuilder.getMouse().mouseBrand());
                   mouseType = fourChoices(pcBuilder.getMouse().mouseType());
                   pcBuilder = new  PCBuilder(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSpeed, auxMemoryBrand,auxMemorySize, powerSupplyBrand, powerSupplySize,monitorBrand, monitorSize, keyboardBrand, keyboardType, mouseBrand, mouseType, gpuBrand, gpuSize, name);
                   pcBuilder.sendSettersDesktop();
                   break;
                case 2:
                    lapSwitch = fourChoices(pcBuilder.getCaseClass().lapOutput());
                    cpuBrand = twoChoices(pcBuilder.getCpu().cpuBOut());
                    cpuSpeed = fourChoices(pcBuilder.getCpu().cpuSOut());
                    motherBoardBrand = fourChoices(pcBuilder.getMobo().moboBrand());
                    motherBoardType = fourChoices(pcBuilder.getMobo().moboType());
                    gpuBrand = fourChoices(pcBuilder.getGpu().gpuBrand());
                    gpuSize = fourChoices(pcBuilder.getGpu().gpuSize());
                    ramBrand = fourChoices(pcBuilder.getRam().ramBrand());
                    ramSpeed = fourChoices(pcBuilder.getRam().ramSize());
                    auxMemoryBrand = fourChoices(pcBuilder.getMem().auxMemBrand());
                    auxMemorySize = fourChoices(pcBuilder.getMem().auxMemSize());
                    pcBuilder = new PCBuilder(lapSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, gpuBrand,gpuSize,ramBrand, ramSpeed,auxMemoryBrand,auxMemorySize, name);
                    pcBuilder.sendSettersLaptop();
                    break;
            }
             if (pcBuilder != null) {
                 if (form == 1)
                 {
                     pcBuilder.getInvoice().printReceiptDT(pcBuilder);
                 }
                 else if (form == 2)
                 {
                     pcBuilder.getInvoice().printReceiptLT(pcBuilder);
                 }
                 else
                 {
                     System.out.println("There is no receipt to be printed.");
                 }
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

    private static boolean exitProgram()
    {
        while (true)
        {
            System.out.print("Would you like to run again? (Y/N): ");
            String exitValid = scanner.next().toUpperCase(); // Convert to uppercase for case-insensitive check

            if (exitValid.equals("Y"))
            {
                return true; // Run again
            }
            else if (exitValid.equals("N"))
            {
                System.out.print("Thank you for using this program, have a great day!\n");
                return false; // Do not run again
            }
            else
            {
                System.out.print("Invalid input. Please enter 'Y' or 'N'.\n");
            }
        }
    }

    private static String getName(String prompt) {
        while (true) {
            System.out.print(prompt);

            String name = scanner.nextLine().trim(); // Read the input and trim whitespace

            // Regex to check if the name contains only letters and possibly spaces
            if (name.matches("[a-zA-Z ]+") && name.length() >= 2) {
                // Name is valid, contains only letters (and spaces)
                return name;
            } else {
                System.out.print("Invalid input. Please enter a name with only letters.\n");
            }
        }
    }
}
