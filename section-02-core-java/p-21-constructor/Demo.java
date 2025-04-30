class Human {
    
    private int age;
    private String name;

    // a constructor is a special method that is called when an object is created 
    // (it looks like a method but has the same name as the class and no return type)
    public Human() {
        // this is a constructor
        // it is called when an object is created
        // it can be used to initialize instance variables
        age = 21;
        name = "Beyonce";
        System.out.println("Constructor called");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // age is instance variable = age is a local variable
        // this is a keyword that represents the current object
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.setAge(20);
        // obj.setName("Bovice");

        System.out.println("Age: " + obj.getAge() + "; Name: " + obj.getName());
    }
}