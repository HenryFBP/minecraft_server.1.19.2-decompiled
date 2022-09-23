import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class dn extends RuntimeException {
   private final rq a;

   public dn(rq $$0) {
      super($$0.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.a = $$0;
   }

   public rq a() {
      return this.a;
   }
}
