class Solution {
    public boolean isPowerOfTwo(int n) {
       return helper(n,0); 
    }

    private boolean helper(int n,int pow){

        if(n==Math.pow(2,pow)){
            return true ;
        }

        if(n<Math.pow(2,pow)){
            return false;
        }
        return helper(n,pow+1);

    }

}