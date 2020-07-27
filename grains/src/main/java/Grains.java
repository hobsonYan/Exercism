import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return new BigInteger("2").pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger bigInteger = new BigInteger("0");
        for (int i = 0; i < 64; i++) {
            bigInteger = bigInteger.add(grainsOnSquare(i + 1));
        }
        return bigInteger;
    }

}
