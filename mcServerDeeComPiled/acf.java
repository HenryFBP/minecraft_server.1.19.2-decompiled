import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class acf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("commands.ban.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ds.a("targets", ed.a()).executes($$0x -> a((dr)$$0x.getSource(), ed.a($$0x, "targets"), null)))
                  .then(ds.a("reason", ef.a()).executes($$0x -> a((dr)$$0x.getSource(), ed.a($$0x, "targets"), ef.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dr $$0, Collection<GameProfile> $$1, @Nullable rq $$2) throws CommandSyntaxException {
      ajf $$3 = $$0.m().ac().f();
      int $$4 = 0;

      for(GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            ajg $$6 = new ajg($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            ++$$4;
            $$0.a(rq.a("commands.ban.success", rs.a($$5), $$6.d()), true);
            agh $$7 = $$0.m().ac().a($$5.getId());
            if ($$7 != null) {
               $$7.b.b(rq.c("multiplayer.disconnect.banned"));
            }
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         return $$4;
      }
   }
}
