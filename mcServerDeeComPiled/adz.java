import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class adz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("commands.save.alreadyOn"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("save-on").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         dr $$1 = (dr)$$0x.getSource();
         boolean $$2 = false;

         for(agg $$3 : $$1.m().E()) {
            if ($$3 != null && $$3.b) {
               $$3.b = false;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(rq.c("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
