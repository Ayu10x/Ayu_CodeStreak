/*
Time: O(K)
Space: O(1)
K = m+n
 */

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--] = nums2[p2--];
            }
        }
    }
}


//Another Approach
/*
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m --;
        n --;
        for (int i = m + n + 1; i >=0; i --) {
            int a = m >=0 ? nums1[m]:Integer.MIN_VALUE;
            int b = n >=0 ? nums2[n]:Integer.MIN_VALUE;
            if (a > b) {
                nums1[i] = a;
                m --;
            }
            else {
                nums1[i] = b;
                n --;
            }
        }
    }
}
 */