class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {
        // code here
        if(Q==1){
            A.add(Query.get(0),Query.get(1));
        }
        else{
            int element=A.lastIndexOf(Query.get(0));
            A.clear();
            A.add(element);
        }
        return A;
    }
}