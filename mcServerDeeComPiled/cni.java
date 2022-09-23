import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cni extends cjt {
   private final cjt a;
   private static final Map<cjt, cjt> b = Maps.newIdentityHashMap();
   private static final Map<cvo, cvo> c = Maps.newIdentityHashMap();
   private static final Map<cvo, cvo> d = Maps.newIdentityHashMap();

   public cni(cjt $$0, cvn.c $$1) {
      super($$1.e($$0.t() / 2.0F).f(0.75F));
      this.a = $$0;
      b.put($$0, this);
   }

   public cjt b() {
      return this.a;
   }

   public static boolean h(cvo $$0) {
      return b.containsKey($$0.b());
   }

   private void a(agg $$0, gt $$1) {
      brx $$2 = bbr.aD.a((cgx)$$0);
      $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);
      $$2.L();
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, cax $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.W().b(cgt.g) && cet.a(cev.v, $$3) == 0) {
         this.a($$1, $$2);
      }

   }

   public static cvo n(cvo $$0) {
      return a(c, $$0, () -> ((cjt)b.get($$0.b())).m());
   }

   public cvo o(cvo $$0) {
      return a(d, $$0, () -> this.b().m());
   }

   private static cvo a(Map<cvo, cvo> $$0, cvo $$1, Supplier<cvo> $$2) {
      return (cvo)$$0.computeIfAbsent($$1, $$1x -> {
         cvo $$2x = (cvo)$$2.get();

         for(cwr $$3 : $$1x.v()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
