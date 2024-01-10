class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n + 1];
        int i;
        for (i = 0; i <= n; i++) {
            arr[i] = 0;
        }
        for (i = 0; i < n; i++) {
            arr[nums[i]] = 1;
        }
        int ans = -1;
        for (i = 0; i <= n; i++) {
            if (arr[i] == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }

}