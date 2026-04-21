class Solution {
    public int[] twoSum(int[] nums, int target) {
       ArrayList<Integer> result= helper(nums,target,nums.length-1,0);
        int[] obj=new int[2];
        obj[0]=result.get(0);
        obj[1]=result.get(1);

       return obj;


    }

    private ArrayList<Integer> helper(int[] nums, int target, int r, int c){
        ArrayList list =new ArrayList<>();
        if(r==0){
            return list;
        }

        if(c<r){
            if(nums[r]+nums[c]==target){
                list.add(r);
                list.add(c);
                return list;
            }
            else{
               return helper(nums,target,r,c+1);
            }
        }
       return helper(nums , target , r-1,0);
    }
}