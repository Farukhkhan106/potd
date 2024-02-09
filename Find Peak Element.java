class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;
        int low = 1, high = n - 2;
        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid + 1] && nums[mid - 1] < nums[mid])
                return mid;
            if (nums[mid] < nums[mid + 1])
                low = mid + 1;
            if (nums[mid] > nums[mid + 1])
                high = mid - 1;
        }
        return -1;
    }
}