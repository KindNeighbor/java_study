import java.util.ArrayList;

public class Practice4 {

    public static ArrayList<Integer> sol(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return null;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = mat.length - 1;
        int colStart = 0;
        int colEnd = mat[0].length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                result.add(mat[rowStart][i]);
            }
            rowStart++;
            System.out.println("rowStart = " + rowStart);
            System.out.println("rowEnd = " + rowEnd);
            System.out.println("colStart = " + colStart);
            System.out.println("colEnd = " + colEnd);
            System.out.println("result = " + result);
            System.out.println();


            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(mat[i][colEnd]);
            }
            colEnd--;
            System.out.println("rowStart = " + rowStart);
            System.out.println("rowEnd = " + rowEnd);
            System.out.println("colStart = " + colStart);
            System.out.println("colEnd = " + colEnd);
            System.out.println("result = " + result);
            System.out.println();

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart ; i--) {
                    result.add(mat[rowEnd][i]);
                }
            }
            rowEnd--;
            System.out.println("rowStart = " + rowStart);
            System.out.println("rowEnd = " + rowEnd);
            System.out.println("colStart = " + colStart);
            System.out.println("colEnd = " + colEnd);
            System.out.println("result = " + result);
            System.out.println();

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(mat[i][colStart]);
                }
            }
            colStart++;
            System.out.println("rowStart = " + rowStart);
            System.out.println("rowEnd = " + rowEnd);
            System.out.println("colStart = " + colStart);
            System.out.println("colEnd = " + colEnd);
            System.out.println("result = " + result);
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sol(mat));
        System.out.println("===============");
        System.out.println();

        mat = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(sol(mat));
    }
}
