public class PCBuilder {
    static int caseSwitch, cpuBrand, cpuSpeed, auxMemoryBrand, auxMemorySize, monitorBrand, monitorSize, keyboardBrand, keyboardType,mouseBrand, mouseType, powerSupplyBrand, powerSupplySize, motherBoardBrand, motherBoardType, ramBrand, ramSize;

    public PCBuilder()
    {

    }

    public PCBuilder(int caseSwitch)
    {
        this.caseSwitch = caseSwitch;
    }

    public PCBuilder(int caseSwitch, int cpuBrand)
    {
        this(caseSwitch);
        this.cpuBrand = cpuBrand;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed)
    {
        this(caseSwitch, cpuBrand);
        this.cpuSpeed = cpuSpeed;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand)
    {
        this(caseSwitch, cpuBrand, cpuSpeed);
        this.motherBoardBrand = motherBoardBrand;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand);
        this.motherBoardType = motherBoardType;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType);
        this.ramBrand = ramBrand;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand);
        this.ramSize = ramSize;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize, int auxMemoryBrand)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize);
        this.auxMemoryBrand = auxMemoryBrand;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize, int auxMemoryBrand, int auxMemorySize)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand);
        this.auxMemorySize = auxMemorySize;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand, auxMemorySize);
        this.powerSupplyBrand = powerSupplyBrand;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand,int powerSupplySize)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand, auxMemorySize, powerSupplyBrand);
        this.powerSupplySize = powerSupplySize;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand, int powerSupplySize, int monitorBrand)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand, auxMemorySize, powerSupplyBrand, powerSupplySize);
        this.monitorBrand = monitorBrand;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand, int powerSupplySize, int monitorBrand, int monitorSize)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand, auxMemorySize, powerSupplyBrand, powerSupplySize, monitorBrand);
        this.monitorSize = monitorSize;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand, int powerSupplySize, int monitorBrand, int monitorSize,
                     int keyboardBrand)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand, auxMemorySize, powerSupplyBrand, powerSupplySize, monitorBrand, monitorSize);
        this.keyboardBrand = keyboardBrand;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand, int powerSupplySize, int monitorBrand, int monitorSize,
                     int keyboardBrand, int keyboardType)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand, auxMemorySize, powerSupplyBrand, powerSupplySize, monitorBrand, monitorSize, keyboardBrand);
        this.keyboardType = keyboardType;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand, int powerSupplySize, int monitorBrand, int monitorSize,
                     int keyboardBrand, int keyboardType, int mouseBrand)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand, auxMemorySize, powerSupplyBrand, powerSupplySize, monitorBrand, monitorSize, keyboardBrand, keyboardType);
        this.mouseBrand = mouseBrand;
    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupplyBrand, int powerSupplySize, int monitorBrand, int monitorSize,
                     int keyboardBrand, int keyboardType, int mouseBrand, int mouseType)
    {
        this(caseSwitch, cpuBrand, cpuSpeed, motherBoardBrand, motherBoardType, ramBrand, ramSize, auxMemoryBrand, auxMemorySize, powerSupplyBrand, powerSupplySize, monitorBrand, monitorSize, keyboardBrand, keyboardType, mouseBrand);
        this.mouseType = mouseType;
    }
}
