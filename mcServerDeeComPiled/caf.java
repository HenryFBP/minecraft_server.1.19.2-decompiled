import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;

public class caf extends cat {
   public static final String a = "Fireworks";
   public static final String b = "Explosion";
   public static final String c = "Explosions";
   public static final String d = "Flight";
   public static final String e = "Type";
   public static final String f = "Trail";
   public static final String g = "Flicker";
   public static final String h = "Colors";
   public static final String i = "FadeColors";
   public static final double j = 0.15;

   public caf(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      if (!$$1.y) {
         cax $$2 = $$0.n();
         dwq $$3 = $$0.l();
         gy $$4 = $$0.k();
         bup $$5 = new bup($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.g(1);
      }

      return baj.a($$1.y);
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      if ($$1.fc()) {
         cax $$3 = $$1.b($$2);
         if (!$$0.y) {
            bup $$4 = new bup($$0, $$3, $$1);
            $$0.b($$4);
            if (!$$1.fB().d) {
               $$3.g(1);
            }

            $$1.b(akg.c.b(this));
         }

         return bak.a($$1.b($$2), $$0.k_());
      } else {
         return bak.c($$1.b($$2));
      }
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      pj $$4 = $$0.b("Fireworks");
      if ($$4 != null) {
         if ($$4.b("Flight", 99)) {
            $$2.add(rq.c("item.minecraft.firework_rocket.flight").f(" ").f(String.valueOf($$4.f("Flight"))).a(p.h));
         }

         pp $$5 = $$4.c("Explosions", 10);
         if (!$$5.isEmpty()) {
            for(int $$6 = 0; $$6 < $$5.size(); ++$$6) {
               pj $$7 = $$5.a($$6);
               List<rq> $$8 = Lists.newArrayList();
               cag.a($$7, $$8);
               if (!$$8.isEmpty()) {
                  for(int $$9 = 1; $$9 < $$8.size(); ++$$9) {
                     $$8.set($$9, rq.b("  ").b((rq)$$8.get($$9)).a(p.h));
                  }

                  $$2.addAll($$8);
               }
            }
         }

      }
   }

   @Override
   public cax Q_() {
      cax $$0 = new cax(this);
      $$0.v().a("Flight", (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final caf.a[] f = (caf.a[])Arrays.stream(values()).sorted(Comparator.comparingInt($$0 -> $$0.g)).toArray($$0 -> new caf.a[$$0]);
      private final int g;
      private final String h;

      private a(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public String b() {
         return this.h;
      }

      public static caf.a a(int $$0) {
         return $$0 >= 0 && $$0 < f.length ? f[$$0] : a;
      }
   }
}
