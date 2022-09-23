import com.mojang.brigadier.context.CommandContext;

public class ey extends ew<coh> {
   private ey() {
      super(coh.d, coh::values);
   }

   public static ew<coh> a() {
      return new ey();
   }

   public static coh a(CommandContext<dr> $$0, String $$1) {
      return (coh)$$0.getArgument($$1, coh.class);
   }
}
