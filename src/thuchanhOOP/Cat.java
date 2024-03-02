package thuchanhOOP;

public class Cat extends Dongvat{
    private String color;

    public Cat(){
        super();//gọi laị phương thức của lớp cha
    }

    public Cat(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }

    public void batChuot(){
        System.out.println("Meo dang bat chuot");
        super.eat();
    }

    public void setColor(String color) {
        this.color = color;
    }
}
