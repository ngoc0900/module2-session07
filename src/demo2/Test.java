package demo2;

public class Test {
    public static void main(String[] args) {
        Person ng1 = new Person("Ngoc","HP");
        String ng1String = ng1.toString();
        System.out.println(ng1String);
        Staff gv = new Staff("Hung","HP","LTK", 10);
        String gv1 = gv.toString();
        System.out.println(gv1);
        ng1.thacSi();
        gv.dayHoc();


    }
}
