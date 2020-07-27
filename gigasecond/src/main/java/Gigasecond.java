import java.math.BigInteger;
import java.time.*;

public class Gigasecond {

    private long giga;

    public Gigasecond(LocalDate moment) {
        giga = moment.atStartOfDay(ZoneOffset.ofHours(8)).toLocalDateTime().toEpochSecond(ZoneOffset.of("+8"))
                + (new BigInteger("10").pow(9)).longValue();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Gigasecond(LocalDateTime moment) {
        giga = moment.toEpochSecond(ZoneOffset.of("+8")) + (new BigInteger("10").pow(9)).longValue();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(giga), ZoneId.systemDefault());
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
