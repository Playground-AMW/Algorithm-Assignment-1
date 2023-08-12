public class Algo_2 {
    public static void main(String[] args) {

        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

        int smallest = 60;
        int biggest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>biggest) biggest=nums[i];
            if (nums[i]<smallest) smallest=nums[i];
        }
        System.out.println("The biggest number in nums is : " + biggest);
        System.out.println("The smallest number in nums is: " + smallest);
    }
}
