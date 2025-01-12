public class Demo {
    public static void main(String[] args) {
        // to decalre an array, use the square brackets
        int nums[] = {3,7,2,4};
        System.out.println(nums[0]);

        // update the value
        nums[1] = 6;
        System.out.println(nums[1]);

        // create new array with 4 elements of zeros
        nums = new int[4];
        System.out.println(nums[3]);

        // print all the elements of the array using a for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // or using the for loop in example
        for(int i=0;i<4;i++) {
            System.out.println(nums[i]);
        }
    }
}