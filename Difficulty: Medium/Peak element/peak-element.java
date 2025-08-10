class Solution {

    public int peakElement(int[] arr) {
        // code here
        int flag=0;
        int index=0;
        if(arr.length==1){
            return 0;
        }
        else{
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
              flag=1;
              index=i;
              break;
            }
        }
        if(flag==1){
            return index;
        }
        else{
            if(arr[0]>arr[1]){
                return 0;
            }
            else if(arr[arr.length-1]>arr[arr.length-2]){
                return arr.length-1;
            }
            else{
            return -1;
            }
        }
        }
    }
}