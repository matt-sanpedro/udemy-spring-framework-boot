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

        // quiz 1-9
        char ch = 'a';
        char r = (char)(ch + 1);
        System.out.println(r);

        // quiz 1-10
        byte b1=5,b2=6;
        byte b3=(byte)(b1+b2);
        System.out.println(b3);
    }
}