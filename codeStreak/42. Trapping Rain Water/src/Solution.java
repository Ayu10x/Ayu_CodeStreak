public class Solution {
    public int trap(int[] height) {

        int peak = 0;
        int max = 0;
        for(int i=0; i< height.length; i++){
            if(height[i] > max){
                max = height[i];
                peak = i;
            }
        }
        int amount  =0;
        int leftMax =0;
        for(int i=0; i<peak; i++){
            if(height[i] >= leftMax){
                leftMax = height[i];
            }else{
                amount += (leftMax - height[i]);
            }
        }
        int rightMax =0;
        for(int i= height.length-1; i> peak; i--){
            if(height[i] >= rightMax){
                rightMax = height[i];
            }else{
                amount += (rightMax - height[i]);
            }
        }

        return amount;
    }
}