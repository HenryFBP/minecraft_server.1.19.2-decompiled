import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Iterator;

public class adr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      RequiredArgumentBuilder<dr, abb> $$1 = ds.a("sound", eq.a()).suggests(gj.c);

      for(ajx $$2 : ajx.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<dr> a(ajx $$0) {
      return (LiteralArgumentBuilder<dr>)ds.a($$0.a())
         .then(
            ((RequiredArgumentBuilder)ds.a("targets", eb.d())
                  .executes($$1 -> a((dr)$$1.getSource(), eb.f($$1, "targets"), eq.e($$1, "sound"), $$0, ((dr)$$1.getSource()).e(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ds.a("pos", fo.a())
                        .executes($$1 -> a((dr)$$1.getSource(), eb.f($$1, "targets"), eq.e($$1, "sound"), $$0, fo.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ds.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (dr)$$1.getSource(),
                                       eb.f($$1, "targets"),
                                       eq.e($$1, "sound"),
                                       $$0,
                                       fo.a($$1, "pos"),
                                       $$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ds.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (dr)$$1.getSource(),
                                             eb.f($$1, "targets"),
                                             eq.e($$1, "sound"),
                                             $$0,
                                             fo.a($$1, "pos"),
                                             $$1.getArgument("volume", Float.class),
                                             $$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ds.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (dr)$$1.getSource(),
                                                eb.f($$1, "targets"),
                                                eq.e($$1, "sound"),
                                                $$0,
                                                fo.a($$1, "pos"),
                                                $$1.getArgument("volume", Float.class),
                                                $$1.getArgument("pitch", Float.class),
                                                $$1.getArgument("minVolume", Float.class)
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   private static int a(dr $$0, Collection<agh> $$1, abb $$2, ajx $$3, dwq $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      double $$8 = Math.pow($$5 > 1.0F ? (double)($$5 * 16.0F) : 16.0, 2.0);
      int $$9 = 0;
      long $$10 = $$0.f().r_().g();
      Iterator var13 = $$1.iterator();

      while(true) {
         agh $$11;
         dwq $$16;
         float $$17;
         while(true) {
            if (!var13.hasNext()) {
               if ($$9 == 0) {
                  throw a.create();
               }

               if ($$1.size() == 1) {
                  $$0.a(rq.a("commands.playsound.success.single", $$2, ((agh)$$1.iterator().next()).C_()), true);
               } else {
                  $$0.a(rq.a("commands.playsound.success.multiple", $$2, $$1.size()), true);
               }

               return $$9;
            }

            $$11 = (agh)var13.next();
            double $$12 = $$4.c - $$11.df();
            double $$13 = $$4.d - $$11.dh();
            double $$14 = $$4.e - $$11.dl();
            double $$15 = $$12 * $$12 + $$13 * $$13 + $$14 * $$14;
            $$16 = $$4;
            $$17 = $$5;
            if (!($$15 > $$8)) {
               break;
            }

            if (!($$7 <= 0.0F)) {
               double $$18 = Math.sqrt($$15);
               $$16 = new dwq($$11.df() + $$12 / $$18 * 2.0, $$11.dh() + $$13 / $$18 * 2.0, $$11.dl() + $$14 / $$18 * 2.0);
               $$17 = $$7;
               break;
            }
         }

         $$11.b.a(new ud($$2, $$3, $$16, $$17, $$6, $$10));
         ++$$9;
      }
   }
}
