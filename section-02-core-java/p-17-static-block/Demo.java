class Mobile {
    // instance variables
    String brand;
    int price;
    // to make name common for all, can use static keyword
    static String name;

    // static block: can be used to initialize the static variable name
    // this static block will only be called once
    // get called first - class loads and objects are instantiated
    // class loader will only load once and first calls the static block
    static {
        name = "Phone";
        System.out.println("in static block (called once)");
    }

    // constructor
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
}

public class Demo {
    // to call "main", do NOT need object of "Demo" with the keyword "static"
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
    }
}