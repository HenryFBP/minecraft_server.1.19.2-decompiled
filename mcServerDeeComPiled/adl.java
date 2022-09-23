import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class adl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("commands.op.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("op").requires($$0x -> $$0x.c(3))).then(ds.a("targets", ed.a()).suggests(($$0x, $$1) -> {
            aiz $$2 = ((dr)$$0x.getSource()).m().ac();
            return dt.b($$2.t().stream().filter($$1x -> !$$2.e($$1x.fy())).map($$0xx -> $$0xx.fy().getName()), $$1);
         }).executes($$0x -> a((dr)$$0x.getSource(), ed.a($$0x, "targets"))))
      );
   }

   private static int a(dr $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aiz $$2 = $$0.m().ac();
      int $$3 = 0;

      for(GameProfile $$4 : $$1) {
         if (!$$2.e($$4)) {
            $$2.a($$4);
            ++$$3;
            $$0.a(rq.a("commands.op.success", ((GameProfile)$$1.iterator().next()).getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
