public class Memory
{
    private int memBrand;
    private int memSize;
    private String memModel;
    private double memPrice;
    public String auxMemBrand()
    {
        return "Which brand of Storage do you want? \n1.Samsung +$100\n2.Kingston +$200\n3.SeaGate +$300\n4.Western Digital +$400\n";
    }

    public String auxMemSize()
    {
        return "How much storage do you want? \n1.256Gb +$50\n2.512Gb +$70\n3.1Tb +$150\n4.2Tb +$200\n";
    }

    public void setBrandAndSize(int brand, int size) {
        this.memBrand = brand;
        this.memSize = size;
        updateMemDetails(); // This will automatically set memModel and memPrice based on the brand and size
    }

    private void updateMemDetails() {
        switch (memBrand) {
            case 1: // Samsung
                switch (memSize) {
                    case 1: // 256Gb
                        memModel = "Samsung 256Gb Storage";
                        memPrice = 150.00;
                        break;
                    case 2://512Gb Storage
                        memModel = "Samsung 512Gb Storage";
                        memPrice = 170.00;
                        break;
                    case 3://1Tb Storage
                        memModel = "Samsung 1Tb Storage";
                        memPrice = 250.00;
                        break;
                    case 4://2Tb Storage
                        memModel = "Samsung 2Tb Storage";
                        memPrice = 300.00;
                        break;
                }
                break;
            case 2: // Kingston
                switch (memSize) {
                    case 1: // 256Gb
                        memModel = "Kingston 256Gb Storage";
                        memPrice = 250.00;
                        break;
                    case 2://512Gb Storage
                        memModel = "Kingston 512Gb Storage";
                        memPrice = 270.00;
                        break;
                    case 3://1Tb Storage
                        memModel = "Kingston 1Tb Storage";
                        memPrice = 350.00;
                        break;
                    case 4://2Tb Storage
                        memModel = "Kingston 2Tb Storage";
                        memPrice = 400.00;
                        break;
                }
                break;
            case 3: //SeaGate
                switch (memSize) {
                    case 1: // 256Gb
                        memModel = "SeaGate 256Gb Storage";
                        memPrice = 350.00;
                        break;
                    case 2://512Gb Storage
                        memModel = "SeaGate 512Gb Storage";
                        memPrice = 370.00;
                        break;
                    case 3://1Tb Storage
                        memModel = "SeaGate 1Tb Storage";
                        memPrice = 450.00;
                        break;
                    case 4://2Tb Storage
                        memModel = "SeaGate 2Tb Storage";
                        memPrice = 500.00;
                        break;
                }
                break;
            case 4://Western Digital
                switch (memSize) {
                    case 1: // 256Gb
                        memModel = "Western Digital 256Gb Storage";
                        memPrice = 450.00;
                        break;
                    case 2://512Gb Storage
                        memModel = "Western Digital 512Gb Storage";
                        memPrice = 470.00;
                        break;
                    case 3://1Tb Storage
                        memModel = "Western Digital 1Tb Storage";
                        memPrice = 550.00;
                        break;
                    case 4://2Tb Storage
                        memModel = "Western Digital 2Tb Storage";
                        memPrice = 600.00;
                        break;
                }
                break;
        }
    }

    public double getMemPrice()
    {
        return memPrice;
    }

    public String getMemModel()
    {
        return memModel;
    }
}
