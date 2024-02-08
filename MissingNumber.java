class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int size=0;
       Arrays.sort(nums);
      for(int i=0;i<n;i++)
      {
   if(nums[i]!=i){
break;
   } 
   size++;
      }
 return size;
    }
}