public class Receipt {
    PCBuilder pcBuilder = new PCBuilder();
    public void printReceiptDT(PCBuilder pcBuilder) {
        System.out.println("----- Receipt -----");
        System.out.println("Case: " + pcBuilder.getCaseClass().getSize() + ", Price: " + pcBuilder.getCaseClass().getPrice());
        System.out.println("CPU: " + pcBuilder.getCpu().getCpuModel() + ", Price: " + pcBuilder.getCpu().getCpuPrice());
        System.out.println("GPU: " + pcBuilder.getGpu().getGpuModel() + ", Price: " + pcBuilder.getGpu().getGpuPrice());
        System.out.println("Motherboard: " + pcBuilder.getMobo().getmoboModel() + ", Price: " + pcBuilder.getMobo().getmoboPrice());
        System.out.println("PowerSupply: " + pcBuilder.getPowSup().getPowModel() + ", Price: " + pcBuilder.getPowSup().getPowPrice());
        System.out.println("RAM: " + pcBuilder.getRam().getRamModel() + ", Price: " + pcBuilder.getRam().getRamPrice());
        System.out.println("Storage: " + pcBuilder.getMem().getMemModel() + ", Price: " + pcBuilder.getMem().getMemPrice());
        System.out.println("Monitor: " + pcBuilder.getMon().getMonitorModel() + ", Price: " + pcBuilder.getMon().getMonitorPrice());
        System.out.println("Mouse: " + pcBuilder.getMouse().getMouseModel() + ", Price: " + pcBuilder.getMouse().getMousePrice());
        System.out.println("Keyboard: " + pcBuilder.getKey().getKeyboardModel() + ", Price: " + pcBuilder.getKey().getKeyboardPrice());
        System.out.println("Total Price: " + calculateTotalPrice(pcBuilder));
        System.out.println("-------------------");
    }

    private double calculateTotalPrice(PCBuilder pcBuilder) {
        // Calculate the total price based on the components
        double totalPrice = 0;
        totalPrice += pcBuilder.getCaseClass().getPrice();
        totalPrice += pcBuilder.getCpu().getCpuPrice();
        totalPrice += pcBuilder.getGpu().getGpuPrice();
        totalPrice += pcBuilder.getMobo().getmoboPrice();
        totalPrice += pcBuilder.getPowSup().getPowPrice();
        totalPrice += pcBuilder.getRam().getRamPrice();
        totalPrice += pcBuilder.getMem().getMemPrice();
        totalPrice += pcBuilder.getMon().getMonitorPrice();
        totalPrice += pcBuilder.getMouse().getMousePrice();
        totalPrice += pcBuilder.getKey().getKeyboardPrice();
        return totalPrice;
    }
}