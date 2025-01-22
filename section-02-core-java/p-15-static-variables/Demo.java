class Mobile {
    // instance variables
    String brand;
    int price;
    // to make name common for all, can use static keyword
    static String name;



    public void show() {
        System.out.println("Brand: " + brand + "; Price: " + price + "; Name: " + name);
    }
}

public class Demo {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone";

        // static variables should be called with static class name
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}