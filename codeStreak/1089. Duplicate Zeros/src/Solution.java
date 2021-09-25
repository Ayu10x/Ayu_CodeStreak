public class Solution {
    public void duplicateZeros(int[] arr) {
        if(arr == null || arr.length == 0){
            return;
        }

        int CountZero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                ++CountZero;
            }
        }

        int i = arr.length-1, j = arr.length + CountZero-1;

        while(i!=j){
            insert(arr, i, j--);
            if(arr[i] == 0){
                insert(arr, i, j--);
            }
            i--;
        }
    }
    
    private void insert(int[] arr, int i, int j){
        if(j < arr.length){
            arr[j] = arr[i];
        }
    }
}
