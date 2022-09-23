import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bed extends bdo<btp> {
   private static final int a = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<bts, abb> g = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bts.c, dry.an);
      $$0.put(bts.d, dry.ao);
      $$0.put(bts.e, dry.ap);
      $$0.put(bts.f, dry.aq);
      $$0.put(bts.g, dry.ar);
      $$0.put(bts.h, dry.as);
      $$0.put(bts.i, dry.at);
      $$0.put(bts.j, dry.au);
      $$0.put(bts.k, dry.av);
      $$0.put(bts.l, dry.aw);
      $$0.put(bts.n, dry.ax);
      $$0.put(bts.o, dry.ay);
      $$0.put(bts.p, dry.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bed(int $$0) {
      super(ImmutableMap.of(bku.m, bkv.c, bku.n, bkv.c, bku.q, bkv.c, bku.k, bkv.a), $$0);
   }

   protected boolean a(agg $$0, btp $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         --this.i;
         return false;
      } else {
         return true;
      }
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      buc $$3 = (buc)this.c($$1).get();
      $$1.dy().a(bku.q, $$3);
      bdp.a($$1, $$3);
   }

   protected boolean b(agg $$0, btp $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(agg $$0, btp $$1, long $$2) {
      buc $$3 = (buc)this.c($$1).get();
      bdp.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bcc)$$3);
            this.j = true;
         }
      } else {
         bdp.a($$1, $$3, 0.5F, 5);
      }

   }

   protected void d(agg $$0, btp $$1, long $$2) {
      this.i = a($$0);
      $$1.dy().b(bku.q);
      $$1.dy().b(bku.m);
      $$1.dy().b(bku.n);
   }

   private void a(btp $$0, bcc $$1) {
      for(cax $$3 : this.a($$0)) {
         bdp.a($$0, $$3, $$1.cY());
      }

   }

   private List<cax> a(btp $$0) {
      if ($$0.y_()) {
         return ImmutableList.of(new cax(caz.cC));
      } else {
         bts $$1 = $$0.fU().b();
         if (g.containsKey($$1)) {
            dsg $$2 = $$0.s.n().aH().a((abb)g.get($$1));
            dsd.a $$3 = new dsd.a((agg)$$0.s).a(dul.f, $$0.cY()).a(dul.a, $$0).a($$0.dQ());
            return $$2.a($$3.a(duk.g));
         } else {
            return ImmutableList.of(new cax(caz.nR));
         }
      }
   }

   private boolean b(btp $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<buc> c(btp $$0) {
      return $$0.dy().c(bku.k).filter(this::a);
   }

   private boolean a(buc $$0) {
      return $$0.a(bbi.F);
   }

   private boolean a(btp $$0, buc $$1) {
      gt $$2 = $$1.da();
      gt $$3 = $$0.da();
      return $$3.a($$2, 5.0);
   }

   private static int a(agg $$0) {
      return 600 + $$0.w.a(6001);
   }
}
