package demo3;

public class NguoiGiau {
    private String ngYeu;


    public NguoiGiau() {
        super();
    }

    public NguoiGiau(String hoTen,String ngYeu) {

        this.ngYeu = ngYeu;
    }

    public String getNgYeu() {
        return ngYeu;
    }

    public void setNgYeu(String ngYeu) {
        this.ngYeu = ngYeu;
    }


    public void eat(){
        System.out.println("dang an " + ngYeu);
    }
}
