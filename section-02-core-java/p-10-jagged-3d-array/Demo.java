public class Demo {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; // jagged array
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        // for loop
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
                System.out.print("i="+i+"; j="+j+"; value="+nums[i][j]+"; ");
            }
            System.out.println();
        }   

        // enhanced for loop
        for (int[] row : nums) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // 3d array
        int numsThree [][][] = new int[3][4][5];
        System.out.println("3d array size: " + numsThree.length); 
    }
}