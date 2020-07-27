

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 1; i< input + 1; i++) {
            sum += i;
        }
        return sum * sum;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 1; i < input + 1; i++) {
            sum += i*i;
        }
        return sum;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
