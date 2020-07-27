import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
    int value(String[] colors) {
        Map<String, String> map = new HashMap<>();
        map.put("black", "0");
        map.put("brown", "1");
        map.put("red", "2");
        map.put("orange", "3");
        map.put("yellow", "4");
        map.put("green", "5");
        map.put("blue", "6");
        map.put("violet", "7");
        map.put("grey", "8");
        map.put("white", "9");
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < 2; i ++) {
            num.append(map.get(colors[i]));
        }
        return Integer.parseInt(num.toString());
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
