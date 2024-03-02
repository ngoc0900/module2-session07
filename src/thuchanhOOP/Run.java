package thuchanhOOP;

public class Run {
    public static void main(String[] args) {
        //khoi tao doi tg tu lop Dong vat
        Dongvat dongvat = new Dongvat("cho", "dong vat an thit");
        dongvat.eat();
        Cat tom = new Cat("tom","dong vat an thit","xam");
        Cat meoMuop = new Cat("meo muop","dong vat an thit","vàng");
        tom.setName("meo tom");
        tom.getType("dong vat an thit");
        tom.eat();
        tom.batChuot();
    }
}
