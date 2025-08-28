// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        int n=s.length();
        char[] array=s.toCharArray();
        for(int i=0;i<n/2;i++){
            char temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        String s1 = new String(array);
        return s1;
    }
}