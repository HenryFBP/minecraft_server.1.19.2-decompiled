import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class adk {
   public static void a(CommandDispatcher<dr> $$0) {
      LiteralCommandNode<dr> $$1 = $$0.register(
         (LiteralArgumentBuilder)ds.a("msg").then(ds.a("targets", eb.d()).then(ds.a("message", ef.a()).executes($$0x -> {
            ef.a $$1x = ef.b($$0x, "message");
   
            try {
               return a((dr)$$0x.getSource(), eb.f($$0x, "targets"), $$1x);
            } catch (Exception var3) {
               $$1x.a((dr)$$0x.getSource());
               throw var3;
            }
         })))
      );
      $$0.register((LiteralArgumentBuilder)ds.a("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)ds.a("w").redirect($$1));
   }

   private static int a(dr $$0, Collection<agh> $$1, ef.a $$2) {
      rm.a $$3 = rm.a(rm.e, $$0);
      $$2.a($$0, $$3x -> {
         sc $$4 = sc.a($$3x);
         boolean $$5 = $$3x.h();
         bbn $$6 = $$0.g();
         boolean $$7 = false;

         for(agh $$8 : $$1) {
            rm.a $$9 = rm.a(rm.f, $$0).c($$8.C_());
            $$0.a($$4, false, $$9);
            boolean $$10 = $$0.a($$8);
            $$8.a($$4, $$10, $$3);
            $$7 |= $$5 && $$10 && $$8 != $$6;
         }

         if ($$7) {
            $$0.a(aiz.f);
         }

         $$4.a($$0.m().ac());
      });
      return $$1.size();
   }
}
