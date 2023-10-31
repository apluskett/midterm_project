public class PCBuilder {
    static int caseSwitch, cpuBrand, cpuSpeed, auxMemoryBrand, auxMemorySize, monitorBrand, monitorSize, keyboardBrand, keyboardType,mouseBrand, mouseType, powerSupply, motherBoardBrand, motherBoardType, ramBrand, ramSize;

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

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize, int auxMemoryBrand)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize, int auxMemoryBrand, int auxMemorySize)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupply)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand, int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupply, int monitorBrand)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupply, int monitorBrand, int monitorSize)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupply, int monitorBrand, int monitorSize,
                     int keyboardBrand)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupply, int monitorBrand, int monitorSize,
                     int keyboardBrand, int keyboardType)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupply, int monitorBrand, int monitorSize,
                     int keyboardBrand, int keyboardType, int mouseBrand)
    {

    }

    public PCBuilder(int caseSwitch, int cpuBrand, int cpuSpeed, int motherBoardBrand, int motherBoardType, int ramBrand,
                     int ramSize, int auxMemoryBrand, int auxMemorySize, int powerSupply, int monitorBrand, int monitorSize,
                     int keyboardBrand, int keyboardType, int mouseBrand, int mouseType)
    {

    }

}
