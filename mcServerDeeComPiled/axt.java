import jdk.jfr.consumer.RecordedEvent;

public record axt(double a, double b, double c) {
   public static axt a(RecordedEvent $$0) {
      return new axt((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
