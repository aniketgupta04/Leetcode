class Solution {
    public boolean containsDuplicate(int[] nums) {

       HashSet<Integer> li=new HashSet<>();
       
    

        for(int num:nums){

            if(li.contains(num)){
                return true;
            }
            else{
                li.add(num);
                continue;
            }
        }
            return false;
        
    }
}