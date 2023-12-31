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
    Receipt invoice = new Receipt();
    String name;
    int caseSwitch, lapSwitch, cpuBrand, cpuSpeed, auxMemoryBrand, auxMemorySize, monitorBrand, monitorSize, keyboardBrand,
            keyboardType,mouseBrand, mouseType, powerSupplyBrand, powerSupplySize, motherBoardBrand, motherBoardType,
            ramBrand, ramSpeed, gpuBrand, gpuSize;
    String Name;
    public PCBuilder() {}
    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSpeed, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand, int powerSupplySize, int monitorBrand, int monitorSize,
                     int keyboardBrand, int keyboardType, int mouseBrand, int mouseType, int gpuBrand, int gpuSize, String name) {
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
        this.name = name;
    }
    public PCBuilder(int lapSwitch,int cpuBrand,int cpuSpeed,int motherBoardBrand,int motherBoardType,int gpuBrand,int gpuSize,int ramBrand,int ramSpeed,int auxMemoryBrand,int auxMemorySize,String name)
    {
        this.lapSwitch = lapSwitch;
        this.cpuBrand = cpuBrand;
        this.cpuSpeed = cpuSpeed;
        this.motherBoardBrand = motherBoardBrand;
        this.motherBoardType = motherBoardType;
        this.ramBrand = ramBrand;
        this.ramSpeed = ramSpeed;
        this.auxMemoryBrand = auxMemoryBrand;
        this.auxMemorySize = auxMemorySize;
        this.gpuBrand = gpuBrand;
        this.gpuSize = gpuSize;
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void sendSettersDesktop() {
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
    public void sendSettersLaptop()
    {
        caseClass.setLapSwitch(lapSwitch);
        gpu.setBrandAndSize(gpuBrand, gpuSize);
        ram.setBrandAndSpeed(ramBrand, ramSpeed);
        mem.setBrandAndSize(auxMemoryBrand, auxMemorySize);
        mobo.setBrandAndType(motherBoardBrand, motherBoardType);
        cpu.setBrandAndSpeed(cpuBrand, cpuSpeed);
    }
    public CPU getCpu() {
        return cpu;
    }
    public GPU getGpu()
        {
        return gpu;
    }
    public Case getCaseClass()
    {
        return caseClass;
    }
    public Monitor getMon()
    {
        return mon;
    }
    public Motherboard getMobo()
    {
        return mobo;
    }
    public Keyboard getKey()
    {
        return key;
    }
    public PowerSupply getPowSup()
    {
        return powSup;
    }
    public RAM getRam()
    {
        return ram;
    }
    public Memory getMem()
    {
        return mem;
    }
    public Mouse getMouse() {
        return mouse;
    }
    public Receipt getInvoice()
    {
        return invoice;
    }
}