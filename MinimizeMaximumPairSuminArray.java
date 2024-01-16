class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n / 2];
        int k = 0;
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n / 2; i++) {
            arr[i] = nums[i] + nums[n - 1 - i];

        }
        Arrays.sort(arr);
        return arr[n / 2 - 1];
    }
}