import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class afb {
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(rq.c("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> rq.a("commands.data.get.invalid", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> rq.a("commands.data.get.unknown", $$0));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(rq.c("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> rq.a("commands.data.modify.expected_list", $$0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> rq.a("commands.data.modify.expected_object", $$0));
   private static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> rq.a("commands.data.modify.invalid_index", $$0));
   public static final List<Function<String, afb.c>> a = ImmutableList.of(afc.a, aez.a, afd.a);
   public static final List<afb.c> b = (List<afb.c>)a.stream().map($$0 -> (afb.c)$$0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<afb.c> c = (List<afb.c>)a.stream().map($$0 -> (afb.c)$$0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void a(CommandDispatcher<dr> $$0) {
      LiteralArgumentBuilder<dr> $$1 = (LiteralArgumentBuilder)ds.a("data").requires($$0x -> $$0x.c(2));

      for(afb.c $$2 : b) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                     $$2.a(ds.a("merge"), $$1x -> $$1x.then(ds.a("nbt", dy.a()).executes($$1xx -> a((dr)$$1xx.getSource(), $$2.a($$1xx), dy.a($$1xx, "nbt")))))
                  ))
                  .then(
                     $$2.a(
                        ds.a("get"),
                        $$1x -> $$1x.executes($$1xx -> a((dr)$$1xx.getSource(), $$2.a($$1xx)))
                              .then(
                                 ((RequiredArgumentBuilder)ds.a("path", eh.a()).executes($$1xx -> b((dr)$$1xx.getSource(), $$2.a($$1xx), eh.a($$1xx, "path"))))
                                    .then(
                                       ds.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$1xx -> a((dr)$$1xx.getSource(), $$2.a($$1xx), eh.a($$1xx, "path"), DoubleArgumentType.getDouble($$1xx, "scale"))
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  $$2.a(ds.a("remove"), $$1x -> $$1x.then(ds.a("path", eh.a()).executes($$1xx -> a((dr)$$1xx.getSource(), $$2.a($$1xx), eh.a($$1xx, "path")))))
               ))
            .then(
               a(
                  (BiConsumer<ArgumentBuilder<dr, ?>, afb.b>)(($$0x, $$1x) -> $$0x.then(
                           ds.a("insert").then(ds.a("index", IntegerArgumentType.integer()).then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                              int $$4 = IntegerArgumentType.getInteger($$0xx, "index");
                              return a($$4, $$1xx, $$2x, $$3);
                           })))
                        )
                        .then(ds.a("prepend").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> a(0, $$1xx, $$2x, $$3))))
                        .then(ds.a("append").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> a(-1, $$1xx, $$2x, $$3))))
                        .then(ds.a("set").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> $$2x.b($$1xx, ((qc)Iterables.getLast($$3))::c))))
                        .then(ds.a("merge").then($$1x.create(($$0xx, $$1xx, $$2x, $$3) -> {
                           Collection<qc> $$4 = $$2x.a($$1xx, pj::new);
                           int $$5 = 0;
            
                           for(qc $$6 : $$4) {
                              if (!($$6 instanceof pj)) {
                                 throw i.create($$6);
                              }
            
                              pj $$7 = (pj)$$6;
                              pj $$8 = $$7.g();
            
                              for(qc $$9 : $$3) {
                                 if (!($$9 instanceof pj)) {
                                    throw i.create($$9);
                                 }
            
                                 $$7.a((pj)$$9);
                              }
            
                              $$5 += $$8.equals($$7) ? 0 : 1;
                           }
            
                           return $$5;
                        }))))
               )
            );
      }

      $$0.register($$1);
   }

   private static int a(int $$0, pj $$1, eh.g $$2, List<qc> $$3) throws CommandSyntaxException {
      Collection<qc> $$4 = $$2.a($$1, pp::new);
      int $$5 = 0;

      for(qc $$6 : $$4) {
         if (!($$6 instanceof pi)) {
            throw h.create($$6);
         }

         boolean $$7 = false;
         pi<?> $$8 = (pi)$$6;
         int $$9 = $$0 < 0 ? $$8.size() + $$0 + 1 : $$0;

         for(qc $$10 : $$3) {
            try {
               if ($$8.b($$9, $$10.c())) {
                  ++$$9;
                  $$7 = true;
               }
            } catch (IndexOutOfBoundsException var14) {
               throw j.create($$9);
            }
         }

         $$5 += $$7 ? 1 : 0;
      }

      return $$5;
   }

   private static ArgumentBuilder<dr, ?> a(BiConsumer<ArgumentBuilder<dr, ?>, afb.b> $$0) {
      LiteralArgumentBuilder<dr> $$1 = ds.a("modify");

      for(afb.c $$2 : b) {
         $$2.a($$1, $$2x -> {
            ArgumentBuilder<dr, ?> $$3 = ds.a("targetPath", eh.a());

            for(afb.c $$4 : c) {
               $$0.accept($$3, (afb.b)$$2xx -> $$4.a(ds.a("from"), $$3x -> $$3x.executes($$3xx -> {
                        List<qc> $$4x = Collections.singletonList($$4.a($$3xx).a());
                        return a($$3xx, $$2, $$2xx, $$4x);
                     }).then(ds.a("sourcePath", eh.a()).executes($$3xx -> {
                        afa $$4x = $$4.a($$3xx);
                        eh.g $$5 = eh.a($$3xx, "sourcePath");
                        List<qc> $$6 = $$5.a($$4x.a());
                        return a($$3xx, $$2, $$2xx, $$6);
                     }))));
            }

            $$0.accept($$3, (afb.b)$$1xx -> ds.a("value").then(ds.a("value", ei.a()).executes($$2xx -> {
                  List<qc> $$3x = Collections.singletonList(ei.a($$2xx, "value"));
                  return a($$2xx, $$2, $$1xx, $$3x);
               })));
            return $$2x.then($$3);
         });
      }

      return $$1;
   }

   private static int a(CommandContext<dr> $$0, afb.c $$1, afb.a $$2, List<qc> $$3) throws CommandSyntaxException {
      afa $$4 = $$1.a($$0);
      eh.g $$5 = eh.a($$0, "targetPath");
      pj $$6 = $$4.a();
      int $$7 = $$2.modify($$0, $$6, $$5, $$3);
      if ($$7 == 0) {
         throw d.create();
      } else {
         $$4.a($$6);
         ((dr)$$0.getSource()).a($$4.b(), true);
         return $$7;
      }
   }

   private static int a(dr $$0, afa $$1, eh.g $$2) throws CommandSyntaxException {
      pj $$3 = $$1.a();
      int $$4 = $$2.c($$3);
      if ($$4 == 0) {
         throw d.create();
      } else {
         $$1.a($$3);
         $$0.a($$1.b(), true);
         return $$4;
      }
   }

   private static qc a(eh.g $$0, afa $$1) throws CommandSyntaxException {
      Collection<qc> $$2 = $$0.a($$1.a());
      Iterator<qc> $$3 = $$2.iterator();
      qc $$4 = (qc)$$3.next();
      if ($$3.hasNext()) {
         throw g.create();
      } else {
         return $$4;
      }
   }

   private static int b(dr $$0, afa $$1, eh.g $$2) throws CommandSyntaxException {
      qc $$3 = a($$2, $$1);
      int $$4;
      if ($$3 instanceof pw) {
         $$4 = ami.b(((pw)$$3).i());
      } else if ($$3 instanceof pi) {
         $$4 = ((pi)$$3).size();
      } else if ($$3 instanceof pj) {
         $$4 = ((pj)$$3).e();
      } else {
         if (!($$3 instanceof qa)) {
            throw f.create($$2.toString());
         }

         $$4 = $$3.e_().length();
      }

      $$0.a($$1.a($$3), false);
      return $$4;
   }

   private static int a(dr $$0, afa $$1, eh.g $$2, double $$3) throws CommandSyntaxException {
      qc $$4 = a($$2, $$1);
      if (!($$4 instanceof pw)) {
         throw e.create($$2.toString());
      } else {
         int $$5 = ami.b(((pw)$$4).i() * $$3);
         $$0.a($$1.a($$2, $$3, $$5), false);
         return $$5;
      }
   }

   private static int a(dr $$0, afa $$1) throws CommandSyntaxException {
      $$0.a($$1.a((qc)$$1.a()), false);
      return 1;
   }

   private static int a(dr $$0, afa $$1, pj $$2) throws CommandSyntaxException {
      pj $$3 = $$1.a();
      pj $$4 = $$3.g().a($$2);
      if ($$3.equals($$4)) {
         throw d.create();
      } else {
         $$1.a($$4);
         $$0.a($$1.b(), true);
         return 1;
      }
   }

   interface a {
      int modify(CommandContext<dr> var1, pj var2, eh.g var3, List<qc> var4) throws CommandSyntaxException;
   }

   interface b {
      ArgumentBuilder<dr, ?> create(afb.a var1);
   }

   public interface c {
      afa a(CommandContext<dr> var1) throws CommandSyntaxException;

      ArgumentBuilder<dr, ?> a(ArgumentBuilder<dr, ?> var1, Function<ArgumentBuilder<dr, ?>, ArgumentBuilder<dr, ?>> var2);
   }
}
