class Solution {
    public boolean containsDuplicate(int[] nums) {

       HashSet<Integer> li=new HashSet<>();
        boolean flag=false;
    

        for(int num:nums){

            if(li.contains(num)){
                flag=true;
                break;
            }
            else{
                li.add(num);
                continue;
            }
        }
        if(flag){
            return true;
        }
        else{
            return false;
        }
        
    }
}