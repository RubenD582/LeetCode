import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);

        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        } else {
            for (int num : nums) {
                if (list.contains(num)) {
                    continue;
                }

                list.add(num);
                backtrack(result, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }
}
