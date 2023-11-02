public class Case {
    private int caseSwitch = 0;
    private String caseSize;
    private double casePrice;

    public String caseOutput() {
        return "Which size case would you like? \n1.Mini ITX +$50\n2.Mini Tower +$100\n3.Mid Tower +$150\n4.Full Tower +$200\n";
    }

    public void setSwitch(int caseSwitch) {
        this.caseSwitch = caseSwitch;
        updateCaseSwitch(); // Update caseSize and casePrice based on the switch value
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

    public double getPrice() {
        return this.casePrice;
    }

    public String getSize() {
        return this.caseSize;
    }
}
