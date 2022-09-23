import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class cet {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static pj a(@Nullable abb $$0, int $$1) {
      pj $$2 = new pj();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(pj $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(pj $$0) {
      return ami.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static abb b(pj $$0) {
      return abb.a($$0.l("id"));
   }

   @Nullable
   public static abb a(cer $$0) {
      return hm.W.b($$0);
   }

   public static int a(cer $$0, cax $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         abb $$2 = a($$0);
         pp $$3 = $$1.w();

         for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            pj $$5 = $$3.a($$4);
            abb $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<cer, Integer> a(cax $$0) {
      pp $$1 = $$0.a(caz.ss) ? bzy.d($$0) : $$0.w();
      return a($$1);
   }

   public static Map<cer, Integer> a(pp $$0) {
      Map<cer, Integer> $$1 = Maps.newLinkedHashMap();

      for(int $$2 = 0; $$2 < $$0.size(); ++$$2) {
         pj $$3 = $$0.a($$2);
         hm.W.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<cer, Integer> $$0, cax $$1) {
      pp $$2 = new pp();

      for(Entry<cer, Integer> $$3 : $$0.entrySet()) {
         cer $$4 = (cer)$$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(caz.ss)) {
               bzy.a($$1, new ceu($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(caz.ss)) {
         $$1.a("Enchantments", $$2);
      }

   }

   private static void a(cet.a $$0, cax $$1) {
      if (!$$1.b()) {
         pp $$2 = $$1.w();

         for(int $$3 = 0; $$3 < $$2.size(); ++$$3) {
            pj $$4 = $$2.a($$3);
            hm.W.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }

      }
   }

   private static void a(cet.a $$0, Iterable<cax> $$1) {
      for(cax $$2 : $$1) {
         a($$0, $$2);
      }

   }

   public static int a(Iterable<cax> $$0, baw $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cax $$0, bch $$1) {
      MutableFloat $$2 = new MutableFloat();
      a((cet.a)(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1))), $$0);
      return $$2.floatValue();
   }

   public static float a(bcc $$0) {
      int $$1 = a(cev.t, $$0);
      return $$1 > 0 ? cfh.e($$1) : 0.0F;
   }

   public static void a(bcc $$0, bbn $$1) {
      cet.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bG());
      }

      if ($$1 instanceof buc) {
         a($$2, $$0.ez());
      }

   }

   public static void b(bcc $$0, bbn $$1) {
      cet.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bG());
      }

      if ($$0 instanceof buc) {
         a($$2, $$0.ez());
      }

   }

   public static int a(cer $$0, bcc $$1) {
      Iterable<cax> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for(cax $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bcc $$0) {
      return (float)a(cev.m, $$0) * 0.15F;
   }

   public static int c(bcc $$0) {
      return a(cev.q, $$0);
   }

   public static int d(bcc $$0) {
      return a(cev.r, $$0);
   }

   public static int e(bcc $$0) {
      return a(cev.f, $$0);
   }

   public static int f(bcc $$0) {
      return a(cev.i, $$0);
   }

   public static int g(bcc $$0) {
      return a(cev.u, $$0);
   }

   public static int b(cax $$0) {
      return a(cev.C, $$0);
   }

   public static int c(cax $$0) {
      return a(cev.D, $$0);
   }

   public static int h(bcc $$0) {
      return a(cev.s, $$0);
   }

   public static boolean i(bcc $$0) {
      return a(cev.g, $$0) > 0;
   }

   public static boolean j(bcc $$0) {
      return a(cev.j, $$0) > 0;
   }

   public static boolean k(bcc $$0) {
      return a(cev.l, $$0) > 0;
   }

   public static boolean d(cax $$0) {
      return a(cev.k, $$0) > 0;
   }

   public static boolean e(cax $$0) {
      return a(cev.M, $$0) > 0;
   }

   public static int f(cax $$0) {
      return a(cev.E, $$0);
   }

   public static int g(cax $$0) {
      return a(cev.G, $$0);
   }

   public static boolean h(cax $$0) {
      return a(cev.H, $$0) > 0;
   }

   @Nullable
   public static Entry<bbs, cax> b(cer $$0, bcc $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<bbs, cax> a(cer $$0, bcc $$1, Predicate<cax> $$2) {
      Map<bbs, cax> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<bbs, cax>> $$4 = Lists.newArrayList();

         for(Entry<bbs, cax> $$5 : $$3.entrySet()) {
            cax $$6 = (cax)$$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : (Entry)$$4.get($$1.dQ().a($$4.size()));
      }
   }

   public static int a(amn $$0, int $$1, int $$2, cax $$3) {
      cat $$4 = $$3.c();
      int $$5 = $$4.c();
      if ($$5 <= 0) {
         return 0;
      } else {
         if ($$2 > 15) {
            $$2 = 15;
         }

         int $$6 = $$0.a(8) + 1 + ($$2 >> 1) + $$0.a($$2 + 1);
         if ($$1 == 0) {
            return Math.max($$6 / 3, 1);
         } else {
            return $$1 == 1 ? $$6 * 2 / 3 + 1 : Math.max($$6, $$2 * 2);
         }
      }
   }

   public static cax a(amn $$0, cax $$1, int $$2, boolean $$3) {
      List<ceu> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(caz.oY);
      if ($$5) {
         $$1 = new cax(caz.ss);
      }

      for(ceu $$6 : $$4) {
         if ($$5) {
            bzy.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<ceu> b(amn $$0, cax $$1, int $$2, boolean $$3) {
      List<ceu> $$4 = Lists.newArrayList();
      cat $$5 = $$1.c();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = ami.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<ceu> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            ayw.a($$0, $$8).ifPresent($$4::add);

            while($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ad.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               ayw.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<ceu> $$0, ceu $$1) {
      Iterator<ceu> $$2 = $$0.iterator();

      while($$2.hasNext()) {
         if (!$$1.a.b(((ceu)$$2.next()).a)) {
            $$2.remove();
         }
      }

   }

   public static boolean a(Collection<cer> $$0, cer $$1) {
      for(cer $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<ceu> a(int $$0, cax $$1, boolean $$2) {
      List<ceu> $$3 = Lists.newArrayList();
      cat $$4 = $$1.c();
      boolean $$5 = $$1.a(caz.oY);

      for(cer $$6 : hm.W) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for(int $$7 = $$6.a(); $$7 > $$6.e() - 1; --$$7) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new ceu($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(cer var1, int var2);
   }
}
