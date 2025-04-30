class Human {
    
    private int age;
    private String name;

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
        obj.setAge(20);
        obj.setName("Bovice");

        System.out.println("Age: " + obj.getAge() + "; Name: " + obj.getName());
    }
}