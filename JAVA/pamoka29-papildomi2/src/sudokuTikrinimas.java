import java.util.HashMap;

public class sudokuTikrinimas {
    public static void main(String[] args) {
        int[][] sudokuTeisignas = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][] sudokuBlogas = {  // pirmoj eilutej dukart 5 irasytas
                {5, 5, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

//        System.out.println("arSkaiciaiNesikartojaEilutese(sudokuTeisignas) = " + arSkaiciaiNesikartojaEilutese(sudokuTeisignas));
//        System.out.println("arSkaiciaiNesikartojaEilutese(sudokuBlogas) = " + arSkaiciaiNesikartojaEilutese(sudokuBlogas));
//        System.out.println("arSkaiciaiNesikartojaStulpeliuose(sudokuTeisignas) = " + arSkaiciaiNesikartojaStulpeliuose(sudokuTeisignas));
//        System.out.println("arSkaiciaiNesikartojaStulpeliuose(sudokuBlogas) = " + arSkaiciaiNesikartojaStulpeliuose(sudokuBlogas));
////        System.out.println("kvadratoTikrinimas(sudokuTeisignas) = " + kvadratoTikrinimas(sudokuTeisignas));
////        System.out.println("kvadratoTikrinimas(sudokuBlogas) = " + kvadratoTikrinimas(sudokuBlogas));
//        System.out.println("visuSudokuKvadratuTikrinimas(sudokuTeisignas) = " + visuSudokuKvadratuTikrinimas(sudokuTeisignas));
//        System.out.println("visuSudokuKvadratuTikrinimas(sudokuBlogas) = " + visuSudokuKvadratuTikrinimas(sudokuBlogas));

        arSudokuIssprestasTeisingai(sudokuTeisignas);
        arSudokuIssprestasTeisingai(sudokuBlogas);
    }

    public static boolean arSkaiciaiNesikartojaEilutese(int[][] arr) {
        for (int[] eilutes : arr) {
            HashMap<Integer, Integer> kiekiai = new HashMap<>();
            for (int stulpeliai : eilutes) {
                if (stulpeliai < 1 || stulpeliai > 9 || kiekiai.containsKey(stulpeliai)) {
                    return false;
                }
                kiekiai.put(stulpeliai, 1);
            }
        }
        return true;
    }

    public static boolean arSkaiciaiNesikartojaStulpeliuose(int[][] arr) {
        for (int stulpeliai = 0; stulpeliai < 9; stulpeliai++) {
            HashMap<Integer, Integer> kiekiai = new HashMap<>();
            for (int eilutes = 0; eilutes < 9; eilutes++) {
                int skaicius = arr[eilutes][stulpeliai];
                if (skaicius < 1 || skaicius > 9 || kiekiai.containsKey(skaicius)) {
                    return false;
                }
                kiekiai.put(skaicius, 1);
            }
        }
        return true;
    }

    public static boolean kvadratoTikrinimas(int[][] arr,int i, int j){
        for (int eilutes = i; eilutes < i + 3; eilutes++) {
            HashMap<Integer, Integer> kiekiai = new HashMap<>();
            for (int stulpeliai = j; stulpeliai < j + 3; stulpeliai++) {
                int skaicius = arr[eilutes][stulpeliai];
                if (skaicius < 1 || skaicius > 9 || kiekiai.containsKey(skaicius)) {
                    return false;
                }
                kiekiai.put(skaicius, 1);
            }
        }
        return true;
    }

    public static boolean visuSudokuKvadratuTikrinimas(int[][] arr){
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j +=3) {
                if(!kvadratoTikrinimas(arr, i, j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void arSudokuIssprestasTeisingai(int[][] arr) {
        if (arSkaiciaiNesikartojaEilutese(arr) && arSkaiciaiNesikartojaStulpeliuose(arr) && visuSudokuKvadratuTikrinimas(arr)) {
            System.out.println("Sudoku išsprestas teisingai");
        } else {
            System.out.println("sudoku neišspręstas");
        }
    }
}
