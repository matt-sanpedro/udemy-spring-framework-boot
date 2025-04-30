class Human {
    
    private int age;
    private String name;

    // DEFAULT CONSTRUCTOR
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

    // PARAMETERIZED CONSTRUCTORS
    public Human(String name) {
        // this is a constructor
        // it is called when an object is created
        // it can be used to initialize instance variables
        this.age = 18;
        this.name = name;
        System.out.println("Parmeterized constructor called: name");
    }

    public Human(int age, String name) {
        // this is a constructor
        // it is called when an object is created
        // it can be used to initialize instance variables
        this.age = age;
        this.name = name;
        System.out.println("Parmeterized constructor called: age and name");
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
    
    public void show() {
        System.out.println("Age: " + this.getAge() + "; Name: " + this.getName());
    }
}

class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.show();
        Human obj1 = new Human(42, "Jay Z");
        obj1.show();
        Human obj2 = new Human("Ariana");
        obj2.show();
        // obj.setAge(20);
        // obj.setName("Bovice");

    }
}