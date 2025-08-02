package TwoDArray;

import java.util.Arrays;

public class TiCTacToeWinner {
    public static void main(String[] args) {
        System.out.println(tictactoe(new int[][]{{0,0},{1,1}}));
    }
    public static String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];

        boolean user1  = true;

        for(int[] move: moves) {
            board[move[0]][move[1]] = user1 ? 1 : 2;
            user1 = !user1;
        }

        if ((board[0][0] == board[0][1] && board[0][0] == board[0][2] && (board[0][0] == 1 || board[0][0] == 2)) ||
                (board[1][0] == board[1][1] && board[1][0] == board[1][2] && (board[1][0] == 1 || board[1][0] == 2)) ||
                (board[2][0] == board[2][1] && board[2][0] == board[2][2] && (board[2][0] == 1 || board[2][0] == 2)) ||
                (board[2][0] == board[1][1] && board[2][0] == board[0][2] && (board[2][0] == 1 || board[2][0] == 2)) ||
                (board[0][0] == board[1][0] && board[0][0] == board[2][0] && (board[0][0] == 1 || board[0][0] == 2))
                || (board[0][1] == board[1][1] && board[0][1] == board[2][1] && (board[0][1] == 1 || board[0][1] == 2))
                || (board[0][2] == board[1][2] && board[0][2] == board[2][2] && (board[0][2] == 1 || board[0][2] == 2))
                || (board[0][0] == board[1][1] && board[0][0] == board[2][2]) && (board[0][0] == 1 || board[0][0] == 2)) {
            return moves.length%2 == 0 ? "B": "A";
        }

        return board.length == 9 ? "Pending" : "Draw";
    }
}
