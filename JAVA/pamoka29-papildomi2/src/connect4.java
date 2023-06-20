import java.util.Arrays;
import java.util.Scanner;

public class connect4 {
    public static void main(String[] args) {


        int[][] playfield = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
        };


    }



    public static int lowestPossibleRow(int[][] arr, int col) {
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] == 0) {
                row++;
            }
        }
        return row - 1;
    }


    public static int[][] addPlayerToken(int[][] arr, int move) {
        Scanner input = new Scanner(System.in);
        int col = input.nextInt();
        int row = lowestPossibleRow(arr, col);
        arr[row][col] = 1;
        return arr;
    }


    public static boolean checkForWin(int[][] arr, int player) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr[i].length - 4; j++) {
                if (arr[i][j] == player &&
                        arr[i][j + 1] == player &&
                        arr[i][j + 2] == player &&
                        arr[i][j + 3] == player) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= arr.length - 4; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == player &&
                        arr[i + 1][j] == player &&
                        arr[i + 2][j] == player &&
                        arr[i + 3][j] == player) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= arr.length - 4; i++) {
            for (int j = 0; j <= arr[i].length - 4; j++) {
                if (arr[i][j] == player &&
                        arr[i + 1][j + 1] == player &&
                        arr[i + 2][j + 2] == player &&
                        arr[i + 3][j + 3] == player) {
                    return true;
                }

                if (arr[i][j + 3] == player &&
                        arr[i + 1][j + 2] == player &&
                        arr[i + 2][j + 1] == player &&
                        arr[i + 3][j] == player) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void print2DArrayInGrid(int[][] arr){
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
