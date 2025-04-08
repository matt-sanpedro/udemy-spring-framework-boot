public class Condition {

    public static void main(String[] args) {
        int a = 18;

        // do NOT need curly braces if there is only one statement
        if (a > 10 && a < 20) {
            System.out.println("a is greater than 10 and less than 20");
            System.out.println("thank you");
        } else {
            System.out.println("a is out of range");
        }

        int x = 8;
        int y = 7;
        int z = 6;

        if (x>y && x>z) {
            System.out.println(x);
            System.out.println("x is greater than y and z");
        }
        // below code line is redudant because 
        // if x is not greater than y and z, then y must be greater than z
        // else if (y>x && y>z) {
        else if(y>z){
            System.out.println(y);
            System.out.println("y is greater than x and z");
        }
        else {
            System.out.println(z);
        }

    }
}