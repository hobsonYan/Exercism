import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    public boolean isPangram(String input) {

        char[] chars = input.toLowerCase().toCharArray();
        Map<String, String> map = new HashMap<>();
        for (char aChar : chars) {
            if (aChar < 'a' || aChar > 'z') {
                continue;
            }
            if (!map.containsKey(String.valueOf(aChar))) {
                map.put(String.valueOf(aChar), "1");
            }
        }
        return map.size() == 26;

//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
