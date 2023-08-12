public class Algo_3 {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[(temp.length-1)-i] = nums[i];
        }

        nums = temp;

        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ ", ");
        }
        System.out.print("\b\b ]\n");
    }
}
