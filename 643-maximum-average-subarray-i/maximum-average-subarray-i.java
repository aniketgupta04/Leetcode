class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double res=Integer.MIN_VALUE;
        int low=0;
        int high=0;
        double sum=0;
        int count=0;

        while(high<nums.length){
            sum=sum+nums[high];
            count++;
            while(count==k&& low<nums.length){
                double deci=0.0;
                deci=sum/k;
                res=Math.max(res,deci);
                sum=sum-nums[low];
                low++;
                count--;
            }
            high++;
        }
        return res;
        
    }
}