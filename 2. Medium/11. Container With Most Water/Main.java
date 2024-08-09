public class Main {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);

        System.out.println("Max area: " + result);
    }

    public static int maxArea(int[] height) {
        int result = 0;

        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int smallest = Math.min(height[left], height[right]);
            int distance = Math.abs(right - left);
            int volume = smallest * distance;

            if (volume > result) {
                result = volume;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}