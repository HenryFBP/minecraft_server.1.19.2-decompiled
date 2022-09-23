import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class gb {
   private static final Map<String, gb.b> i = Maps.newHashMap();
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> rq.a("argument.entity.options.unknown", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> rq.a("argument.entity.options.inapplicable", $$0));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(rq.c("argument.entity.options.distance.negative"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(rq.c("argument.entity.options.level.negative"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(rq.c("argument.entity.options.limit.toosmall"));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> rq.a("argument.entity.options.sort.irreversible", $$0));
   public static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> rq.a("argument.entity.options.mode.invalid", $$0));
   public static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> rq.a("argument.entity.options.type.invalid", $$0));

   private static void a(String $$0, gb.a $$1, Predicate<ga> $$2, rq $$3) {
      i.put($$0, new gb.b($$1, $$2, $$3));
   }

   public static void a() {
      if (i.isEmpty()) {
         a("name", $$0 -> {
            int $$1 = $$0.g().getCursor();
            boolean $$2 = $$0.e();
            String $$3 = $$0.g().readString();
            if ($$0.w() && !$$2) {
               $$0.g().setCursor($$1);
               throw b.createWithContext($$0.g(), "name");
            } else {
               if ($$2) {
                  $$0.c(true);
               } else {
                  $$0.b(true);
               }

               $$0.a((Predicate<bbn>)($$2x -> $$2x.X().getString().equals($$3) != $$2));
            }
         }, $$0 -> !$$0.v(), rq.c("argument.entity.options.name.description"));
         a("distance", $$0 -> {
            int $$1 = $$0.g().getCursor();
            cj.c $$2 = cj.c.a($$0.g());
            if (($$2.a() == null || !($$2.a() < 0.0)) && ($$2.b() == null || !($$2.b() < 0.0))) {
               $$0.a($$2);
               $$0.h();
            } else {
               $$0.g().setCursor($$1);
               throw c.createWithContext($$0.g());
            }
         }, $$0 -> $$0.i().c(), rq.c("argument.entity.options.distance.description"));
         a("level", $$0 -> {
            int $$1 = $$0.g().getCursor();
            cj.d $$2 = cj.d.a($$0.g());
            if (($$2.a() == null || $$2.a() >= 0) && ($$2.b() == null || $$2.b() >= 0)) {
               $$0.a($$2);
               $$0.a(false);
            } else {
               $$0.g().setCursor($$1);
               throw d.createWithContext($$0.g());
            }
         }, $$0 -> $$0.j().c(), rq.c("argument.entity.options.level.description"));
         a("x", $$0 -> {
            $$0.h();
            $$0.a($$0.g().readDouble());
         }, $$0 -> $$0.m() == null, rq.c("argument.entity.options.x.description"));
         a("y", $$0 -> {
            $$0.h();
            $$0.b($$0.g().readDouble());
         }, $$0 -> $$0.n() == null, rq.c("argument.entity.options.y.description"));
         a("z", $$0 -> {
            $$0.h();
            $$0.c($$0.g().readDouble());
         }, $$0 -> $$0.o() == null, rq.c("argument.entity.options.z.description"));
         a("dx", $$0 -> {
            $$0.h();
            $$0.d($$0.g().readDouble());
         }, $$0 -> $$0.p() == null, rq.c("argument.entity.options.dx.description"));
         a("dy", $$0 -> {
            $$0.h();
            $$0.e($$0.g().readDouble());
         }, $$0 -> $$0.q() == null, rq.c("argument.entity.options.dy.description"));
         a("dz", $$0 -> {
            $$0.h();
            $$0.f($$0.g().readDouble());
         }, $$0 -> $$0.r() == null, rq.c("argument.entity.options.dz.description"));
         a("x_rotation", $$0 -> $$0.a(dh.a($$0.g(), true, ami::g)), $$0 -> $$0.k() == dh.a, rq.c("argument.entity.options.x_rotation.description"));
         a("y_rotation", $$0 -> $$0.b(dh.a($$0.g(), true, ami::g)), $$0 -> $$0.l() == dh.a, rq.c("argument.entity.options.y_rotation.description"));
         a("limit", $$0 -> {
            int $$1 = $$0.g().getCursor();
            int $$2 = $$0.g().readInt();
            if ($$2 < 1) {
               $$0.g().setCursor($$1);
               throw e.createWithContext($$0.g());
            } else {
               $$0.a($$2);
               $$0.d(true);
            }
         }, $$0 -> !$$0.u() && !$$0.x(), rq.c("argument.entity.options.limit.description"));
         a(
            "sort",
            $$0 -> {
               int $$1 = $$0.g().getCursor();
               String $$2 = $$0.g().readUnquotedString();
               $$0.a(
                  (BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>>)(($$0x, $$1x) -> dt.b(
                        Arrays.asList("nearest", "furthest", "random", "arbitrary"), $$0x
                     ))
               );
               BiConsumer<dwq, List<? extends bbn>> $$3;
               switch($$2) {
                  case "nearest":
                     $$3 = ga.l;
                     break;
                  case "furthest":
                     $$3 = ga.m;
                     break;
                  case "random":
                     $$3 = ga.n;
                     break;
                  case "arbitrary":
                     $$3 = ga.k;
                     break;
                  default:
                     $$0.g().setCursor($$1);
                     throw f.createWithContext($$0.g(), $$2);
               }
   
               $$0.a($$3);
               $$0.e(true);
            },
            $$0 -> !$$0.u() && !$$0.y(),
            rq.c("argument.entity.options.sort.description")
         );
         a("gamemode", $$0 -> {
            $$0.a((BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>>)(($$1x, $$2x) -> {
               String $$3x = $$1x.getRemaining().toLowerCase(Locale.ROOT);
               boolean $$4x = !$$0.A();
               boolean $$5 = true;
               if (!$$3x.isEmpty()) {
                  if ($$3x.charAt(0) == '!') {
                     $$4x = false;
                     $$3x = $$3x.substring(1);
                  } else {
                     $$5 = false;
                  }
               }

               for(cgu $$6 : cgu.values()) {
                  if ($$6.b().toLowerCase(Locale.ROOT).startsWith($$3x)) {
                     if ($$5) {
                        $$1x.suggest("!" + $$6.b());
                     }

                     if ($$4x) {
                        $$1x.suggest($$6.b());
                     }
                  }
               }

               return $$1x.buildFuture();
            }));
            int $$1 = $$0.g().getCursor();
            boolean $$2 = $$0.e();
            if ($$0.A() && !$$2) {
               $$0.g().setCursor($$1);
               throw b.createWithContext($$0.g(), "gamemode");
            } else {
               String $$3 = $$0.g().readUnquotedString();
               cgu $$4 = cgu.a($$3, null);
               if ($$4 == null) {
                  $$0.g().setCursor($$1);
                  throw g.createWithContext($$0.g(), $$3);
               } else {
                  $$0.a(false);
                  $$0.a((Predicate<bbn>)($$2x -> {
                     if (!($$2x instanceof agh)) {
                        return false;
                     } else {
                        cgu $$3x = ((agh)$$2x).d.b();
                        return $$2 ? $$3x != $$4 : $$3x == $$4;
                     }
                  }));
                  if ($$2) {
                     $$0.g(true);
                  } else {
                     $$0.f(true);
                  }

               }
            }
         }, $$0 -> !$$0.z(), rq.c("argument.entity.options.gamemode.description"));
         a("team", $$0 -> {
            boolean $$1 = $$0.e();
            String $$2 = $$0.g().readUnquotedString();
            $$0.a((Predicate<bbn>)($$2x -> {
               if (!($$2x instanceof bcc)) {
                  return false;
               } else {
                  dxq $$3 = $$2x.bY();
                  String $$4 = $$3 == null ? "" : $$3.b();
                  return $$4.equals($$2) != $$1;
               }
            }));
            if ($$1) {
               $$0.i(true);
            } else {
               $$0.h(true);
            }

         }, $$0 -> !$$0.B(), rq.c("argument.entity.options.team.description"));
         a("type", $$0 -> {
            $$0.a((BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>>)(($$1x, $$2x) -> {
               dt.a(hm.X.d(), $$1x, String.valueOf('!'));
               dt.a(hm.X.i().map(akz::b), $$1x, "!#");
               if (!$$0.F()) {
                  dt.a(hm.X.d(), $$1x);
                  dt.a(hm.X.i().map(akz::b), $$1x, String.valueOf('#'));
               }

               return $$1x.buildFuture();
            }));
            int $$1 = $$0.g().getCursor();
            boolean $$2 = $$0.e();
            if ($$0.F() && !$$2) {
               $$0.g().setCursor($$1);
               throw b.createWithContext($$0.g(), "type");
            } else {
               if ($$2) {
                  $$0.D();
               }

               if ($$0.f()) {
                  akz<bbr<?>> $$3 = akz.a(hm.j, abb.a($$0.g()));
                  $$0.a((Predicate<bbn>)($$2x -> $$2x.ad().a($$3) != $$2));
               } else {
                  abb $$4 = abb.a($$0.g());
                  bbr<?> $$5 = (bbr)hm.X.b($$4).orElseThrow(() -> {
                     $$0.g().setCursor($$1);
                     return h.createWithContext($$0.g(), $$4.toString());
                  });
                  if (Objects.equals(bbr.bn, $$5) && !$$2) {
                     $$0.a(false);
                  }

                  $$0.a((Predicate<bbn>)($$2x -> Objects.equals($$5, $$2x.ad()) != $$2));
                  if (!$$2) {
                     $$0.a($$5);
                  }
               }

            }
         }, $$0 -> !$$0.E(), rq.c("argument.entity.options.type.description"));
         a("tag", $$0 -> {
            boolean $$1 = $$0.e();
            String $$2 = $$0.g().readUnquotedString();
            $$0.a((Predicate<bbn>)($$2x -> {
               if ("".equals($$2)) {
                  return $$2x.af().isEmpty() != $$1;
               } else {
                  return $$2x.af().contains($$2) != $$1;
               }
            }));
         }, $$0 -> true, rq.c("argument.entity.options.tag.description"));
         a("nbt", $$0 -> {
            boolean $$1 = $$0.e();
            pj $$2 = new qd($$0.g()).f();
            $$0.a((Predicate<bbn>)($$2x -> {
               pj $$3 = $$2x.f(new pj());
               if ($$2x instanceof agh) {
                  cax $$4 = ((agh)$$2x).fA().f();
                  if (!$$4.b()) {
                     $$3.a("SelectedItem", (qc)$$4.b(new pj()));
                  }
               }

               return pv.a($$2, $$3, true) != $$1;
            }));
         }, $$0 -> true, rq.c("argument.entity.options.nbt.description"));
         a("scores", $$0 -> {
            StringReader $$1 = $$0.g();
            Map<String, cj.d> $$2 = Maps.newHashMap();
            $$1.expect('{');
            $$1.skipWhitespace();

            while($$1.canRead() && $$1.peek() != '}') {
               $$1.skipWhitespace();
               String $$3 = $$1.readUnquotedString();
               $$1.skipWhitespace();
               $$1.expect('=');
               $$1.skipWhitespace();
               cj.d $$4 = cj.d.a($$1);
               $$2.put($$3, $$4);
               $$1.skipWhitespace();
               if ($$1.canRead() && $$1.peek() == ',') {
                  $$1.skip();
               }
            }

            $$1.expect('}');
            if (!$$2.isEmpty()) {
               $$0.a((Predicate<bbn>)($$1x -> {
                  dxo $$2x = $$1x.cD().aF();
                  String $$3x = $$1x.cq();

                  for(Entry<String, cj.d> $$4x : $$2.entrySet()) {
                     dxl $$5 = $$2x.d((String)$$4x.getKey());
                     if ($$5 == null) {
                        return false;
                     }

                     if (!$$2x.b($$3x, $$5)) {
                        return false;
                     }

                     dxn $$6 = $$2x.c($$3x, $$5);
                     int $$7 = $$6.b();
                     if (!((cj.d)$$4x.getValue()).d($$7)) {
                        return false;
                     }
                  }

                  return true;
               }));
            }

            $$0.j(true);
         }, $$0 -> !$$0.G(), rq.c("argument.entity.options.scores.description"));
         a("advancements", $$0 -> {
            StringReader $$1 = $$0.g();
            Map<abb, Predicate<ah>> $$2 = Maps.newHashMap();
            $$1.expect('{');
            $$1.skipWhitespace();

            while($$1.canRead() && $$1.peek() != '}') {
               $$1.skipWhitespace();
               abb $$3 = abb.a($$1);
               $$1.skipWhitespace();
               $$1.expect('=');
               $$1.skipWhitespace();
               if ($$1.canRead() && $$1.peek() == '{') {
                  Map<String, Predicate<al>> $$4 = Maps.newHashMap();
                  $$1.skipWhitespace();
                  $$1.expect('{');
                  $$1.skipWhitespace();

                  while($$1.canRead() && $$1.peek() != '}') {
                     $$1.skipWhitespace();
                     String $$5 = $$1.readUnquotedString();
                     $$1.skipWhitespace();
                     $$1.expect('=');
                     $$1.skipWhitespace();
                     boolean $$6 = $$1.readBoolean();
                     $$4.put($$5, (Predicate)$$1x -> $$1x.a() == $$6);
                     $$1.skipWhitespace();
                     if ($$1.canRead() && $$1.peek() == ',') {
                        $$1.skip();
                     }
                  }

                  $$1.skipWhitespace();
                  $$1.expect('}');
                  $$1.skipWhitespace();
                  $$2.put($$3, (Predicate)$$1x -> {
                     for(Entry<String, Predicate<al>> $$2x : $$4.entrySet()) {
                        al $$3x = $$1x.c((String)$$2x.getKey());
                        if ($$3x == null || !((Predicate)$$2x.getValue()).test($$3x)) {
                           return false;
                        }
                     }

                     return true;
                  });
               } else {
                  boolean $$7 = $$1.readBoolean();
                  $$2.put($$3, (Predicate)$$1x -> $$1x.a() == $$7);
               }

               $$1.skipWhitespace();
               if ($$1.canRead() && $$1.peek() == ',') {
                  $$1.skip();
               }
            }

            $$1.expect('}');
            if (!$$2.isEmpty()) {
               $$0.a((Predicate<bbn>)($$1x -> {
                  if (!($$1x instanceof agh)) {
                     return false;
                  } else {
                     agh $$2x = (agh)$$1x;
                     abj $$3x = $$2x.M();
                     abm $$4 = $$2x.cD().az();

                     for(Entry<abb, Predicate<ah>> $$5x : $$2.entrySet()) {
                        af $$6x = $$4.a((abb)$$5x.getKey());
                        if ($$6x == null || !((Predicate)$$5x.getValue()).test($$3x.b($$6x))) {
                           return false;
                        }
                     }

                     return true;
                  }
               }));
               $$0.a(false);
            }

            $$0.k(true);
         }, $$0 -> !$$0.H(), rq.c("argument.entity.options.advancements.description"));
         a("predicate", $$0 -> {
            boolean $$1 = $$0.e();
            abb $$2 = abb.a($$0.g());
            $$0.a((Predicate<bbn>)($$2x -> {
               if (!($$2x.s instanceof agg)) {
                  return false;
               } else {
                  agg $$3 = (agg)$$2x.s;
                  dux $$4 = $$3.n().aI().a($$2);
                  if ($$4 == null) {
                     return false;
                  } else {
                     dsd $$5 = new dsd.a($$3).a(dul.a, $$2x).a(dul.f, $$2x.cY()).a(duk.d);
                     return $$1 ^ $$4.test($$5);
                  }
               }
            }));
         }, $$0 -> true, rq.c("argument.entity.options.predicate.description"));
      }
   }

   public static gb.a a(ga $$0, String $$1, int $$2) throws CommandSyntaxException {
      gb.b $$3 = (gb.b)i.get($$1);
      if ($$3 != null) {
         if ($$3.b.test($$0)) {
            return $$3.a;
         } else {
            throw b.createWithContext($$0.g(), $$1);
         }
      } else {
         $$0.g().setCursor($$2);
         throw a.createWithContext($$0.g(), $$1);
      }
   }

   public static void a(ga $$0, SuggestionsBuilder $$1) {
      String $$2 = $$1.getRemaining().toLowerCase(Locale.ROOT);

      for(Entry<String, gb.b> $$3 : i.entrySet()) {
         if (((gb.b)$$3.getValue()).b.test($$0) && ((String)$$3.getKey()).toLowerCase(Locale.ROOT).startsWith($$2)) {
            $$1.suggest((String)$$3.getKey() + "=", ((gb.b)$$3.getValue()).c);
         }
      }

   }

   public interface a {
      void handle(ga var1) throws CommandSyntaxException;
   }

   static class b {
      public final gb.a a;
      public final Predicate<ga> b;
      public final rq c;

      b(gb.a $$0, Predicate<ga> $$1, rq $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
