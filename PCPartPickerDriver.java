import java.util.Scanner;
public class PCPartPickerDriver
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        PCBuilder pcBuilder = null;
        LaptopBuilder laptopBuilder = new LaptopBuilder();
        CPU cpu = new CPU();
        Case caseClass = new Case();
        Motherboard mobo = new Motherboard();
        RAM ram = new RAM();
        Memory mem = new Memory();
        PowerSupply powSup = new PowerSupply();
        Monitor mon = new Monitor();
        Keyboard key = new Keyboard();
        Mouse mouse = new Mouse();
        GPU gpu = new GPU();
        int form, caseSwitch, cpuBrand, cpuSpeed, auxMemoryBrand, auxMemorySize, monitorBrand, monitorSize, keyboardBrand, keyboardType,mouseBrand, mouseType, powerSupplyBrand, powerSupplySize, motherBoardBrand, motherBoardType, ramBrand, ramSize, gpuBrand, gpuSize;

        System.out.print("Thank you for choosing Alex's geek and tech shop to build your PC!");
         do
         {
            form = twoChoices("Please select an option: \n1.Desktop \n2.Laptop \n");

            switch (form) {
                case 1:
                   caseSwitch = fourChoices(caseClass.caseOutput());
                   cpuBrand = twoChoices(cpu.cpuBOut());
                   cpuSpeed = fourChoices(cpu.cpuSOut());
                   motherBoardBrand = fourChoices(mobo.moboBrand());
                   motherBoardType = fourChoices(mobo.moboType());
                   gpuBrand = fourChoices(gpu.gpuBrand());
                   gpuSize = fourChoices(gpu.gpuSize());
                   ramBrand = fourChoices(ram.ramBrand());
                   ramSize = fourChoices(ram.ramSize());
                   auxMemoryBrand = fourChoices(mem.auxMemBrand());
                   auxMemorySize = fourChoices(mem.auxMemSize());
                   powerSupplyBrand = fourChoices(powSup.powSupBrand());
                   powerSupplySize = fourChoices(powSup.powSupSize());
                   monitorBrand = fourChoices(mon.monBrand());
                   monitorSize = fourChoices(mon.monSize());
                   keyboardBrand = fourChoices(key.keyboBrand());
                   keyboardType = fourChoices(key.keyboType());
                   mouseBrand = fourChoices(mouse.mouseBrand());
                   mouseType = fourChoices(mouse.mouseType());
                   pcBuilder = new PCBuilder(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand,auxMemorySize, powerSupplyBrand, powerSupplySize,monitorBrand, monitorSize, keyboardBrand, keyboardType, mouseBrand, mouseType, gpuBrand, gpuSize);
                   pcBuilder.sendSetters();
                   break;
                case 2:
                    break;
            }
             if (pcBuilder != null) {
                 Receipt invoice = new Receipt();
                 invoice.printReceiptDT();
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
}