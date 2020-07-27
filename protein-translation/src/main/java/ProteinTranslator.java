import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ProteinTranslator {
    private static final Map<String, Object> map = new HashMap<>();
    static {
        map.put("AUG", "Methionine");
        map.put("UUU", "Phenylalanine");
        map.put("UUC", "Phenylalanine");
        map.put("UUA", "Leucine");
        map.put("UUG", "Leucine");
        map.put("UCU", "Serine");
        map.put("UCC", "Serine");
        map.put("UCA", "Serine");
        map.put("UCG", "Serine");
        map.put("UAU", "Tyrosine");
        map.put("UAC", "Tyrosine");
        map.put("UGU" ,"Cysteine");
        map.put("UGC" ,"Cysteine");
        map.put("UGG", "Tryptophan");
        map.put("UAA", "STOP");
        map.put("UAG", "STOP");
        map.put("UGA", "STOP");

    }
    List<String> translate(String rnaSequence) {
        List<String> rnaList = new LinkedList<>();
        for (int i = 0; i < rnaSequence.length() / 3; i++) {
            String sub = rnaSequence.substring(i * 3, i * 3 + 3);
            if ("STOP".equals(map.get(sub))) {
                break;
            }
            rnaList.add(map.get(sub).toString());
        }
        return rnaList;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
