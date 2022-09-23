import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record axs(Duration a, cge b, afx c, cxn d, String e) implements aya {
   public static axs a(RecordedEvent $$0) {
      return new axs(
         $$0.getDuration(),
         new cge($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")),
         new afx($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")),
         cxn.a($$0.getString("status")),
         $$0.getString("level")
      );
   }
}
