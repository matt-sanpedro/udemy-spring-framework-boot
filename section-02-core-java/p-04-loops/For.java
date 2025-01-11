public class For {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            System.out.println("i: " + i);

            // nested for loop
            for(int j=0; j<8; j++) {
                System.out.println("\tj: " + j);
            }
        }
    }
}