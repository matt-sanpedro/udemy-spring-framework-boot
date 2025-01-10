class Conversion {
    
    public static void main(String args[]) {
        // using type casting
        int a = 257;
        byte b = (byte) a; // 257 % 256 = 1
        System.out.println("BYTE: " + b);

        // converting float to int loses precision
        float f = 5.8f;
        int i = (int) f; // 5.8 = 5
        System.out.println("INT: " + i);

        // type promotion - variables are promoted to int
        byte c = 10;
        byte d = 30;
        int result = c * d; // byte + byte = int
        System.out.println("RESULT: " + result);
    }
}