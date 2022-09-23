import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class acd {
   public static final Pattern a = Pattern.compile(
      "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
   );
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(rq.c("commands.banip.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ds.a("target", StringArgumentType.word())
                     .executes($$0x -> a((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ds.a("reason", ef.a()).executes($$0x -> a((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), ef.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dr $$0, String $$1, @Nullable rq $$2) throws CommandSyntaxException {
      Matcher $$3 = a.matcher($$1);
      if ($$3.matches()) {
         return b($$0, $$1, $$2);
      } else {
         agh $$4 = $$0.m().ac().a($$1);
         if ($$4 != null) {
            return b($$0, $$4.y(), $$2);
         } else {
            throw b.create();
         }
      }
   }

   private static int b(dr $$0, String $$1, @Nullable rq $$2) throws CommandSyntaxException {
      aiw $$3 = $$0.m().ac().g();
      if ($$3.a($$1)) {
         throw c.create();
      } else {
         List<agh> $$4 = $$0.m().ac().b($$1);
         aix $$5 = new aix($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(rq.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(rq.a("commands.banip.info", $$4.size(), fz.a($$4)), true);
         }

         for(agh $$6 : $$4) {
            $$6.b.b(rq.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
