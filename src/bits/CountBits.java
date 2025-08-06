package bits;

public class CountBits {
    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for(int i = 0;i<=n;i++) {
            result[i] = bitCount(i);
        }

        return result;
    }

    public int bitCount(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        for(char c: binaryString.toCharArray()) {
            if(c==1) {
                count++;
            }
        }
        return count;
    }
}
