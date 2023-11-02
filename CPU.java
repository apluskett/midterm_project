public class CPU
{
    private int cpuBrand;
    private int cpuSpeed;
    private String cpuModel;
    private double cpuPrice;
    public String cpuBOut()
    {
        return "Which cpu brand would you like? \n1.Intel +$100\n2.AMD +$50\n";
    }
    public String cpuSOut()
    {
        return "How fast do you want your CPU to be? \n1.1GHz +$50\n2.2GHz +$100\n3.3GHz +$150\n4.4GHz +$200\n";
    }
    public void setBrandAndSpeed(int brand, int speed) {
        this.cpuBrand = brand;
        this.cpuSpeed = speed;
        updateCpuDetails(); // This will automatically set cpuModel and cpuPrice based on the brand and size
    }

    private void updateCpuDetails() {
        switch (cpuBrand) {
            case 1: // Intel
                switch (cpuSpeed) {
                    case 1: // 1GHz CPU
                        cpuModel = "Intel 1GHz CPU ";
                        cpuPrice = 150.00;
                        break;
                    case 2://2GHz CPU
                        cpuModel = "Intel 2GHz CPU ";
                        cpuPrice = 200.00;
                        break;
                    case 3://3GHz CPU
                        cpuModel = "Intel 3GHz CPU ";
                        cpuPrice = 250.00;
                        break;
                    case 4://4GHz CPU
                        cpuModel = "Intel 4GHz CPU ";
                        cpuPrice = 300;
                        break;
                }
                break;
            case 2: // AMD
                switch (cpuSpeed) {
                    case 1: // 1GHz CPU
                        cpuModel = "AMD 1GHz CPU ";
                        cpuPrice = 180.00;
                        break;
                    case 2://2GHz CPU
                        cpuModel = "AMD 2GHz CPU ";
                        cpuPrice = 150.00;
                        break;
                    case 3://3GHz CPU
                        cpuModel = "AMD 3GHz CPU ";
                        cpuPrice = 200.00;
                        break;
                    case 4://4GHz CPU
                        cpuModel = "AMD 4GHz CPU ";
                        cpuPrice = 250.00;
                        break;
                }
                break;
        }
    }
    public double getCpuPrice()
    {
        return cpuPrice;
    }

    public String getCpuModel()
    {
        return cpuModel;
    }
}
