import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private int score;
    private final static Map<String, Object> map = new HashMap();
    static {
        map.put("A", 1);
        map.put("E", 1);
        map.put("I", 1);
        map.put("O", 1);
        map.put("U", 1);
        map.put("L", 1);
        map.put("N", 1);
        map.put("R", 1);
        map.put("S", 1);
        map.put("T", 1);
        map.put("D", 2);
        map.put("G", 2);
        map.put("B", 3);
        map.put("C", 3);
        map.put("M", 3);
        map.put("P", 3);
        map.put("F", 4);
        map.put("H", 4);
        map.put("V", 4);
        map.put("W", 4);
        map.put("Y", 4);
        map.put("K", 5);
        map.put("J", 8);
        map.put("X", 8);
        map.put("Q", 10);
        map.put("Z", 10);
    }

    Scrabble(String word) {

        score = 0;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            score += Integer.parseInt(map.get(String.valueOf(c).toUpperCase()).toString());
        }
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getScore() {
        return score;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
