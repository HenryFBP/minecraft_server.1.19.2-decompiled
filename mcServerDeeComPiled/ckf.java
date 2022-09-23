import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ckf extends cil implements cql {
   public static final int c = 1;
   public static final int d = 4;
   public static final cwo e = cwe.az;
   public static final cwf f = cil.b;
   public static final cwf g = cwe.C;
   public static final ToIntFunction<cvo> h = $$0 -> $$0.c(f) ? 3 * $$0.c(e) : 0;
   private static final Int2ObjectMap<List<dwq>> i = ad.a((Supplier<Int2ObjectMap<List<dwq>>>)(() -> {
      Int2ObjectMap<List<dwq>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new dwq(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new dwq(0.375, 0.44, 0.5), new dwq(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new dwq(0.5, 0.313, 0.625), new dwq(0.375, 0.44, 0.5), new dwq(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new dwq(0.44, 0.313, 0.56), new dwq(0.625, 0.44, 0.56), new dwq(0.375, 0.44, 0.375), new dwq(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   }));
   private static final dxj j = cjt.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final dxj k = cjt.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final dxj l = cjt.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final dxj m = cjt.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   public ckf(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(e, Integer.valueOf(1)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$3.fB().e && $$3.b($$4).b() && $$0.c(f)) {
         a($$3, $$0, $$1, $$2);
         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      return !$$1.h() && $$1.n().c() == this.l() && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(e);
      } else {
         dpv $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == dpw.c;
         return super.a($$0).a(g, Boolean.valueOf($$3));
      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(g) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch($$0.c(e)) {
         case 1:
         default:
            return j;
         case 2:
            return k;
         case 3:
            return l;
         case 4:
            return m;
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(e, f, g);
   }

   @Override
   public boolean a(cgy $$0, gt $$1, cvo $$2, dpv $$3) {
      if (!$$2.c(g) && $$3.a() == dpw.c) {
         cvo $$4 = $$2.a(g, Boolean.valueOf(true));
         if ($$2.c(f)) {
            a(null, $$4, $$0, $$1);
         } else {
            $$0.a($$1, $$4, 3);
         }

         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cvo $$0) {
      return $$0.a(akl.ab, $$0x -> $$0x.b(f) && $$0x.b(g)) && !$$0.c(f) && !$$0.c(g);
   }

   @Override
   protected Iterable<dwq> a(cvo $$0) {
      return (Iterable<dwq>)i.get($$0.c(e));
   }

   @Override
   protected boolean c(cvo $$0) {
      return !$$0.c(g) && super.c($$0);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return cjt.a($$1, $$2.c(), gy.b);
   }
}
