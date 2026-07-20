class Solution {
    public int maxSubArray(int[] nums) {

    int n=nums.length;
    int left=0;
    int currsum=0;
    int maxsum=0;
    int min=Integer.MIN_VALUE;
    for(int right=0;right<n;right++){

        currsum+=nums[right];
        
        if(currsum<=0){
            min=Math.max(currsum,min);
            currsum=0;
        }
        maxsum=Math.max(maxsum,currsum);
    
        
    }
    if(maxsum==0){
        maxsum=min;
    }
    return maxsum;

    }
}