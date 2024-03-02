package btvn;

public class PerSonAccount extends Account {
    private float fee;

    public PerSonAccount() {
        super();
    }

    public PerSonAccount(int accountNo, String customerName, float balance, float fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public void withDraw(int stmr){
        // rut tien
        // 200000-50000=150000
        this.setBalance(this.getBalance()-stmr-fee);
        System.out.println("bạn đã rút " + stmr + "VNĐ. Phí rút tiền là: "+ fee+"VNĐ");
        System.out.println("số dư tài khoản hiện tại của bạn là: " + this.getBalance()+"VNĐ");
    }
    public void deposit(int stmg){
        // gui tien
        this.setBalance(this.getBalance()+stmg);
        System.out.println("bạn đã gửi " + stmg + "VNĐ");
        System.out.println("số dư tài khoản hiện tại của bạn là: " + this.getBalance()+"VNĐ");
    }

    @Override
    public String toString() {
        return "PerSonAccount[" +
                super.toString() +
                "fee=" + fee +
                ']';
    }

}
