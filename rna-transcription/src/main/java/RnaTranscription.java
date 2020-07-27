import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<String, String> map = new HashMap<>();
        map.put("G", "C");
        map.put("C", "G");
        map.put("T","A");
        map.put("A","U");
        if (dnaStrand.length() > 0) {
            char[] chars = dnaStrand.toCharArray();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < chars.length; i ++) {
                result.append(map.get(String.valueOf(chars[i])));
            }
            return result.toString();
        } else {
            return dnaStrand;
        }
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
