class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int right=nums1.length-1;

        for(int i=nums2.length-1;i>=0;i--){

            
            if(nums1[right]==0){
                nums1[right]=nums2[i];
            }

            right--;
        }

        Arrays.sort(nums1);

    }
}