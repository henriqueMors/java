package hotel.model_entities;

import java.util.concurrent.TimeUnit;

public class Reserva {
    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
