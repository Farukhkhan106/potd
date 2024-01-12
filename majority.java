class Solution {
    public int majorityElement(int[] nums) {
        int i, j, r = 0;
        for (i = 0; i < nums.length; i++) {
            int count = 0;
            for (j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > (nums.length) / 2) {
                r = nums[i];
                break;
            }
        }
        return r;
    }
}
