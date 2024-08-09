public class Main {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int output = trap(height);

        System.out.println(output);
    }

    public static int trap(int[] height) {
        int result = 0;
        for (int i = 1; i < height.length - 1; i++) {
            if (height[i] > 0) {
                int current = height[i];
                for (int j = i + 1; j < height.length; j++) {
                    if (height[j] < current) {
                        System.out.println((i + 1)+" - "+(j));
                    } else {
                        break;
                    }
                }
            }
        }

        return 0;
    }
}