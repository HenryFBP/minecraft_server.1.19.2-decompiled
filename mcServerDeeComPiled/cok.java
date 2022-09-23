import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cok extends cjt {
   private static final float b = 1.0F;
   private static final dxj c = cjt.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final dxj d = cjt.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final dxj e = cjt.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final dxj f = cjt.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final dxj g = cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final dxj h = cjt.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<gy, cwf> i = cox.g;
   private static final Map<gy, dxj> j = ad.a(Maps.newEnumMap(gy.class), $$0 -> {
      $$0.put(gy.c, g);
      $$0.put(gy.f, f);
      $$0.put(gy.d, h);
      $$0.put(gy.e, e);
      $$0.put(gy.b, c);
      $$0.put(gy.a, d);
   });
   protected static final gy[] a = gy.values();
   private final ImmutableMap<cvo, dxj> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public cok(cvn.c $$0) {
      super($$0);
      this.k(a(this.D));
      this.k = this.a(cok::o);
      this.l = gy.c.a.a().allMatch(this::a);
      this.m = gy.c.a.a().filter(gy.a.a).filter(this::a).count() % 2L == 0L;
      this.n = gy.c.a.a().filter(gy.a.c).filter(this::a).count() % 2L == 0L;
   }

   public static Set<gy> h(cvo $$0) {
      if (!($$0.b() instanceof cok)) {
         return Set.of();
      } else {
         Set<gy> $$1 = EnumSet.noneOf(gy.class);

         for(gy $$2 : gy.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<gy> a(byte $$0) {
      Set<gy> $$1 = EnumSet.noneOf(gy.class);

      for(gy $$2 : gy.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<gy> $$0) {
      byte $$1 = 0;

      for(gy $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(gy $$0) {
      return true;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      for(gy $$1 : a) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if (!n($$0)) {
         return cju.a.m();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)this.k.get($$0);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      boolean $$3 = false;

      for(gy $$4 : a) {
         if (a($$0, $$4)) {
            gt $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      return (cvo)Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cgd $$0, cvo $$1, gt $$2, gy $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         gt $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public cvo c(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         cvo $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.q() && $$0.p().a(dpw.c)) {
            $$4 = this.m().a(cwe.C, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      if ($$1 == coh.c && !this.m) {
         return $$0;
      } else {
         return $$1 == coh.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private cvo a(cvo $$0, Function<gy, gy> $$1) {
      cvo $$2 = $$0;

      for(gy $$3 : a) {
         if (this.a($$3)) {
            $$2 = $$2.a(b((gy)$$1.apply($$3)), (Boolean)$$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(cvo $$0, gy $$1) {
      cwf $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cgd $$0, gy $$1, gt $$2, cvo $$3) {
      return cjt.a($$3.l($$0, $$2), $$1.g()) || cjt.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean q() {
      return this.D.d().contains(cwe.C);
   }

   private static cvo a(cvo $$0, cwf $$1) {
      cvo $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cju.a.m();
   }

   public static cwf b(gy $$0) {
      return (cwf)i.get($$0);
   }

   private static cvo a(cvp<cjt, cvo> $$0) {
      cvo $$1 = $$0.b();

      for(cwf $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static dxj o(cvo $$0) {
      dxj $$1 = dxg.a();

      for(gy $$2 : a) {
         if (a($$0, $$2)) {
            $$1 = dxg.a($$1, (dxj)j.get($$2));
         }
      }

      return $$1.b() ? dxg.b() : $$1;
   }

   protected static boolean n(cvo $$0) {
      return Arrays.stream(a).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(cvo $$0) {
      return Arrays.stream(a).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract col c();
}
