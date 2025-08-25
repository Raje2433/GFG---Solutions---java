// User function Template for Java
class Solution {
    public boolean isPowerOfAnother(int X, int Y) {
        // code here
        if(X==1 && Y>1){
            return false;
        }
        for(int i=0;i<=Y;i++){
            double answer=Math.pow(X,i);
            if((int)answer==Y){
                return true;
            }
        }
        return false;
    }
}
