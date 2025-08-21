class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int[] prefix=new int[arr.length+1];
        prefix[0]=0;
        for(int i=1;i<arr.length+1;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        for(int j=1;j<prefix.length;j++){
            int leftSum=prefix[j-1];
            int rightSum=prefix[prefix.length-1]-prefix[j];
            if(leftSum==rightSum){
                return j-1;
            }
        }
        return -1;
    }
}
