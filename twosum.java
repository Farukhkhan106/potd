class twosum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i,j,sum=0;
        int a[]=new int[2];
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)

            {
            sum=nums[i]+nums[j];
            if(sum==target)
            {   
                a[0]=i;
                a[1]=j;
               return a;
            }
        }
       
    }
     return a;
}
}