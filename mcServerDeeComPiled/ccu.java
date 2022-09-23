import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ccu {
   public static final String a = "CustomPotionEffects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final rq e = rq.c("effect.none").a(p.h);

   public static List<bbg> a(cax $$0) {
      return a($$0.u());
   }

   public static List<bbg> a(ccs $$0, Collection<bbg> $$1) {
      List<bbg> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bbg> a(@Nullable pj $$0) {
      List<bbg> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bbg> b(cax $$0) {
      return b($$0.u());
   }

   public static List<bbg> b(@Nullable pj $$0) {
      List<bbg> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable pj $$0, List<bbg> $$1) {
      if ($$0 != null && $$0.b("CustomPotionEffects", 9)) {
         pp $$2 = $$0.c("CustomPotionEffects", 10);

         for(int $$3 = 0; $$3 < $$2.size(); ++$$3) {
            pj $$4 = $$2.a($$3);
            bbg $$5 = bbg.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }

   }

   public static int c(cax $$0) {
      pj $$1 = $$0.u();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == ccv.a ? 16253176 : a(a($$0));
      }
   }

   public static int a(ccs $$0) {
      return $$0 == ccv.a ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bbg> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for(bbg $$6 : $$0) {
            if ($$6.f()) {
               int $$7 = $$6.b().g();
               int $$8 = $$6.d() + 1;
               $$2 += (float)($$8 * ($$7 >> 16 & 0xFF)) / 255.0F;
               $$3 += (float)($$8 * ($$7 >> 8 & 0xFF)) / 255.0F;
               $$4 += (float)($$8 * ($$7 >> 0 & 0xFF)) / 255.0F;
               $$5 += $$8;
            }
         }

         if ($$5 == 0) {
            return 0;
         } else {
            $$2 = $$2 / (float)$$5 * 255.0F;
            $$3 = $$3 / (float)$$5 * 255.0F;
            $$4 = $$4 / (float)$$5 * 255.0F;
            return (int)$$2 << 16 | (int)$$3 << 8 | (int)$$4;
         }
      }
   }

   public static ccs d(cax $$0) {
      return c($$0.u());
   }

   public static ccs c(@Nullable pj $$0) {
      return $$0 == null ? ccv.a : ccs.a($$0.l("Potion"));
   }

   public static cax a(cax $$0, ccs $$1) {
      abb $$2 = hm.Z.b($$1);
      if ($$1 == ccv.a) {
         $$0.c("Potion");
      } else {
         $$0.v().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static cax a(cax $$0, Collection<bbg> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         pj $$2 = $$0.v();
         pp $$3 = $$2.c("CustomPotionEffects", 9);

         for(bbg $$4 : $$1) {
            $$3.add($$4.a(new pj()));
         }

         $$2.a("CustomPotionEffects", (qc)$$3);
         return $$0;
      }
   }

   public static void a(cax $$0, List<rq> $$1, float $$2) {
      List<bbg> $$3 = a($$0);
      List<Pair<bcy, bdb>> $$4 = Lists.newArrayList();
      if ($$3.isEmpty()) {
         $$1.add(e);
      } else {
         for(bbg $$5 : $$3) {
            sb $$6 = rq.c($$5.h());
            bbe $$7 = $$5.b();
            Map<bcy, bdb> $$8 = $$7.h();
            if (!$$8.isEmpty()) {
               for(Entry<bcy, bdb> $$9 : $$8.entrySet()) {
                  bdb $$10 = (bdb)$$9.getValue();
                  bdb $$11 = new bdb($$10.b(), $$7.a($$5.d(), $$10), $$10.c());
                  $$4.add(new Pair((bcy)$$9.getKey(), $$11));
               }
            }

            if ($$5.d() > 0) {
               $$6 = rq.a("potion.withAmplifier", $$6, rq.c("potion.potency." + $$5.d()));
            }

            if ($$5.c() > 20) {
               $$6 = rq.a("potion.withDuration", $$6, bbh.a($$5, $$2));
            }

            $$1.add($$6.a($$7.f().a()));
         }
      }

      if (!$$4.isEmpty()) {
         $$1.add(rp.a);
         $$1.add(rq.c("potion.whenDrank").a(p.f));

         for(Pair<bcy, bdb> $$12 : $$4) {
            bdb $$13 = (bdb)$$12.getSecond();
            double $$14 = $$13.d();
            double $$16;
            if ($$13.c() != bdb.a.b && $$13.c() != bdb.a.c) {
               $$16 = $$13.d();
            } else {
               $$16 = $$13.d() * 100.0;
            }

            if ($$14 > 0.0) {
               $$1.add(rq.a("attribute.modifier.plus." + $$13.c().a(), cax.c.format($$16), rq.c(((bcy)$$12.getFirst()).c())).a(p.j));
            } else if ($$14 < 0.0) {
               $$16 *= -1.0;
               $$1.add(rq.a("attribute.modifier.take." + $$13.c().a(), cax.c.format($$16), rq.c(((bcy)$$12.getFirst()).c())).a(p.m));
            }
         }
      }

   }
}
