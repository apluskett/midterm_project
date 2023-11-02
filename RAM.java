public class RAM
{
    private int ramBrand;
    private int ramSpeed;
    private String ramModel;
    private double ramPrice;
    public String ramBrand()
    {
        return "Which brand of RAM do you want? \n1.G.Skill +$100\n2.Corsair +$80\n3.HYPERX +$60\n4.Kingston +$40\n";
    }

    public String ramSize()
    {
        return "Which speed or RAM do you want? \n1.3000MT/s +$100\n2.3200MT/s +$150\n3.3600MT/s +$200\n4.4000MT/s +$250\n";
    }

    public void setBrandAndSpeed(int brand, int speed) {
        this.ramBrand = brand;
        this.ramSpeed = speed;
        updateRAMDetails(); // This will automatically set ramModel and ramPrice based on the brand and size
    }

    private void updateRAMDetails() {
        switch (ramBrand) {
            case 1: // G.Skill
                switch (ramSpeed) {
                    case 1: // 3000MT/s
                        ramModel = "G.Skill 3000MT/s ";
                        ramPrice = 200.00;
                        break;
                    case 2://3200MT/s
                        ramModel = "G.Skill 3200MT/s ";
                        ramPrice = 250.00;
                        break;
                    case 3://3600MT/s
                        ramModel = "G.Skill 3600MT/s ";
                        ramPrice = 300.00;
                        break;
                    case 4://4000MT/s
                        ramModel = "G.Skill 4000MT/s ";
                        ramPrice = 350.00;
                        break;
                }
                break;
            case 2: // Corsair
                switch (ramSpeed) {
                    case 1: // 3000MT/s
                        ramModel = "Corsair 3000MT/s ";
                        ramPrice = 180.00;
                        break;
                    case 2://3200MT/s
                        ramModel = "Corsair 3200MT/s ";
                        ramPrice = 230.00;
                        break;
                    case 3://3600MT/s
                        ramModel = "Corsair 3600MT/s ";
                        ramPrice = 280.00;
                        break;
                    case 4://4000MT/s
                        ramModel = "Corsair 4000MT/s ";
                        ramPrice = 330.00;
                        break;
                }
                break;
            case 3: //HYPERX
                switch (ramSpeed) {
                    case 1: // 3000MT/s
                        ramModel = "HYPERX 3000MT/s ";
                        ramPrice = 160.00;
                        break;
                    case 2://3200MT/s
                        ramModel = "HYPERX 3200MT/s ";
                        ramPrice = 210.00;
                        break;
                    case 3://3600MT/s
                        ramModel = "HYPERX 3600MT/s ";
                        ramPrice = 260.00;
                        break;
                    case 4://4000MT/s
                        ramModel = "HYPERX 4000MT/s ";
                        ramPrice = 310.00;
                        break;
                }
                break;
            case 4://Kingston
                switch (ramSpeed) {
                    case 1: // 3000MT/s
                        ramModel = "Kingston 3000MT/s ";
                        ramPrice = 140.00;
                        break;
                    case 2://3200MT/s
                        ramModel = "Kingston 3200MT/s ";
                        ramPrice = 190.00;
                        break;
                    case 3://3600MT/s
                        ramModel = "Kingston 3600MT/s ";
                        ramPrice = 240.00;
                        break;
                    case 4://4000MT/s
                        ramModel = "Kingston 4000MT/s ";
                        ramPrice = 290.00;
                        break;
                }
                break;
        }
    }

    public double getRamPrice()
    {
        return ramPrice;
    }

    public String getRamModel()
    {
        return ramModel;
    }
}
