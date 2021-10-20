import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0)
            return 0;
        int rows = triangle.size();int cols = triangle.get(rows-1).size();
        int[] tmp = new int[cols];
        int index = 0;
        for (int var : triangle.get(rows-1)) {
            tmp[index++] = var;
        }
        for (int i = rows-2; i >= 0; i--) {
            for (int j = 0; j <= triangle.get(i).size()-1 ; j++) {
                tmp[j] = triangle.get(i).get(j) + Math.min(tmp[j], tmp[j+1]);
            }
        }
        return tmp[0];
    }
}