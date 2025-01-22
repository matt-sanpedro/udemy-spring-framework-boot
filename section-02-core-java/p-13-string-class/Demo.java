public class Demo {

    public static void main(String[] args) {
        // create new string object
        String name = new String("Lamar");

        // can create string without new keyword, new object will get created
        String name2 = "Kevin";

        System.out.println(name);
        System.out.println(name.hashCode());

        // location of the character
        System.out.println(name.charAt(1));

        // can use the plus operator to concatenate strings
        System.out.println("Kendrick " + name);
        System.out.println(name.concat(" Jackson"));
    }
}