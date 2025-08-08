package TwoDArray;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        int index = 0;
        for(int[] arr : matrix) {
            for(int i=0;i<arr.length;i++) {
                result[i][index] = arr[i];
            }
            index++;
        }

        return result;
    }
}
