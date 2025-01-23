class Human {
    // private - accessible only in the same class
    // EVERY time create an instance variable, make it private
    // subsequently, the class will have public methods to access these variables
    private int age = 21;
    private String name = "Beyonce";

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    } 

    public void setName(String n) {
        name = n;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        obj.setAge(32);
        obj.setName("Rihanna");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}