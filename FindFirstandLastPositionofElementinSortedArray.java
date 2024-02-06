class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int t = target;
        int low = 0, high = n - 1;
        int low1 = 0, high1 = n - 1;
        int arr[] = new int[] { -1, -1 };
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= t) {

                high = mid - 1;
                if (nums[mid] == t) {
                    arr[0] = mid;
                }
            } else
                low = mid + 1;
        }
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= t) {

                low = mid + 1;
                if (nums[mid] == t) {
                    arr[1] = mid;
                }
            } else
                high = mid - 1;
        }

        return arr;
    }

}