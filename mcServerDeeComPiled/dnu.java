import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dnu extends doq {
   public static final Codec<dnu> a = Codec.unit(() -> dnu.b);
   public static final dnu b = new dnu();
   private final Map<cjt, cjt> c = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cju.m, cju.oc);
      $$0.put(cju.bY, cju.oc);
      $$0.put(cju.b, cju.og);
      $$0.put(cju.dP, cju.oh);
      $$0.put(cju.dQ, cju.oh);
      $$0.put(cju.cz, cju.od);
      $$0.put(cju.lT, cju.od);
      $$0.put(cju.lV, cju.oo);
      $$0.put(cju.eq, cju.ol);
      $$0.put(cju.lR, cju.ol);
      $$0.put(cju.iD, cju.of);
      $$0.put(cju.mh, cju.of);
      $$0.put(cju.iz, cju.op);
      $$0.put(cju.iy, cju.op);
      $$0.put(cju.iF, cju.ok);
      $$0.put(cju.mf, cju.ok);
      $$0.put(cju.mv, cju.om);
      $$0.put(cju.mt, cju.om);
      $$0.put(cju.eW, cju.oe);
      $$0.put(cju.eX, cju.oe);
      $$0.put(cju.dS, cju.oj);
      $$0.put(cju.dR, cju.oi);
      $$0.put(cju.ee, cju.ef);
   });

   private dnu() {
   }

   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      cjt $$6 = (cjt)this.c.get($$4.b.b());
      if ($$6 == null) {
         return $$4;
      } else {
         cvo $$7 = $$4.b;
         cvo $$8 = $$6.m();
         if ($$7.b(crd.a)) {
            $$8 = $$8.a(crd.a, (gy)$$7.c(crd.a));
         }

         if ($$7.b(crd.b)) {
            $$8 = $$8.a(crd.b, (cwn)$$7.c(crd.b));
         }

         if ($$7.b(cqn.a)) {
            $$8 = $$8.a(cqn.a, (cwv)$$7.c(cqn.a));
         }

         return new dot.c($$4.a, $$8, $$4.c);
      }
   }

   @Override
   protected dos<?> a() {
      return dos.h;
   }
}
