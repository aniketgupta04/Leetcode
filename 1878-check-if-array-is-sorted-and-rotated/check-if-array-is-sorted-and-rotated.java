class Solution {
   public static boolean check(int[] nums) {
        int[] sort=Arrays.copyOf(nums,nums.length);
        Arrays.sort(sort);
        
        boolean issort=true;
         for(int r=0;r<=nums.length;r++){
          issort=true;
          
            for(int i=0;i<nums.length;i++){
                if(sort[i]!=nums[(i+r)%nums.length]){
                    issort=false;
                   
                    break;
                }
            }
            if(issort==true){
                break;
            }
        
        }
        
        if(issort==true){
            return true;
        }
        else{
            return false;
        }
        
    }
}