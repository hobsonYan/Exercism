import java.util.HashMap;
import java.util.Map;

class RotationalCipher {

    private Map<String, Object> modifyMap;
    private final static Map<String, Object> map = new HashMap<>();
    static {
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");
        map.put("8", "h");
        map.put("9", "i");
        map.put("10", "j");
        map.put("11", "k");
        map.put("12", "l");
        map.put("13", "m");
        map.put("14", "n");
        map.put("15", "o");
        map.put("16", "p");
        map.put("17", "q");
        map.put("18", "r");
        map.put("19", "s");
        map.put("20", "t");
        map.put("21", "u");
        map.put("22", "v");
        map.put("23", "w");
        map.put("24", "x");
        map.put("25", "y");
        map.put("26", "z");
    }
    RotationalCipher(int shiftKey) {
        Map<String, Object> m = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            m.put(map.get(String.valueOf(i)).toString(),
                    map.get(String.valueOf(((i + shiftKey > 26 ? i + shiftKey - 26 : i + shiftKey)))));
        }
        this.modifyMap = m;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String rotate(String data) {
        StringBuilder result = new StringBuilder();
        char[] chars = data.toCharArray();
        for (char aChar : chars) {
            if (aChar >= 'A' && aChar <= 'Z') {
                result.append(String.valueOf(modifyMap.get(String.valueOf(aChar).toLowerCase())).toUpperCase());
            } else if (aChar >= 'a' && aChar <= 'z') {
                result.append(modifyMap.get(String.valueOf(aChar)));
            } else {
                result.append(aChar);
            }
        }
        return result.toString();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
