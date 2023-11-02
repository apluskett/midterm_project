public class GPU {
    private int gpuBrand;
    private int gpuSize;
    private String gpuModel;
    private double gpuPrice;
    public String gpuBrand()
    {
        return "Which GPU brand would you like? \n1.Nvidia +$100.00 \n2.AMD +$200.00\n3.Asus +$300\n4.EVGA +$400\n";
    }

    public String gpuSize()
    {
        return "Which GPU size would you like? \n1.6Gb +$200\n2.8Gb +$300\n3.12Gb +$600\n4.24Gb +$1400\n";
    }

    public void setBrandAndSize(int brand, int size) {
        this.gpuBrand = brand;
        this.gpuSize = size;
        updateGpuDetails(); // This will automatically set gpuModel and gpuPrice based on the brand and size
    }

    private void updateGpuDetails() {
        switch (gpuBrand) {
            case 1: // Nvidia
                switch (gpuSize) {
                    case 1: // 6Gb
                        gpuModel = "Nvidia 6Gb ";
                        gpuPrice = 300.00;
                        break;
                    case 2://8Gb
                        gpuModel = "Nvidia 8Gb ";
                        gpuPrice = 400.00;
                        break;
                    case 3://12Gb
                        gpuModel = "Nvidia 12Gb ";
                        gpuPrice = 700.00;
                        break;
                    case 4://24Gb
                        gpuModel = "Nvidia 24Gb ";
                        gpuPrice = 1500.00;
                        break;
                }
                break;
            case 2: // AMD
                switch (gpuSize) {
                    case 1: // 6Gb
                        gpuModel = "AMD 6Gb ";
                        gpuPrice = 400.00;
                        break;
                    case 2://8Gb
                        gpuModel = "AMD 8Gb ";
                        gpuPrice = 500.00;
                        break;
                    case 3://12Gb
                        gpuModel = "AMD 12Gb ";
                        gpuPrice = 800.00;
                        break;
                    case 4://24Gb
                        gpuModel = "AMD 24Gb ";
                        gpuPrice = 1600.00;
                        break;
                }
                break;
            case 3: //Asus
                switch (gpuSize) {
                    case 1: // 6Gb
                        gpuModel = "Asus 6Gb ";
                        gpuPrice = 500.00;
                        break;
                    case 2://8Gb
                        gpuModel = "Asus 8Gb ";
                        gpuPrice = 600.00;
                        break;
                    case 3://12Gb
                        gpuModel = "Asus 12Gb ";
                        gpuPrice = 900.00;
                        break;
                    case 4://24Gb
                        gpuModel = "Asus 24Gb ";
                        gpuPrice = 1700.00;
                        break;
                }
                break;
            case 4://EVGA
                switch (gpuSize) {
                    case 1: // 6Gb
                        gpuModel = "EVGA 6Gb ";
                        gpuPrice = 600.00;
                        break;
                    case 2://8Gb
                        gpuModel = "EVGA 8Gb ";
                        gpuPrice = 700.00;
                        break;
                    case 3://12Gb
                        gpuModel = "EVGA 12Gb ";
                        gpuPrice = 1000.00;
                        break;
                    case 4://24Gb
                        gpuModel = "EVGA 24Gb ";
                        gpuPrice = 1800.00;
                        break;
                }
                break;
        }
    }

    public double getGpuPrice()
    {
        return gpuPrice;
    }

    public String getGpuModel()
    {
        return gpuModel;
    }
}
