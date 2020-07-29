import java.math.BigDecimal;

class Triangle {

    private BigDecimal side1;
    private BigDecimal side2;
    private BigDecimal side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = BigDecimal.valueOf(side1);
        this.side2 = BigDecimal.valueOf(side2);
        this.side3 = BigDecimal.valueOf(side3);
        if (side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2
                || side1 == 0 || side2 == 0 || side3 == 0) {
            throw new TriangleException();
        }
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isEquilateral() {
        return side1.compareTo(side2) == 0 && side2.compareTo(side3) == 0;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isIsosceles() {
        return side1.compareTo(side2) == 0 || side2.compareTo(side3) == 0 || side3.compareTo(side1) == 0;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isScalene() {
        return side1.compareTo(side2) != 0 && side2.compareTo(side3) != 0 && side3.compareTo(side1) != 0;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
