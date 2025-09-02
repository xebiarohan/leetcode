package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] sudokuGrid = {
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };


        System.out.println(isValidSudoku(sudokuGrid));
    }

    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++) {
            List<Character> temp = new ArrayList<>();
            for(int j = 0;j<9;j++) {
                if(board[i][j] != '.') {
                    if(temp.contains(board[i][j])) {
                        return false;
                    } else {
                        temp.add(board[i][j]);
                    }
                }
            }
        }

        for(int i=0;i<9;i++) {
            List<Character> list = new ArrayList<>();
            for(int j = 0;j<9;j++) {
                if(board[j][i] != '.' ) {
                    if(list.contains(board[j][i])) {
                        return false;
                    } else {
                        list.add(board[j][i]);
                    }
                }
            }
        }

        int xInitial = 0;
        int xLast = 3;
        while (xLast <=9) {
            int yInitial = 0;
            int yLast = 3;
            while (yLast <=9) {
                List<Character> list = new ArrayList<>();
                for(int i = xInitial;i<xLast;i++) {
                    for(int j=yInitial;j<yLast;j++) {
                        if(board[i][j] != '.') {
                            if(list.contains(board[i][j])) {
                                return false;
                            } else {
                                list.add(board[i][j]);
                            }
                        }
                    }
                }
                yInitial+=3;
                yLast+=3;
            }

            xInitial+=3;
            xLast+=3;
        }

        return true;
    }
}
