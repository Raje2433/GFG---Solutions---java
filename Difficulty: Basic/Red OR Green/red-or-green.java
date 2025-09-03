// User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
        // code here
        int count_red=0;
        int count_green=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='R'){
                count_green++;
            }
            else{
                count_red++;
            }
        }
        return count_green<count_red?count_green:count_red;
    }
}