import java.util.LinkedList;
import java.util.List;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        char[] chars = phrase.toLowerCase().toCharArray();
        List<String> stringList = new LinkedList<>();
        boolean isIsogram = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                if (!stringList.contains(String.valueOf(chars[i]))) {
                    stringList.add(String.valueOf(chars[i]));
                } else {
                    isIsogram = false;
                }
            }
        }
        return isIsogram;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
