public class Demo {
    public static void main(String[] args) {
        // declare a multi-dimensional array
        int nums[][] = new int[3][4]; // 3 rows and 4 columns

        // type-casting is performed after calculation, thus curly braces are needed in assignment
        for (int i=0;i<3;i++) {
            for (int j=0;j<4;j++) {
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        // must use nested loops to iterate through multi-dimensional array
        for (int i=0;i<3;i++) {
            for (int j=0;j<4;j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced for loop
        // n - is an single dimensional array so square brackets are used
        for (int n[] : nums) {
            // from the first array, get the first value
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}