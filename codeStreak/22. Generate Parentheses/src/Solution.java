import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate("", n, n);

        return res;
    }
    private void generate(String s, int left, int right){
        if(left == 0 && right == 0){
            res.add(s);
        }
        if(left < 0 || right < 0 || left > right ) return ;

        generate(s+'(', left-1, right);
        generate(s+')', left, right-1);
    }
}

/*
public class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        gen(n,n, new String());
        return res;
    }

    void gen(int l, int r, String cur){
        if(l > r ) return;
        if(l < 0 || r < 0) return;

        if(l==0 && r==0){
            res.add(cur);
            return;
        }

        gen(l-1, r, cur+"(");
        gen(l, r-1, cur+")");
    }
}
 */