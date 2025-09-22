package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int row = 0; row < m; row++) {
            int minVal = matrix[row][0];
            int colIdx = 0;

            for (int col = 1; col < n; col++) {
                if (matrix[row][col] < minVal) {
                    minVal = matrix[row][col];
                    colIdx = col;
                }
            }

            boolean isMaxInCol = true;
            for (int r = 0; r < m; r++) {
                if (matrix[r][colIdx] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                result.add(minVal);
            }
        }

        return result;
    }
}
