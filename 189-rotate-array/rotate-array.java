class Solution {

    public void reverse(int[] arr,int i,int n)
    {
        if(i>=n){
            return;
        }
       int temp=arr[i];
       arr[i]=arr[n-1];
       arr[n-1]=temp;
       
       reverse(arr,i+1,n-1);
        
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;

        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);


        
    }
}