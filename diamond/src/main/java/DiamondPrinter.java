import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class DiamondPrinter {

    private final static char[] CHARS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
    'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private final static Map<String, Object> MAP = new HashMap<>();
    static {
        MAP.put("A", 1);
        MAP.put("B", 2);
        MAP.put("C", 3);
        MAP.put("D", 4);
        MAP.put("E", 5);
        MAP.put("F", 6);
        MAP.put("G", 7);
        MAP.put("H", 8);
        MAP.put("I", 9);
        MAP.put("J", 10);
        MAP.put("K", 11);
        MAP.put("L", 12);
        MAP.put("M", 13);
        MAP.put("N", 14);
        MAP.put("O", 15);
        MAP.put("P", 16);
        MAP.put("Q", 17);
        MAP.put("R", 18);
        MAP.put("S", 19);
        MAP.put("T", 20);
        MAP.put("U", 21);
        MAP.put("V", 22);
        MAP.put("W", 23);
        MAP.put("X", 24);
        MAP.put("Y", 25);
        MAP.put("Z", 26);
    }
    List<String> printToList(char a) {
        int index = Integer.parseInt(String.valueOf(MAP.get(String.valueOf(a))));
        List<String> stringList = new LinkedList<>();
        for (int i = 0; i < index; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < index - i - 1; j++) {
                s.append(" ");
            }
            s.append(CHARS[i]);
            while (s.length() < index) {
                s.append(" ");
            }
            stringList.add(s.toString());
        }
        List<String> strings = new LinkedList<>();
        for (int i = 0; i < index; i++) {
            String str = stringList.get(i).substring(0, index - 1);
            strings.add(stringList.get(i) + new StringBuilder(str).reverse().toString());
        }
        for (int i = strings.size() - 2; i > -1; i--) {
            strings.add(strings.get(i));
        }
        return strings;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
