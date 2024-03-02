package thuchanhOOP;

public class Dongvat {
        private String name;
        private String type;

    public Dongvat() {
    }

    public Dongvat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType(String dongVatAnThit) {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void eat(){
        System.out.println(name +" Dang an ne");
    }
}
