public class Receipt public class Receipt {
    CPU cpu;
    Case caseClass;
    Motherboard mobo;
    RAM ram;
    Memory mem;
    PowerSupply powSup;
    Monitor mon;
    Keyboard key;
    Mouse mouse;
    GPU gpu;

    public Receipt(CPU cpu, Case caseClass, Motherboard mobo, RAM ram, Memory mem, PowerSupply powSup, Monitor mon, Keyboard key, Mouse mouse, GPU gpu) {
        this.cpu = cpu;
        this.caseClass = caseClass;
        this.mobo = mobo;
        this.ram = ram;
        this.mem = mem;
        this.powSup = powSup;
        this.mon = mon;
        this.key = key;
        this.mouse = mouse;
        this.gpu = gpu;
    }

    public void printReceiptDT() {
        System.out.println("----- Receipt -----");
        System.out.println("Case: " + caseClass.getSize() + ", Price: " + caseClass.getPrice());
        System.out.println("CPU: " + cpu.getCpuModel() + ", Price: " + cpu.getCpuPrice());
        System.out.println("GPU: " + gpu.getGpuModel() + ", Price: " + gpu.getGpuPrice());
        System.out.println("Motherboard: " + mobo.getmoboModel() + ", Price: " + mobo.getmoboPrice());
        System.out.println("PowerSupply: " + powSup.getPowModel() + ", Price: " + powSup.getPowPrice());
        System.out.println("RAM: " + ram.getRamModel() + ", Price: " + ram.getRamPrice());
        System.out.println("Storage: " + mem.getMemModel() + ", Price: " + mem.getMemPrice());
        System.out.println("Monitor: " + mon.getMonitorModel() + ", Price: " + mon.getMonitorPrice());
        System.out.println("Mouse: " + mouse.getMouseModel() + ", Price: " + mouse.getMousePrice());
        System.out.println("Keyboard: " + key.getKeyboardModel() + ", Price: " + key.getKeyboardPrice());
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("-------------------");
    }

    private double calculateTotalPrice() {
        // Calculate the total price based on the components
        double totalPrice = 0;
        totalPrice += caseClass.getPrice();
        totalPrice += cpu.getCpuPrice();
        totalPrice += gpu.getGpuPrice();
        totalPrice += mobo.getmoboPrice();
        totalPrice += powSup.getPowPrice();
        totalPrice += ram.getRamPrice();
        totalPrice += mem.getMemPrice();
        totalPrice += mon.getMonitorPrice();
        totalPrice += mouse.getMousePrice();
        totalPrice += key.getKeyboardPrice();
        return totalPrice;
    }
}
