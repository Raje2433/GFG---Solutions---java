// User function Template for Java

class Solution {
    static int primeSum(int n) {
        // code here
        int sum=0;
        while(n>0){
            if(prime(n%10)){
                sum+=(n%10);
            }
            n/=10;
        }
        return sum;
    }
    static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}