class Solution {
    public int maxArea(int[] height) {

        int n=height.length;
        int res=Integer.MIN_VALUE;
        int left=0;
        int right=n-1;
        int ar=0;

        while(left<right){

            if(height[left]<height[right]){
                ar=height[left]*(right-left);
                res=Math.max(res,ar);
                left++;
            }
            else {
                ar=height[right]*(right-left);
                res=Math.max(res,ar);
                right--;
            }

        }

return res;

    }
}