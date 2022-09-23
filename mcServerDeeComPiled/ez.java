import com.mojang.brigadier.context.CommandContext;

public class ez extends ew<cpw> {
   private ez() {
      super(cpw.e, cpw::values);
   }

   public static ez a() {
      return new ez();
   }

   public static cpw a(CommandContext<dr> $$0, String $$1) {
      return (cpw)$$0.getArgument($$1, cpw.class);
   }
}
