class Darts {

    private double distance;

    Darts(double x, double y) {
        distance = Math.sqrt(x * x + y * y);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int score() {
        if (distance <= 1) {
            return 10;
        }
        if (distance > 1 && distance <= 5) {
            return 5;
        }
        if (distance > 5 && distance <= 10) {
            return 1;
        }
        return 0;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
