public class Algo_4 {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < (nums.length/2); i++) {
            int temp = 0;
            temp = nums[nums.length-(i+1)];
            nums[nums.length-(i+1)] = nums[i];
            nums[i] = temp;
        }
        
        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ ", ");
        }
        System.out.print("\b\b ]\n");
    }
}
