import java.util.LinkedList;
import java.util.List;

class Sieve {

    private List<Integer> primeList;

    Sieve(int maxPrime) {
        List<Integer> integerList = new LinkedList<>();
        for (int i = 2; i < maxPrime + 1; i++) {
            if (!integerList.contains(i)) {
                for (int j = 2; j < maxPrime; j++) {
                    if (i * j > maxPrime) {
                        break;
                    }
                    if (!integerList.contains(i * j)) {
                        integerList.add(i * j);
                    }
                }
            }
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 2; i < maxPrime + 1; i++) {
            if (!integerList.contains(i)) {
                list.add(i);
            }
        }
        this.primeList = list;
//        throw new UnsupportedOperationException("Delete this statement and provide your own implementation.");
    }

    List<Integer> getPrimes() {
        return primeList;
//        throw new UnsupportedOperationException("Delete this statement and provide your own implementation.");
    }
}
