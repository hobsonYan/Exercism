import java.util.LinkedList;
import java.util.List;

class LuhnValidator {

    boolean isValid(String candidate) {
        String str = candidate.replaceAll(" ", "");
        char[] chars = str.toCharArray();
        List<String> stringList = new LinkedList<>();
        for (char c : chars) {
            if (c < '0' || c > '9') {
                return false;
            }
            stringList.add(String.valueOf(c));
        }
        if (stringList.size() <= 1) {
            return false;
        }
        for (int i = stringList.size() - 2; i > -1; i = i - 2) {
            int num = Integer.parseInt(stringList.get(i));
            stringList.set(i, String.valueOf(num * 2 > 9 ? num * 2 - 9 : num * 2));
        }
        int sum = stringList.stream().mapToInt(Integer::parseInt).sum();
        return sum % 10 == 0;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}