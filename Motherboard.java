public class Motherboard
{
    private int moboBrand;
    private int moboType;
    private String moboModel;
    private double moboPrice;
    public String moboBrand()
    {
        return "Which motherboard brand do you want? \n1.ASUS +$50\n2.MSI +$100\n3.ASRock +$150\n4.Gigabyte +$200\n";
    }

    public String moboType()
    {
        return "Which type of motherboard do you want? \n1.WIFI +$50\n2.Ethernet +$70\n3.Gaming +$100\n4.Work station +$200\n";
    }

    public void setBrandAndType(int brand, int type) {
        this.moboBrand = brand;
        this.moboType = type;
        updateMoboDetails(); // This will automatically set moboModel and moboPrice based on the brand and size
    }

    private void updateMoboDetails() {
        switch (moboBrand) {
            case 1: // ASUS
                switch (moboType) {
                    case 1: // WI-FI Motherboard
                        moboModel = "ASUS WIFI Motherboard Motherboard";
                        moboPrice = 100.00;
                        break;
                    case 2://Ethernet
                        moboModel = "ASUS Ethernet Motherboard";
                        moboPrice = 120.00;
                        break;
                    case 3://Gaming
                        moboModel = "ASUS Gaming Motherboard";
                        moboPrice = 150.00;
                        break;
                    case 4://Work station
                        moboModel = "ASUS Work station Motherboard";
                        moboPrice = 250.00;
                        break;
                }
                break;
            case 2: // MSI
                switch (moboType) {
                    case 1: // WI-FI Motherboard
                        moboModel = "MSI WIFI Motherboard Motherboard";
                        moboPrice = 150.00;
                        break;
                    case 2://Ethernet
                        moboModel = "MSI Ethernet Motherboard";
                        moboPrice = 170.00;
                        break;
                    case 3://Gaming
                        moboModel = "MSI Gaming Motherboard";
                        moboPrice = 200.00;
                        break;
                    case 4://Work station
                        moboModel = "MSI Work station Motherboard";
                        moboPrice = 300.00;
                        break;
                }
                break;
            case 3: //ASRock
                switch (moboType) {
                    case 1: // WI-FI Motherboard
                        moboModel = "ASRock WIFI Motherboard Motherboard";
                        moboPrice = 200.00;
                        break;
                    case 2://Ethernet
                        moboModel = "ASRock Ethernet Motherboard";
                        moboPrice = 220.00;
                        break;
                    case 3://Gaming
                        moboModel = "ASRock Gaming Motherboard";
                        moboPrice = 250.00;
                        break;
                    case 4://Work station
                        moboModel = "ASRock Work station Motherboard";
                        moboPrice = 350.00;
                        break;
                }
                break;
            case 4://Gigabyte
                switch (moboType) {
                    case 1: // WI-FI Motherboard
                        moboModel = "Gigabyte WIFI Motherboard";
                        moboPrice = 250.00;
                        break;
                    case 2://Ethernet
                        moboModel = "Gigabyte Ethernet Motherboard";
                        moboPrice = 270.00;
                        break;
                    case 3://Gaming
                        moboModel = "Gigabyte Gaming Motherboard";
                        moboPrice = 300.00;
                        break;
                    case 4://Work station
                        moboModel = "Gigabyte Work station Motherboard";
                        moboPrice = 400.00;
                        break;
                }
                break;
        }
    }

    public double getMoboPrice()
    {
        return moboPrice;
    }

    public String getMoboModel()
    {
        return moboModel;
    }
}
