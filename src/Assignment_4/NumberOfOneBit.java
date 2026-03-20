package Assignment_4;
// LeetCode 191 - Number of 1 Bits
public class NumberOfOneBit{
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1);
            n >>>= 1; // unsigned right shift
        }

        return count;
    }
}
