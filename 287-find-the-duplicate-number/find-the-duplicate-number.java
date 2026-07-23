class Solution {
    public int findDuplicate(int[] nums) {
        
        
       HashSet<Integer> li=new HashSet<>();
       int n=0;
        for(int num:nums){

            if(li.contains(num)){
                n=num;
              break;
            }
            else{
                li.add(num);
                continue;
            }
        }
        return n;
    }
}