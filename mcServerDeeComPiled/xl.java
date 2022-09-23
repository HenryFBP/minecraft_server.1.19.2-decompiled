import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import io.netty.buffer.Unpooled;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xl {
   private static final Logger a = LogUtils.getLogger();

   public static void a(agg $$0, gt $$1, String $$2, int $$3, int $$4) {
      qx $$5 = new qx(Unpooled.buffer());
      $$5.a($$1);
      $$5.writeInt($$3);
      $$5.a($$2);
      $$5.writeInt($$4);
      a($$0, $$5, uc.n);
   }

   public static void a(agg $$0) {
      qx $$1 = new qx(Unpooled.buffer());
      a($$0, $$1, uc.o);
   }

   public static void a(agg $$0, cge $$1) {
   }

   public static void a(agg $$0, gt $$1) {
      d($$0, $$1);
   }

   public static void b(agg $$0, gt $$1) {
      d($$0, $$1);
   }

   public static void c(agg $$0, gt $$1) {
      d($$0, $$1);
   }

   private static void d(agg $$0, gt $$1) {
   }

   public static void a(cgx $$0, bce $$1, @Nullable dql $$2, float $$3) {
   }

   public static void a(cgx $$0, gt $$1) {
   }

   public static void a(chp $$0, dlj $$1) {
   }

   public static void a(cgx $$0, bce $$1, biq $$2) {
      if ($$0 instanceof agg) {
         ;
      }
   }

   public static void a(agg $$0, Collection<bvj> $$1) {
   }

   public static void a(bcc $$0) {
   }

   public static void a(bnf $$0) {
   }

   public static void a(cgx $$0, czv $$1, dwq $$2) {
   }

   public static void a(cgx $$0, czx $$1) {
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctf $$3) {
   }

   private static void a(bcc $$0, qx $$1) {
      bcx<?> $$2 = $$0.dy();
      long $$3 = $$0.s.U();
      if ($$0 instanceof btn) {
         bac $$4 = ((btn)$$0).t();
         $$1.a($$4.c() ? "" : $$4.toString());
      } else {
         $$1.a("");
      }

      $$1.a($$2.a(bku.t) ? $$2.c(bku.t) : Optional.empty(), ($$0x, $$1x) -> $$1x.a($$0x));
      if ($$0 instanceof btp $$5) {
         boolean $$6 = $$5.a($$3);
         $$1.writeBoolean($$6);
      } else {
         $$1.writeBoolean(false);
      }

      if ($$0.ad() == bbr.bc) {
         btg $$7 = (btg)$$0;
         $$1.writeInt($$7.q());
      } else {
         $$1.writeInt(-1);
      }

      $$1.a($$2.c(), ($$0x, $$1x) -> $$0x.a($$1x.a()));
      Set<String> $$8 = (Set)$$2.d().stream().map(bdo::toString).collect(Collectors.toSet());
      $$1.a($$8, qx::a);
      $$1.a(a($$0, $$3), ($$0x, $$1x) -> {
         String $$2x = amx.a($$1x, 255, true);
         $$0x.a($$2x);
      });
      if ($$0 instanceof btp) {
         Set<gt> $$9 = (Set)Stream.of(bku.c, bku.b, bku.e).map($$2::c).flatMap(Optional::stream).map(hb::b).collect(Collectors.toSet());
         $$1.a($$9, qx::a);
      } else {
         $$1.d(0);
      }

      if ($$0 instanceof btp) {
         Set<gt> $$10 = (Set)Stream.of(bku.d).map($$2::c).flatMap(Optional::stream).map(hb::b).collect(Collectors.toSet());
         $$1.a($$10, qx::a);
      } else {
         $$1.d(0);
      }

      if ($$0 instanceof btp) {
         Map<UUID, Object2IntMap<bkr>> $$11 = ((btp)$$0).gf().a();
         List<String> $$12 = Lists.newArrayList();
         $$11.forEach(($$1x, $$2x) -> {
            String $$3x = xk.a($$1x);
            $$2x.forEach(($$2xx, $$3xx) -> $$12.add($$3x + ": " + $$2xx + ": " + $$3xx));
         });
         $$1.a($$12, qx::a);
      } else {
         $$1.d(0);
      }

   }

   private static List<String> a(bcc $$0, long $$1) {
      Map<bku<?>, Optional<? extends bkt<?>>> $$2 = $$0.dy().a();
      List<String> $$3 = Lists.newArrayList();

      for(Entry<bku<?>, Optional<? extends bkt<?>>> $$4 : $$2.entrySet()) {
         bku<?> $$5 = (bku)$$4.getKey();
         Optional<? extends bkt<?>> $$6 = (Optional)$$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bkt<?> $$7 = (bkt)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bku.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((agg)$$0.s, $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((agg)$$0.s, $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(hm.ar.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(agg $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bcc) {
         bbn $$2 = (bbn)$$1;
         return xk.a($$2);
      } else if ($$1 instanceof ban) {
         return ((ban)$$1).X().getString();
      } else if ($$1 instanceof bkx) {
         return a($$0, ((bkx)$$1).a());
      } else if ($$1 instanceof bdy) {
         return a($$0, ((bdy)$$1).c());
      } else if ($$1 instanceof hb) {
         return a($$0, ((hb)$$1).b());
      } else if ($$1 instanceof bdq) {
         return a($$0, ((bdq)$$1).b());
      } else if ($$1 instanceof bax) {
         bbn $$3 = ((bax)$$1).m();
         return $$3 == null ? $$1.toString() : a($$0, $$3);
      } else if (!($$1 instanceof Collection)) {
         return $$1.toString();
      } else {
         List<String> $$4 = Lists.newArrayList();

         for(Object $$5 : (Iterable)$$1) {
            $$4.add(a($$0, $$5));
         }

         return $$4.toString();
      }
   }

   private static void a(agg $$0, qx $$1, abb $$2) {
      tc<?> $$3 = new uc($$2, $$1);

      for(buc $$4 : $$0.w()) {
         ((agh)$$4).b.a($$3);
      }

   }
}
