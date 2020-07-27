
public class Hamming {

    private String left;
    private String right;

    public Hamming(String leftStrand, String rightStrand) {
        this.left = leftStrand;
        this.right = rightStrand;

        if (leftStrand.length() == 0 && rightStrand.length() > 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (rightStrand.length() == 0 && leftStrand.length() > 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        char[] lefts = left.toCharArray();
        char[] rights = right.toCharArray();
        int distance = 0;
        for (int i = 0; i < lefts.length; i++) {
            if (lefts[i] != rights[i]) {
                distance ++ ;
            }
        }
        return distance;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
