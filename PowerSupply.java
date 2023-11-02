public class PowerSupply
{
    private int powBrand;
    private int powSize;
    private String powModel;
    private double powPrice;
    public String powSupBrand()
    {
        return "Which brand of power supply do you want? \n1.NZXT +$10\n2.EVGA +$20\n3.Corsair +$30\n4.Cooler Master +$40\n";
    }

    public String powSupSize()
    {
        return "How much power do you want your power supply to have? \n1.500Watts +$100\n2.600Watts +$200\n3.700Watts +$300\n4.800Watts +$400\n";
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
                        powPrice = 110.00;
                        break;
                    case 2://600Watts Power Supply
                        powModel = "NZXT 600Watts Power Supply";
                        powPrice = 210.00;
                        break;
                    case 3://700Watts Power Supply
                        powModel = "NZXT 700Watts Power Supply";
                        powPrice = 310.00;
                        break;
                    case 4://800Watts Power Supply
                        powModel = "NZXT 800Watts Power Supply";
                        powPrice = 410.00;
                        break;
                }
                break;
            case 2: // EVGA
                switch (powSize) {
                    case 1: // 500Watts Power Supply
                        powModel = "EVGA 500Watts Power Supply";
                        powPrice = 120.00;
                        break;
                    case 2://600Watts Power Supply
                        powModel = "EVGA 600Watts Power Supply";
                        powPrice = 220.00;
                        break;
                    case 3://700Watts Power Supply
                        powModel = "EVGA 700Watts Power Supply";
                        powPrice = 320.00;
                        break;
                    case 4://800Watts Power Supply
                        powModel = "EVGA 800Watts Power Supply";
                        powPrice = 420.00;
                        break;
                }
                break;
            case 3: //Corsair
                switch (powSize) {
                    case 1: // 500Watts Power Supply
                        powModel = "Corsair 500Watts Power Supply";
                        powPrice = 130.00;
                        break;
                    case 2://600Watts Power Supply
                        powModel = "Corsair 600Watts Power Supply";
                        powPrice = 230.00;
                        break;
                    case 3://700Watts Power Supply
                        powModel = "Corsair 700Watts Power Supply";
                        powPrice = 330.00;
                        break;
                    case 4://800Watts Power Supply
                        powModel = "Corsair 800Watts Power Supply";
                        powPrice = 430.00;
                        break;
                }
                break;
            case 4://Cooler Master
                switch (powSize) {
                    case 1: // 500Watts Power Supply
                        powModel = "Cooler Master 500Watts Power Supply";
                        powPrice = 140.00;
                        break;
                    case 2://600Watts Power Supply
                        powModel = "Cooler Master 600Watts Power Supply";
                        powPrice = 240.00;
                        break;
                    case 3://700Watts Power Supply
                        powModel = "Cooler Master 700Watts Power Supply";
                        powPrice = 340.00;
                        break;
                    case 4://800Watts Power Supply
                        powModel = "Cooler Master 800Watts Power Supply";
                        powPrice = 440.00;
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