public class Receipt {
    public void printReceiptDT(PCBuilder pcBuilder) {
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("Order invoice for: %s%n", pcBuilder.getName());
        System.out.println("---------------------------------Invoice--------------------------------");
        System.out.printf("%-20s %-40s %10s%n", "Case:", pcBuilder.getCaseClass().getSize(), "$" + String.format("%.2f", pcBuilder.getCaseClass().getPrice()));
        System.out.printf("%-20s %-40s %10s%n", "CPU:", pcBuilder.getCpu().getCpuModel(), "$" + String.format("%.2f", pcBuilder.getCpu().getCpuPrice()));
        System.out.printf("%-20s %-40s %10s%n", "GPU:", pcBuilder.getGpu().getGpuModel(), "$" + String.format("%.2f", pcBuilder.getGpu().getGpuPrice()));
        System.out.printf("%-20s %-40s %10s%n", "Motherboard:", pcBuilder.getMobo().getMoboModel(), "$" + String.format("%.2f", pcBuilder.getMobo().getMoboPrice()));
        System.out.printf("%-20s %-40s %10s%n", "Power Supply:", pcBuilder.getPowSup().getPowModel(), "$" + String.format("%.2f", pcBuilder.getPowSup().getPowPrice()));
        System.out.printf("%-20s %-40s %10s%n", "RAM:", pcBuilder.getRam().getRamModel(), "$" + String.format("%.2f", pcBuilder.getRam().getRamPrice()));
        System.out.printf("%-20s %-40s %10s%n", "Storage:", pcBuilder.getMem().getMemModel(), "$" + String.format("%.2f", pcBuilder.getMem().getMemPrice()));
        System.out.printf("%-20s %-40s %10s%n", "Monitor:", pcBuilder.getMon().getMonitorModel(), "$" + String.format("%.2f", pcBuilder.getMon().getMonitorPrice()));
        System.out.printf("%-20s %-40s %10s%n", "Mouse:", pcBuilder.getMouse().getMouseModel(), "$" + String.format("%.2f", pcBuilder.getMouse().getMousePrice()));
        System.out.printf("%-20s %-40s %10s%n", "Keyboard:", pcBuilder.getKey().getKeyboardModel(), "$" + String.format("%.2f", pcBuilder.getKey().getKeyboardPrice()));
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-20s %-40s %10s%n", "Total Price:", "", "$" + String.format("%.2f", calculateTotalPriceDesktop(pcBuilder)));
        System.out.println("------------------------------------------------------------------------");
    }


    private double calculateTotalPriceDesktop(PCBuilder pcBuilder) {
        // Calculate the total price based on the components
        double totalPrice = 0;
        totalPrice += pcBuilder.getCaseClass().getPrice();
        totalPrice += pcBuilder.getCpu().getCpuPrice();
        totalPrice += pcBuilder.getGpu().getGpuPrice();
        totalPrice += pcBuilder.getMobo().getMoboPrice();
        totalPrice += pcBuilder.getPowSup().getPowPrice();
        totalPrice += pcBuilder.getRam().getRamPrice();
        totalPrice += pcBuilder.getMem().getMemPrice();
        totalPrice += pcBuilder.getMon().getMonitorPrice();
        totalPrice += pcBuilder.getMouse().getMousePrice();
        totalPrice += pcBuilder.getKey().getKeyboardPrice();
        return totalPrice;
    }

    public void printReceiptLT(PCBuilder pcBuilder) {
        System.out.printf("Order invoice for: %s%n", pcBuilder.getName());
        System.out.println("---------------------------------Invoice--------------------------------");
        System.out.printf("%-20s %-40s %10s%n", "Case:", "12in", "$" + String.format("%.2f", pcBuilder.getCaseClass().getPrice()));
        System.out.printf("%-20s %-40s %10s%n", "CPU:", "Intel 1GHz CPU", "$" + String.format("%.2f", pcBuilder.getCpu().getCpuPrice()));
        System.out.printf("%-20s %-40s %10s%n", "GPU:", "Nvidia 6Gb", "$" + String.format("%.2f", pcBuilder.getGpu().getGpuPrice()));
        System.out.printf("%-20s %-40s %10s%n", "Motherboard:", "ASUS WIFI Motherboard", "$" + String.format("%.2f", pcBuilder.getMobo().getMoboPrice()));
        System.out.printf("%-20s %-40s %10s%n", "RAM:", "G.Skill 3000MT/s", "$" + String.format("%.2f", pcBuilder.getRam().getRamPrice()));
        System.out.printf("%-20s %-40s %10s%n", "Storage:", "Samsung 256Gb", "$" + String.format("%.2f", pcBuilder.getMem().getMemPrice()));
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-20s %-40s %10s%n", "Total Price:", "", "$" + String.format("%.2f", calculateTotalPriceLaptop(pcBuilder)));
    }

    private double calculateTotalPriceLaptop(PCBuilder pcBuilder)
    {
        double totalPrice = 0;
        totalPrice += pcBuilder.getCaseClass().getPrice();
        totalPrice += pcBuilder.getCpu().getCpuPrice();
        totalPrice += pcBuilder.getGpu().getGpuPrice();
        totalPrice += pcBuilder.getMobo().getMoboPrice();
        totalPrice += pcBuilder.getRam().getRamPrice();
        totalPrice += pcBuilder.getMem().getMemPrice();
        return totalPrice;
        //1
    }
}