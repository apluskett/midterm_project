public class PowerSupply
{
    private int powBrand;
    private int powSize;
    private String powModel;
    private double powPrice;
    public String powSupBrand()
    {
        return "Which brand of power supply do you want? \n1.NZXT \n2.EVGA \n3.Corsair \n4.Cooler Master";
    }

    public String powSupSize()
    {
        return "How much power do you want your power supply to have? \n1.500Watts \n2.600Watts \n3.700Watts \n4.800Watts ";
    }
    public void setBrandAndSize(int brand, int size) {
        this.powBrand = brand;
        this.powSize = size;
        updateMemDetails(); // This will automatically set powModel and powPrice based on the brand and size
    }

    private void updateMemDetails() {
        switch (powBrand) {
            case 1: // NZXT
                switch (powSize) {
                    case 1: // 500Watts Power Supply
                        powModel = "NZXT 500Watts Power Supply";
                        powPrice = 150.00;
                        break;
                    case 2://600Watts Power Supply
                        powModel = "NZXT 600Watts Power Supply";
                        powPrice = 170.00;
                        break;
                    case 3://700Watts Power Supply
                        powModel = "NZXT 700Watts Power Supply";
                        powPrice = 250.00;
                        break;
                    case 4://800Watts Power Supply
                        powModel = "NZXT 800Watts Power Supply";
                        powPrice = 300.00;
                        break;
                }
                break;
            case 2: // EVGA
                switch (powSize) {
                    case 1: // 500Watts Power Supply
                        powModel = "EVGA 500Watts Power Supply";
                        powPrice = 250.00;
                        break;
                    case 2://600Watts Power Supply
                        powModel = "EVGA 600Watts Power Supply";
                        powPrice = 270.00;
                        break;
                    case 3://700Watts Power Supply
                        powModel = "EVGA 700Watts Power Supply";
                        powPrice = 350.00;
                        break;
                    case 4://800Watts Power Supply
                        powModel = "EVGA 800Watts Power Supply";
                        powPrice = 400.00;
                        break;
                }
                break;
            case 3: //Corsair
                switch (powSize) {
                    case 1: // 500Watts Power Supply
                        powModel = "Corsair 500Watts Power Supply";
                        powPrice = 350.00;
                        break;
                    case 2://600Watts Power Supply
                        powModel = "Corsair 600Watts Power Supply";
                        powPrice = 370.00;
                        break;
                    case 3://700Watts Power Supply
                        powModel = "Corsair 700Watts Power Supply";
                        powPrice = 450.00;
                        break;
                    case 4://800Watts Power Supply
                        powModel = "Corsair 800Watts Power Supply";
                        powPrice = 500.00;
                        break;
                }
                break;
            case 4://Cooler Master
                switch (powSize) {
                    case 1: // 500Watts Power Supply
                        powModel = "Cooler Master 500Watts Power Supply";
                        powPrice = 450.00;
                        break;
                    case 2://600Watts Power Supply
                        powModel = "Cooler Master 600Watts Power Supply";
                        powPrice = 470.00;
                        break;
                    case 3://700Watts Power Supply
                        powModel = "Cooler Master 700Watts Power Supply";
                        powPrice = 550.00;
                        break;
                    case 4://800Watts Power Supply
                        powModel = "Cooler Master 800Watts Power Supply";
                        powPrice = 600.00;
                        break;
                }
                break;
        }
    }

    public double getPowPrice()
    {
        return powPrice;
    }

    public String getPowModel()
    {
        return powModel;
    }
}