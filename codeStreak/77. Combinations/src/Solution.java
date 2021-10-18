import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(k == 0) return res;

        bt(1, n, k, new ArrayList<Integer>());
        return res;

    }

    private void bt(int start, int n, int k, List<Integer> list){
        if(k == 0){
            List<Integer> t = new ArrayList<>(list);
            res.add(t);
            return;
        }

        for(int i= start; i<=n; i++){
            list.add(i);
            bt(i+1, n, k-1, list);
            list.remove(list.size()-1);
        }
    }
}