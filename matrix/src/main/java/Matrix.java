
class Matrix {

    private int[][] matrix;
    private int row;
    private int column;

    Matrix(String matrixAsString) {
        this.row = matrixAsString.split("\n").length;
        this.column = matrixAsString.split("\n")[0].split(" ").length;
        int[][] m = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                m[i][j] = Integer.parseInt(matrixAsString.split("\n")[i].split(" ")[j]);
            }
        }
        this.matrix = m;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getRow(int rowNumber) {
        int[] rows = new int[column];
        for (int i = 0; i < column; i++) {
            rows[i] = matrix[rowNumber - 1][i];
        }
        return rows;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getColumn(int columnNumber) {
        int[] columns = new int[row];
        for (int i = 0; i < row; i++) {
            columns[i] = matrix[i][columnNumber - 1];
        }
        return columns;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
