import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        for(int i =0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i, j};
                    
                }
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int t =sc.nextInt();
        ArrayList<Integer> num= new ArrayList<>();
        while(true)
        {
          n=sc.nextInt();
          if(n==-1) break;
          num.add(n);

        }
        
        int[] no= new int[num.size()];
        for(int i=0;i<num.size();i++)
        {
            no[i]=num.get(i);
        }
        
        

        

        Solution obj= new Solution();

       int[] result = obj.twoSum(no, t);
if (result != null) {
    System.out.println(Arrays.toString(result));
} else {
    System.out.println("No pair found");
}


    }
}