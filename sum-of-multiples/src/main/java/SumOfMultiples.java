import java.util.LinkedList;
import java.util.List;

class SumOfMultiples {

    private int min;

    private int sum;

    private int number;

    private List<Integer> integerList;

    SumOfMultiples(int number, int[] set) {
        int min = 0;
        List<Integer> list = new LinkedList<>();
        for (int value : set) {
            if (min > value) {
                min = value;
            }
            if (number > value) {
                list.add(value);
            }
        }
        if (number < min) {
            sum = 0;
        }
        this.min = min;
        this.number = number;
        this.integerList = list;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getSum() {
        if (integerList.size() != 0) {
            List<Integer> numList = new LinkedList<>();
            for (int i = 1; i < number / (min + 1); i++) {
                for (Integer integer : integerList) {
                    int n = integer * i;
                    if (n < number && !numList.contains(n)) {
                        numList.add(n);
                    }
                }
            }
            sum = numList.stream().mapToInt(i -> i).sum();
        }
        return sum;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
