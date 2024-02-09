import java.util.*;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;
        Collections.sort(nums);
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int sum = nums.get(low) + nums.get(high);
            if (sum < target) {
                count += high - low;
                low++;
            } else {
                high--;
            }
        }
        return count;
    }
}
