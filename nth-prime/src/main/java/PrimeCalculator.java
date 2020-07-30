class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1) {
            throw new IllegalArgumentException();
        }
        int count = 0;
        int prime = 0;
        for (int i = 2; ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count ++;
            }
            if (count == nth) {
                prime = i;
                break;
            }
        }
        return prime;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
