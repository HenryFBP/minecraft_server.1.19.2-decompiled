import com.google.common.collect.ImmutableMap;

public class bgp extends bdo<bcc> {
   public bgp() {
      super(ImmutableMap.of());
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      $$1.dy().a($$0.V(), $$0.U());
   }
}
