public class While {

    public static void main(String[] args) {
        // nested while loop
        int i = 1;

        while (i <= 4) {
            int j = 1;
            while (j <= 3) {
                System.out.println(i + " " + j);
                j++;
            }
            i++;
        }

        // do while loop
        // i = 5 at this point
        do
        {
            System.out.println("i: " + i);
        } while (i <= 4);

    }
}