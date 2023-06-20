import java.util.Objects;

public class labirintas {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 3},
                {1, 0, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 2, 1, 0, 1, 0, 1}
        };
        String[] directions = {"N", "N", "N", "N", "N", "E", "E", "E", "E", "E"};
        String result = solveMaze(maze, directions);
        System.out.println("Result: " + result);
    }

    public static String solveMaze(int[][] maze, String[] directions) {
        int[] coords = startCoordinates(maze);

        for (String direction : directions) {
            if (Objects.equals(direction, "N")) {
                coords[0] -= 1;
            } else if (Objects.equals(direction, "E")) {
                coords[1] += 1;
            } else if (Objects.equals(direction, "S")) {
                coords[0] += 1;
            } else if (Objects.equals(direction, "W")) {
                coords[1] -= 1;
            }

            if (!isInsideMaze(coords, maze)) {
                return "Dead";
            }

            int cellValue = maze[coords[0]][coords[1]];
            if (cellValue == 1) {
                return "Dead";
            } else if (cellValue == 3) {
                return "Finish";
            }
        }

        return "Lost";
    }

    public static int[] startCoordinates(int[][] maze) {
        int[] startLocation = new int[2];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 2) {
                    startLocation[0] = i;
                    startLocation[1] = j;
                    return startLocation;
                }
            }
        }
        return startLocation;
    }

    public static boolean isInsideMaze(int[] coords, int[][] maze) {
        int row = coords[0];
        int col = coords[1];
        int numRows = maze.length;
        int numCols = maze[0].length;
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }
}
