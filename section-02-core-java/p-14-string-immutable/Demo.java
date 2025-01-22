public class Demo {

    public static void main(String[] args) {
        // both s1 and s2 will point to the same memory location, only one object will be created
        // in heap memory, there is a string constant pool and same strings will point to same memory location
        // string is immutable (once created cannot be changed)
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);

        // string can be mutable using StringBuffer and StringBuilder
        // StringBuffer is thread safe, StringBuilder is not
        StringBuffer sb = new StringBuffer("Nice");
        // stores the initialized string and 16 empty spaces
        System.out.println(sb.capacity());
        // can also use the length method to count the characters
        System.out.println(sb.length());
        sb.append(" car!");
        System.out.println(sb);

        // can convert the StringBuffer objects to String
        String s3 = sb.toString();
        System.out.println(s3);

        // can set a specific length for storing more characters
        sb.setLength(30);
        System.out.println(s3);
        // check the new capacity
        System.out.println(sb.capacity());
    }
}
