class Solution {
    public int maxSubArray(int[] nums) {

    int n=nums.length;
    int left=0;
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    
    for(int right=0;right<n;right++){

        currsum+=nums[right];
        maxsum=Math.max(maxsum,currsum);

        if(currsum<=0){
            currsum=0;
        }
        
    
        
    }
    
    return maxsum;

    }
}