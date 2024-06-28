import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println("Two Sum: "+Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.sort(nums);

        int right = nums.length - 1;
        int left = 0;

        while (left < right) {
            if (nums[left] + nums[right] == target) {
                result[0] = left;
                result[1] = right;

                right--;
                left++;
            } if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}