public class Mouse
{
    private int mouseBrand;
    private int mouseType;
    private String mouseModel;
    private double mousePrice;
    public String mouseBrand()
    {
        return "Which brand of mouse do you want? \n1.Logitech +$10\n2.Razer +$20\n3.Red Dragon +$30\n4.Odin Gaming +40$";
    }

    public String mouseType()
    {
        return "Which type of mouse do you want? \n1.Gaming +$100\n2.Ergonomic +$50\n3.Silent +$30\n4.Multiple buttons +$150";

    }

    public void setBrandAndType(int brand, int type) {
        this.mouseBrand = brand;
        this.mouseType = type;
        updateMouseDetails(); // This will automatically set keyboardModel and keyboardPrice based on the brand and type
    }
    private void updateMouseDetails()
    {
        switch (mouseBrand)
        {
            case 1: // Logitech
                switch (mouseType)
                {
                    case 1: // Gaming
                        mouseModel = "Logitech Gaming Mouse";
                        mousePrice = 110.00;
                        break;
                    case 2: // Ergonomic
                        mouseModel = "Logitech Ergonomic Mouse";
                        mousePrice = 60.00;
                        break;
                    case 3: // Silent
                        mouseModel = "Logitech Silent Mouse";
                        mousePrice = 40.00;
                        break;
                    case 4: // Multi-buttons
                        mouseModel = "Logitech Multi-button Mouse";
                        mousePrice = 160.00;
                        break;
                }
                break;
            case 2: // Razer
                switch (mouseType)
                {
                    case 1: // Gaming
                        mouseModel = "Razer Gaming Mouse";
                        mousePrice = 120.00;
                        break;
                    case 2: // Ergonomic
                        mouseModel = "Razer Ergonomic Mouse";
                        mousePrice = 70.00;
                        break;
                    case 3: // Silent
                        mouseModel = "Razer Silent Mouse";
                        mousePrice = 50.00;
                        break;
                    case 4: // Multi-Button
                        mouseModel = "Razer Multi-button Mouse";
                        mousePrice = 170.00;
                        break;
                }
                break;
            case 3: // Red Dragon
                switch (mouseType)
                {
                    case 1: // Gaming
                        mouseModel = "Red Dragon Gaming Mouse";
                        mousePrice = 130.00;
                        break;
                    case 2: // Ergonomic
                        mouseModel = "Red Dragon Ergonomic Mouse";
                        mousePrice = 80.00;
                        break;
                    case 3: // Silent
                        mouseModel = "Red Dragon Silent Mouse";
                        mousePrice = 60.00;
                        break;
                    case 4: // Multi-Button
                        mouseModel = "Red Dragon Multi-button Mouse";
                        mousePrice = 180.00;
                        break;
                }
                break;
            case 4:// Odin Gaming
                switch (mouseType)
                {
                    case 1: // Gaming
                        mouseModel = "Odin Gaming Gaming Mouse";
                        mousePrice = 140.00;
                        break;
                    case 2: // Ergonomic
                        mouseModel = "Odin Gaming Ergonomic Mouse";
                        mousePrice = 90.00;
                        break;
                    case 3: // Silent
                        mouseModel = "Odin Gaming Silent Mouse";
                        mousePrice = 70.00;
                        break;
                    case 4: // Multi-button
                        mouseModel = "Odin Gaming Multi-button Mouse";
                        mousePrice = 190.00;
                        break;
                }

        }
    }

    public Double getMonitorPrice()
    {
        return mousePrice;
    }

    public String getMonitorModel()
    {
        return mouseModel;
    }
}
