public class Case {
    private int caseSwitch = 0;
    private int lapSwitch = 0;
    private String caseSize;
    private double casePrice;

    public String caseOutput()
    {
        return "Which size case would you like? \n1.Mini ITX +$50\n2.Mini Tower +$100\n3.Mid Tower +$150\n4.Full Tower +$200\n";
    }

    public String lapOutput()
    {
        return "Which size laptop would you like? \n1.12in +$300 \n2.14in +$500 \n3.16in +$700 \n4.18in +$1000 \n";
    }

    public void setSwitch(int caseSwitch) {
        this.caseSwitch = caseSwitch;
        updateCaseSwitch(); // Update caseSize and casePrice based on the switch value
    }

    public void setLapSwitch(int lapSwitch)
    {
        this.lapSwitch = lapSwitch;
        updateLapSwitch();
    }

    private void updateCaseSwitch() {
        switch (this.caseSwitch) {
            case 1: //mini-ITX
                this.caseSize = "Mini-ITX";
                this.casePrice = 50.00;
                break;
            case 2: //Mini-Tower
                this.caseSize = "Mini-Tower";
                this.casePrice = 100.00;
                break;
            case 3: //Mid-Tower
                this.caseSize = "Mid-Tower";
                this.casePrice = 150.00;
                break;
            case 4: //Full-tower
                this.caseSize = "Full-Tower";
                this.casePrice = 200.00;
                break;
        }
    }
    private void updateLapSwitch() {
        switch (this.lapSwitch) {
            case 1: //mini-ITX
                this.caseSize = "12in";
                this.casePrice = 300.00;
                break;
            case 2: //Mini-Tower
                this.caseSize = "14in";
                this.casePrice = 500.00;
                break;
            case 3: //Mid-Tower
                this.caseSize = "16in";
                this.casePrice = 700.00;
                break;
            case 4: //Full-tower
                this.caseSize = "18in";
                this.casePrice = 1000.00;
                break;
        }
    }
    public double getPrice() {
        return this.casePrice;
    }

    public String getSize() {
        return this.caseSize;
    }
}
