package string;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }

    public static int hammingDistance(int x, int y) {
        String binaryString = Integer.toBinaryString(x ^ y);

        int result = 0;

        for(char c: binaryString.toCharArray()) {
            if(c == '1') {
                result++;
            }
        }

        return result;
    }
}
