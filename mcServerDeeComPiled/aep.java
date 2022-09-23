import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aep {
   private static final sj a = sj.a.a(new rv(rv.a.a, rq.c("chat.type.team.hover"))).a(new ro(ro.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<dr> $$0) {
      LiteralCommandNode<dr> $$1 = $$0.register((LiteralArgumentBuilder)ds.a("teammsg").then(ds.a("message", ef.a()).executes($$0x -> {
         ef.a $$1x = ef.b($$0x, "message");

         try {
            return a((dr)$$0x.getSource(), $$1x);
         } catch (Exception var3) {
            $$1x.a((dr)$$0x.getSource());
            throw var3;
         }
      })));
      $$0.register((LiteralArgumentBuilder)ds.a("tm").redirect($$1));
   }

   private static int a(dr $$0, ef.a $$1) throws CommandSyntaxException {
      bbn $$2 = $$0.h();
      dxm $$3 = (dxm)$$2.bY();
      if ($$3 == null) {
         throw b.create();
      } else {
         rq $$4 = $$3.d().c(a);
         rm.a $$5 = rm.a(rm.g, $$0).c($$4);
         rm.a $$6 = rm.a(rm.h, $$0).c($$4);
         List<agh> $$7 = $$0.m().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.bY() == $$3).toList();
         $$1.a($$0, $$5x -> {
            sc $$6x = sc.a($$5x);
            boolean $$7x = $$5x.h();
            boolean $$8 = false;

            for(agh $$9 : $$7) {
               rm.a $$10 = $$9 == $$2 ? $$6 : $$5;
               boolean $$11 = $$0.a($$9);
               $$9.a($$6x, $$11, $$10);
               $$8 |= $$7x && $$11 && $$9 != $$2;
            }

            if ($$8) {
               $$0.a(aiz.f);
            }

            $$6x.a($$0.m().ac());
         });
         return $$7.size();
      }
   }
}
