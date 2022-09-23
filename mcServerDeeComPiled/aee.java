import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aee {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ds.a("pos", fh.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("block", fe.a($$1))
                                 .executes($$0x -> a((dr)$$0x.getSource(), fh.a($$0x, "pos"), fe.a($$0x, "block"), aee.b.a, null)))
                              .then(ds.a("destroy").executes($$0x -> a((dr)$$0x.getSource(), fh.a($$0x, "pos"), fe.a($$0x, "block"), aee.b.b, null))))
                           .then(
                              ds.a("keep")
                                 .executes($$0x -> a((dr)$$0x.getSource(), fh.a($$0x, "pos"), fe.a($$0x, "block"), aee.b.a, $$0xx -> $$0xx.c().x($$0xx.d())))
                           ))
                        .then(ds.a("replace").executes($$0x -> a((dr)$$0x.getSource(), fh.a($$0x, "pos"), fe.a($$0x, "block"), aee.b.a, null)))
                  )
            )
      );
   }

   private static int a(dr $$0, gt $$1, fc $$2, aee.b $$3, @Nullable Predicate<cvs> $$4) throws CommandSyntaxException {
      agg $$5 = $$0.f();
      if ($$4 != null && !$$4.test(new cvs($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aee.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().h() || !$$5.a_($$1).h();
         } else {
            cti $$7 = $$5.c_($$1);
            baa.a($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(rq.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fc filter(dkt var1, gt var2, fc var3, agg var4);
   }

   public static enum b {
      a,
      b;
   }
}
