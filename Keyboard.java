public class Keyboard {
    private int keyboardBrand;
    private int keyboardType;
    private String keyboardModel;
    private double keyboardPrice;

    public String keyboBrand() {
        return "Which brand of keyboard do you want? \n1.Logitech +$20\n2.Razer +$40\n3.Red Dragon +$60\n4.Odin Gaming +80$\n";
    }

    public String keyboType() {
        return "Which type of keyboard do you want? \n1.Mechanical +$80\n2.Silent +$60\n3.Membrane +$40\n4.Ergonomic +$100\n";
    }

    public void setBrandAndType(int brand, int type) {
        this.keyboardBrand = brand;
        this.keyboardType = type;
        updateKeyboardDetails(); // This will automatically set keyboardModel and keyboardPrice based on the brand and type
    }

    private void updateKeyboardDetails() {
        switch (keyboardBrand) {
            case 1: // Logitech
                switch (keyboardType) {
                    case 1: // Mechanical
                        keyboardModel = "Logitech Mechanical Keyboard";
                        keyboardPrice = 100.00;
                        break;
                    case 2: // Silent
                        keyboardModel = "Logitech Silent Keyboard";
                        keyboardPrice = 80.00;
                        break;
                    case 3: // Membrane
                        keyboardModel = "Logitech Membrane Keyboard";
                        keyboardPrice = 60.00;
                        break;
                    case 4: // Ergonomic
                        keyboardModel = "Logitech Ergonomic Keyboard";
                        keyboardPrice = 120.00;
                        break;
                }
                break;
            case 2: // Razer
                switch (keyboardType) {
                    case 1: // Mechanical
                        keyboardModel = "Razer Mechanical Keyboard";
                        keyboardPrice = 120.00;
                        break;
                    case 2: // Silent
                        keyboardModel = "Razer Silent Keyboard";
                        keyboardPrice = 100.00;
                        break;
                    case 3: // Membrane
                        keyboardModel = "Razer Membrane Keyboard";
                        keyboardPrice = 80.00;
                        break;
                    case 4: // Ergonomic
                        keyboardModel = "Razer Ergonomic Keyboard";
                        keyboardPrice = 140.00;
                        break;
                }
                break;
            case 3: //Red Dragon
                switch (keyboardType) {
                case 1: // Mechanical
                    keyboardModel = "Red Dragon Mechanical Keyboard";
                    keyboardPrice = 140.00;
                    break;
                case 2: // Silent
                    keyboardModel = "Red Dragon Silent Keyboard";
                    keyboardPrice = 120.00;
                    break;
                case 3: // Membrane
                    keyboardModel = "Red Dragon Membrane Keyboard";
                    keyboardPrice = 100.00;
                    break;
                case 4: // Ergonomic
                    keyboardModel = "Red Dragon Ergonomic Keyboard";
                    keyboardPrice = 160.00;
                    break;
            }
            break;
            case 4://Odin Gaming
            switch (keyboardType) {
                case 1: // Mechanical
                    keyboardModel = "Odin Gaming Mechanical Keyboard";
                    keyboardPrice = 160.00;
                    break;
                case 2: // Silent
                    keyboardModel = "Odin Gaming Silent Keyboard";
                    keyboardPrice = 140.00;
                    break;
                case 3: // Membrane
                    keyboardModel = "Odin Gaming Membrane Keyboard";
                    keyboardPrice = 120.00;
                    break;
                case 4: // Ergonomic
                    keyboardModel = "Odin Gaming Ergonomic Keyboard";
                    keyboardPrice = 180.00;
                    break;
            }
            // Add cases for Red Dragon and Odin Gaming
        }
    }

    public double getKeyboardPrice() {
        return keyboardPrice;
    }

    public String getKeyboardModel() {
        return keyboardModel;
    }
}
