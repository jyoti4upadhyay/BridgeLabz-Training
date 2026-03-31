import java.util.*;

public class LongestConsecutive{
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr= num;
                int length = 1;

                while (set.contains(curr+ 1)) {
                    curr++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {109, 409, 206, 71, 803,902};
        System.out.println("Input Array: " + Arrays.toString(nums));
        int longestSeq = longestConsecutive(nums);
        System.out.println("Length of Longest Consecutive Sequence: " + longestSeq);
    }
}
