class Leap {

    boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0 ) {
            return true;
        }
        return false;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
