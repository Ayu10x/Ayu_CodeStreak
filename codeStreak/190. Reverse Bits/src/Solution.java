/*
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
return 964176192 (represented in binary as 00111001011110000010100101000000).
 */

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int result = 0;
        for(int i=0; i<32; i++ ){
            int lsb = n & 1;
            int reverselsb = lsb << (31 - i);
            result = result | reverselsb;
            n = n >> 1;
        }
        return result;
    }
}

/*
If this function is called many times, how would you optimize it?

the solution is of constant time ,which is 32, to improve it on large scale,
your code need to cache certain result, and reduce the number of operation, i.e. from 32 to smaller number.

eg: constant time of 8, calculate the reserse result of each 4 bits number.

public class Solution {
    // you need treat n as an unsigned value
    int[]  cache = new int[]{0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
    public int reverseBits(int n) {
        int res = 0;
        int mask = 0xF;
        for(int i=0; i<8;i++){
            res = res << 4;
            res |= cache[mask&n];
            n >>= 4;
        }

        return res;
    }
}
 */