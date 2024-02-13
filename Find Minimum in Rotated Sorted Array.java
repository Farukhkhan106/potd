class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int a = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] <= nums[mid]) {
                a = Math.min(a, nums[low]);
                low = mid + 1;
            } else {
                a = Math.min(a, nums[mid]);
                high = mid - 1;
            }
        }
        return a;
    }
}