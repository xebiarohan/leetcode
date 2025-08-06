package bits;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(4));
    }
    public static int reverseBits(int n) {
        Integer.reverse(n);
        int i = Integer.parseInt(Integer.toBinaryString(n));
        return i;
    }
}
