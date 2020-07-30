import java.util.*;

class Matrix {

    private List<MatrixCoordinate> matrixCoordinateList;

    Matrix(List<List<Integer>> values) {
        List<MatrixCoordinate> matrixCoordinates = new LinkedList<>();
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values.get(0).size(); j++) {
                boolean isA = true;
                boolean isN = true;
                for (int m = 0; m < values.size(); m++) {
                    if (values.get(i).get(j) > values.get(m).get(j) && m != i) {
                        isA = false;
                        break;
                    }
                }
                for (int n = 0; n < values.get(0).size(); n++) {
                    if (values.get(i).get(j) < values.get(i).get(n) && j != n) {
                        isN = false;
                        break;
                    }
                }
                if (isA && isN) {
                    matrixCoordinates.add(new MatrixCoordinate(i + 1, j + 1));
                }
            }
        }
        this.matrixCoordinateList = matrixCoordinates;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    Set<MatrixCoordinate> getSaddlePoints() {

        return new HashSet<>(matrixCoordinateList);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
