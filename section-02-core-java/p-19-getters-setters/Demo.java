class Human {
    // getters and setters and be automatically generated in IDEs
    // for VSC, follow the below steps:
    //     1. right-click and select "Source action..."
    //     2. select "Generate Getters and Setters"

    private int age = 21;
    private String name = "Beyonce";
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        obj.setAge(32);
        obj.setName("Kendrick");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}