// User function Template for Java

class Solution {
    public int distance(int x1, int y1, int x2, int y2) {
        // Code here
        double dis = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        double ans = Math.sqrt(dis);
        long answer = Math.round(ans);
        return (int)answer;
    }
}