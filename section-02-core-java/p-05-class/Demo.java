class Calculator {
    int result;

    public int add(int num1, int num2) {
        System.out.println("in add method");
        result = num1 + num2;
        return result;
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        // Calculator in this scope is like a type, calc is a reference variable
        // the "new" keyword is used to create an object of the class
        Calculator calc = new Calculator();

        int result = calc.add(num1,num2);
        System.out.println("Result: " + result);
    }
    
}