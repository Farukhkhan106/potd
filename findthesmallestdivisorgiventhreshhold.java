
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int ans = -1;
        int high = 0;
        for (int i = 0; i < n; i++) {
            if (high < nums[i]) {
                high = nums[i];
            }
        }
        while (low <= high) {
            int sum = 0;
            int mid = (low + high) / 2;
            for (int i = 0; i < n; i++) {
                sum = sum + (int) (Math.ceil((double) nums[i] / mid));

            }

            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;

            } else
                low = mid + 1;

        }
        return ans;
    }
}
