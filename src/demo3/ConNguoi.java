package demo3;

public class ConNguoi {
    private String hoTen;

    public ConNguoi() {
    }

    public ConNguoi(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {

        return hoTen;
    }
    public void eat(){
        System.out.println(hoTen+"dang an");
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
