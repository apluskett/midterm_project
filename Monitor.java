public class Monitor
{
    private int monitorBrand;
    private int monitorSize;
    private String monitorModel;
    private double monitorPrice;
    public String monBrand()
    {
        return "Which brand of monitor would you like? \n1.Samsung +$100\n2.Asus +$120\n3.ASRock +$140\n4.Gigabyte +$160\n";
    }

    public String monSize()
    {
        return "What size monitor do you want? \n1.27in +$100\n2.32in +$200\n3.37in +$300\n4.42in +$400\n";
    }

    public void setBrandAndType(int brand, int size) {
        this.monitorBrand = brand;
        this.monitorSize = size;
        updateMonitorDetails(); // This will automatically set keyboardModel and keyboardPrice based on the brand and type
    }

    private void updateMonitorDetails()
    {
        switch (monitorBrand)
        {
            case 1: // Samsung
                switch (monitorSize)
                {
                    case 1: // 27in
                        monitorModel = "Samsung 27in";
                        monitorPrice = 200.00;
                        break;
                    case 2: // 32in
                        monitorModel = "Samsung 32in";
                        monitorPrice = 300.00;
                        break;
                    case 3: // 37in
                        monitorModel = "Samsung 37in";
                        monitorPrice = 400.00;
                        break;
                    case 4: // 42in
                        monitorModel = "Samsung 42in";
                        monitorPrice = 500.00;
                        break;
                }
                break;
            case 2: // Asus
                switch (monitorSize)
                {
                    case 1: // 27in
                        monitorModel = "Asus 27in";
                        monitorPrice = 220.00;
                        break;
                    case 2: // 32in
                        monitorModel = "Razer Silent";
                        monitorPrice = 320.00;
                        break;
                    case 3: // 37in
                        monitorModel = "Razer Membrane";
                        monitorPrice = 420.00;
                        break;
                    case 4: // 42in
                        monitorModel = "Razer Ergonomic";
                        monitorPrice = 520.00;
                        break;
                }
                break;
            case 3: //Asrock
                switch (monitorSize)
                {
                    case 1: // 27in
                        monitorModel = "Asrock 27in";
                        monitorPrice = 240.00;
                        break;
                    case 2: // 32in
                        monitorModel = "Asrock 32in";
                        monitorPrice = 340.00;
                        break;
                    case 3: // 37in
                        monitorModel = "Asrock 37in";
                        monitorPrice = 440.00;
                        break;
                    case 4: // 42in
                        monitorModel = "Asrock 42in";
                        monitorPrice = 540.00;
                        break;
                }
                break;
            case 4://Gigabyte
                switch (monitorSize)
                {
                    case 1: // 27in
                        monitorModel = "Gigabyte 27in";
                        monitorPrice = 260.00;
                        break;
                    case 2: // 32in
                        monitorModel = "Gigabyte 32in";
                        monitorPrice = 360.00;
                        break;
                    case 3: // 37in
                        monitorModel = "Gigabyte 37in";
                        monitorPrice = 460.00;
                        break;
                    case 4: // 42in
                        monitorModel = "Gigabyte 42in";
                        monitorPrice = 560.00;
                        break;
                }

        }
    }

    public Double getMonitorPrice()
    {
        return monitorPrice;
    }

    public String getMonitorModel()
    {
        return monitorModel;
    }
}
