/*
For example, Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0 ||matrix[0].length == 0) return res;

        int m = matrix.length;
        int n = matrix[0].length;
        int p1 = 0, q1 = 0;
        int p2 = m-1, q2 = n-1;

        while(true){
            for(int k= q1; k<=q2; k++){
                res.add(matrix[p1][k]);
            }
            if(++p1 > p2) break;

            for(int k=p1; k <=p2;k++){
                res.add(matrix[k][q2]);
            }
            if(--q2 < q1) break;

            for(int k=q2; k>=q1;k--){
                res.add(matrix[p2][k]);
            }
            if(--p2 < p1) break;

            for(int k=p2; k>=p1; k--){
                res.add(matrix[k][q1]);
            }
            if(++q1 > q2) break;
        }
        return res;
    }
}