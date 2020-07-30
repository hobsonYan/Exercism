class CollatzCalculator {

    int computeStepCount(int start) {
        if (start < 1) {
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }
        int i = 0;
        while (1 != start) {
            if (start % 2 == 0) {
                start = start / 2;
            } else {
                start = start * 3 + 1;
            }
            i++;

        }
        return i;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
