public class PCBuilder {
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


    int caseSwitch, cpuBrand, cpuSpeed, auxMemoryBrand, auxMemorySize, monitorBrand, monitorSize, keyboardBrand,
            keyboardType,mouseBrand, mouseType, powerSupplyBrand, powerSupplySize, motherBoardBrand, motherBoardType,
            ramBrand, ramSpeed, gpuBrand, gpuSize;

    public PCBuilder()
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSpeed, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand, int powerSupplySize, int monitorBrand, int monitorSize,
                     int keyboardBrand, int keyboardType, int mouseBrand, int mouseType, int gpuBrand, int gpuSize) {
        this.caseSwitch = caseSwitch;
        this.cpuBrand = cpuBrand;
        this.cpuSpeed = cpuSpeed;
        this.motherBoardBrand = motherBoardBrand;
        this.motherBoardType = motherBoardType;
        this.ramBrand = ramBrand;
        this.ramSpeed = ramSpeed;
        this.auxMemoryBrand = auxMemoryBrand;
        this.auxMemorySize = auxMemorySize;
        this.powerSupplyBrand = powerSupplyBrand;
        this.powerSupplySize = powerSupplySize;
        this.monitorBrand = monitorBrand;
        this.monitorSize = monitorSize;
        this.keyboardBrand = keyboardBrand;
        this.keyboardType = keyboardType;
        this.mouseBrand = mouseBrand;
        this.mouseType = mouseType;
        this.gpuBrand = gpuBrand;
        this.gpuSize = gpuSize;
    }
    public void sendSetters() {
        // Set properties for the case
        caseClass.setSwitch(caseSwitch);

        // Set properties for the GPU
        gpu.setBrandAndSize(gpuBrand, gpuSize);

        // Set properties for the keyboard
        key.setBrandAndType(keyboardBrand, keyboardType);

        // Set properties for the monitor
        mon.setBrandAndType(monitorBrand, monitorSize);

        // Set properties for the mouse
        mouse.setBrandAndType(mouseBrand, mouseType);

        // Set properties for the RAM
        ram.setBrandAndSpeed(ramBrand, ramSpeed);

        // Set properties for the memory
        mem.setBrandAndSize(auxMemoryBrand, auxMemorySize);

        // Set properties for the power supply
        powSup.setBrandAndSize(powerSupplyBrand, powerSupplySize);

        // Set properties for the motherboard
        mobo.setBrandAndType(motherBoardBrand, motherBoardType);

        // Set properties for the CPU
        cpu.setBrandAndSpeed(cpuBrand, cpuSpeed);
    }
}
