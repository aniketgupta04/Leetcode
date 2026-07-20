class Solution {
    public void nextPermutation(int[] nums) {

        int n=nums.length;

        int low=-1;
        for(int i=n-1;i>0;i--){

            if(nums[i]>nums[i-1]){
                low=i-1;
                break;
            }
        } 

        
        if(low!=-1){
            int swapin=low;
        for(int i=n-1;i>=low-1;i--){

            if(nums[i]>=nums[low]+1){
                swapin=i;
                break;
            }

        }
         swap(nums,low,swapin);
        }
       

        reverse(nums,low+1,n);
        
        

    }

    public int[] swap(int nums[],int i,int j){

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        return nums;
    }

    public int[] reverse(int nums[],int i,int j){

        int left =i;
        int right=j-1;

        while (left< right){
             int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;


        }

        return nums;

    }
}