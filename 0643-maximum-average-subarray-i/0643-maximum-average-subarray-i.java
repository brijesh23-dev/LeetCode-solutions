class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int currsum = 0;
        for(int i = 0 ;i<k;i++){
            currsum+=nums[i];
        }
        int max = currsum;
        for(int i = k;i<n;i++){
            currsum = currsum + nums[i] - nums[i-k];
            max = Math.max(currsum,max);
        }

        return (double)max/k;
    }
}