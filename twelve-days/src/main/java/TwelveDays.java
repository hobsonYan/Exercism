import java.util.HashMap;
import java.util.Map;

class TwelveDays {

    private final static Map<String, Object> MAP = new HashMap<>();
    static {
        MAP.put("1", "a Partridge in a Pear Tree.");
        MAP.put("2", "two Turtle Doves, ");
        MAP.put("3", "three French Hens, ");
        MAP.put("4", "four Calling Birds, ");
        MAP.put("5", "five Gold Rings, ");
        MAP.put("6", "six Geese-a-Laying, ");
        MAP.put("7", "seven Swans-a-Swimming, ");
        MAP.put("8", "eight Maids-a-Milking, ");
        MAP.put("9", "nine Ladies Dancing, ");
        MAP.put("10", "ten Lords-a-Leaping, ");
        MAP.put("11", "eleven Pipers Piping, ");
        MAP.put("12", "twelve Drummers Drumming, ");
    }

    private final static Map<String, Object> DAY = new HashMap<>();
    static {
        DAY.put("1", "first");
        DAY.put("2", "second");
        DAY.put("3", "third");
        DAY.put("4", "fourth");
        DAY.put("5", "fifth");
        DAY.put("6", "sixth");
        DAY.put("7", "seventh");
        DAY.put("8", "eighth");
        DAY.put("9", "ninth");
        DAY.put("10", "tenth");
        DAY.put("11", "eleventh");
        DAY.put("12", "twelfth");
    }

    String verse(int verseNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("On the ").append(DAY.get(String.valueOf(verseNumber))).append(" day of Christmas my true love gave to me: ");
        for (int i = verseNumber; i > 0; i--) {
            if (i == 1 && verseNumber > 1) {
                stringBuilder.append("and ");
            }
            stringBuilder.append(MAP.get(String.valueOf(i)));
        }
        return stringBuilder.append("\n").toString();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = startVerse; i < endVerse + 1; i++) {
            stringBuilder.append("On the ").append(DAY.get(String.valueOf(i))).append(" day of Christmas my true love gave to me: ");
            for (int j = i; j > 0; j--) {
                if (j == 1 && i > 1) {
                    stringBuilder.append("and ");
                }
                stringBuilder.append(MAP.get(String.valueOf(j)));
            }
            if (i != endVerse) {
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
    
    String sing() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 13; i++) {
            stringBuilder.append(verse(i));
            if (i != 12) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
