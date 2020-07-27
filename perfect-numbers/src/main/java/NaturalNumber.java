import java.util.LinkedList;
import java.util.List;

class NaturalNumber {

    private int num;

    public NaturalNumber(int num) {

        if (num < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.num = num;
    }

    public Classification getClassification() {
        List<Integer> integers = new LinkedList<>();
        for (int i = 1; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                integers.add(i);
            }
        }
        int sum = 0;
        sum = integers.stream().mapToInt(i -> i).sum();
        if (sum == num) {
            return Classification.PERFECT;
        }
        if (sum > num) {
            return Classification.ABUNDANT;
        }
        return Classification.DEFICIENT;
    }
}
