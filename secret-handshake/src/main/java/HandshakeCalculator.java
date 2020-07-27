import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signalList = new LinkedList<>();
        String num = Integer.toBinaryString(number);
        char[] chars = num.toCharArray();
        int j = 1;
        for (int i = chars.length - 1; i > -1; i-- ) {
            if ("1".equals(String.valueOf(chars[i]))) {
                switch (j) {
                    case 1:
                        signalList.add(Signal.WINK);
                        break;
                    case 2:
                        signalList.add(Signal.DOUBLE_BLINK);
                        break;
                    case 3:
                        signalList.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    case 4:
                        signalList.add(Signal.JUMP);
                        break;
                    case 5:
                        Collections.reverse(signalList);
                        break;
                }
            }
            j++ ;
        }
        return signalList;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
