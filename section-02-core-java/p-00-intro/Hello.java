// class name should be same as file name
// extension for byte code is .class
// java is called a strongly typed language
// primitive data types: int, byte, short, long, float, double, char, boolean
// object data types: String, Integer, Byte, Short, Long, Float, Double, Character, Boolean
class Hello {
    // object oriented: everything should be an object
    public static void main(String a[]) {
        // type variable_name = value;
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        byte by = 127;
        short sh = 558;
        long l = 1234567890L;
        float f = 5.8f;
        double d = 5.8;
        char c = 'A';
        boolean b = true; // in java, no 0 or 1 for boolean
        System.out.println("TOTAL: "+ result + "\nBYTES: " + by + "\nSHORT: " + sh + "\nLONG: " + l + "\nFLOAT: " + f + "\nDOUBLE: " + d + "\nCHAR: " + c + "\nBOOLEAN: " + b);
    }
}