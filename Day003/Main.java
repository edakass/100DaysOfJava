import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //nums = [2,7,11,15], target = 26
        int[] nums = {2, 7, 11, 15};
        System.out.println("Array: " + Arrays.toString(nums));
        int target = 26;
        System.out.println("Target: " + target);

        int[] result = twoSum(nums, target);

        System.out.println("Result: " + "[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            // current + x = target
            // x = target - current
            int x = target - current;
            if (map.containsKey(x)) {
                return new int[]{ map.get(x), i};
            }
            map.put(current, i);
            System.out.println("Added to map: Key = " + current + ", Value = " + i);

        }
        return null;
    }
}