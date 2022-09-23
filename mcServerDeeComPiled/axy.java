import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record axy(Instant a, Duration b) {
   public static axy a(RecordedEvent $$0) {
      return new axy($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
   }
}
