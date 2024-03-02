package btvn;

public class SavingAccount extends Account{
    // rate: tỉ giá (% lãi suất)
    private float rate;
    // kì hạn
    private int period;

    public SavingAccount() {
        super();
    }

//    public SavingAccount(int accountNo, String customerName, float balance, float rate, int period) {
//        super(accountNo, customerName, balance);
//        this.rate = rate;
//        this.period = period;
//    }

    public SavingAccount(int accountNo, String customerName, float balance, int period) {
        super(accountNo, customerName, balance);
        this.period = period;
        this.rate = getRate();
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public float getRate(){
    // tra ve lai suat theo ki han

        switch (this.getPeriod()){
            case 1:
                  this.rate = 0.05F;
                 break;
            case 3:
                this.rate = 0.055F;
                break;
            case 6:
                this.rate= 0.06F;
                break;
            case 12:
                this.rate = 0.07F;
                break;
            case 24:
                this.rate = 0.075F;
                break;
            case 36:
                this.rate = 0.08F;
                break;
            default:
                this.rate = 0.018F;
        }
        return this.rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public void checkInterest(){
        // in ra lai dc huong sau ki han la may(1,3,6,12,24,36,...) thang
        //biet dc gia tị input đầu vào số tiền gửi= balance ,
        // số tháng gửi
        // và % lãi suất theo từng đấy tháng

        System.out.println("Lãi suất tính theo kì hạn "+period+" tháng là: "+this.getBalance()*this.getRate()*this.getPeriod()+"VNĐ");
    }

    @Override
    public String toString() {
        return "SavingAccount[" +
                super.toString() +
                "rate=" + rate + " %" +
                ", period=" + period + " month " +
                ']';
    }
}
