import java.util.LinkedList;
import java.util.List;

class Yacht {

    private List<Integer> integers;
    private YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        List<Integer> list = new LinkedList<>();
        for (int die : dice) {
            list.add(die);
        }
        this.yachtCategory = yachtCategory;
        this.integers = list;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int score() {
        int score = 0;
        switch (yachtCategory) {
            case ONES:
                score = (int) integers.stream().filter(i -> i == 1).count() * 1;
                break;
            case TWOS:
                score = (int) integers.stream().filter(i -> i == 2).count() * 2;
                break;
            case THREES:
                score = (int) integers.stream().filter(i -> i == 3).count() * 3;
                break;
            case FOURS:
                score = (int) integers.stream().filter(i -> i == 4).count() * 4;
                break;
            case FIVES:
                score = (int) integers.stream().filter(i -> i == 5).count() * 5;
                break;
            case SIXES:
                score = (int) integers.stream().filter(i -> i == 6).count() * 6;
                break;
            case FULL_HOUSE:
                if (integers.stream().distinct().count() <= 3) {
                    for (int i = 0; i < integers.size(); i++) {
                        int finalI = i;
                        if (integers.stream().filter(j -> j.equals(integers.get(finalI))).count() == 3) {
                            score = integers.stream().mapToInt(integer -> integer).sum();
                            break;
                        }
                    }

                }
                break;
            case FOUR_OF_A_KIND:
                if (integers.stream().distinct().count() < 3) {

                    int same = integers.get(0);
                    for (int i = 1; i < integers.size(); i++) {
                        if (same == integers.get(i)) {
                            if (integers.stream().filter(integer -> integer.equals(same)).count() >= 4) {
                                score = same * 4;
                                break;
                            }
                        }
                    }

                }
                break;
            case LITTLE_STRAIGHT:
                if (integers.contains(1) && integers.contains(2) && integers.contains(3) && integers.contains(4) && integers.contains(5)) {
                    score = 30;
                }
                break;
            case BIG_STRAIGHT:
                if (integers.contains(6) && integers.contains(2) && integers.contains(3) && integers.contains(4) && integers.contains(5)) {
                    score = 30;
                }
                break;
            case CHOICE:
                score = integers.stream().mapToInt(i -> i).sum();
                break;
            case YACHT:
                if (integers.stream().distinct().count() == 1) {
                    score = 50;
                }
                break;
        }
        return score;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
