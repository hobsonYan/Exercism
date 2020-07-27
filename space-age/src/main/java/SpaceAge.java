import java.math.BigDecimal;

class SpaceAge {

    private double ageOnEarth;
    private double sec;

    SpaceAge(double seconds) {
        sec = seconds;
        ageOnEarth = seconds / 31557600;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double getSeconds() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onEarth() {
        return sec / 31557600;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onMercury() {
        return sec / (31557600 * 0.2408467);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onVenus() {
        return sec / (31557600 * 0.61519726);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onMars() {
        return sec / (31557600 * 1.8808158);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onJupiter() {
        return sec / (31557600 * 11.862615) ;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onSaturn() {
        return sec / (31557600 * 29.447498);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onUranus() {
        return sec / (31557600 * 84.016846);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onNeptune() {
        return sec / (31557600 * 164.79132);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
