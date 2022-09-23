import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class car extends cat {
   private static final String a = "instrument";
   private akz<caq> b;

   public car(cat.a $$0, akz<caq> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aba<caq>> $$4 = this.d($$0).flatMap(hc::e);
      if ($$4.isPresent()) {
         sb $$5 = rq.c(ad.a("instrument", ((aba)$$4.get()).a()));
         $$2.add($$5.a(p.h));
      }

   }

   public static cax a(cat $$0, hc<caq> $$1) {
      cax $$2 = new cax($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cax $$0, akz<caq> $$1, amn $$2) {
      Optional<hc<caq>> $$3 = hm.bQ.c($$1).flatMap($$1x -> $$1x.a($$2));
      if ($$3.isPresent()) {
         a($$0, (hc<caq>)$$3.get());
      }

   }

   private static void a(cax $$0, hc<caq> $$1) {
      pj $$2 = $$0.v();
      $$2.a("instrument", ((aba)$$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument"))).a().toString());
   }

   @Override
   public void a(bzj $$0, hi<cax> $$1) {
      if (this.a($$0)) {
         for(hc<caq> $$2 : hm.bQ.d(this.b)) {
            $$1.add(a(caz.tV, $$2));
         }
      }

   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      Optional<hc<caq>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         caq $$5 = (caq)((hc)$$4.get()).a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.fW().a(this, $$5.b());
         return bak.b($$3);
      } else {
         return bak.d($$3);
      }
   }

   @Override
   public int b(cax $$0) {
      Optional<hc<caq>> $$1 = this.d($$0);
      return $$1.isPresent() ? ((caq)((hc)$$1.get()).a()).b() : 0;
   }

   private Optional<hc<caq>> d(cax $$0) {
      pj $$1 = $$0.u();
      if ($$1 != null) {
         abb $$2 = abb.a($$1.l("instrument"));
         if ($$2 != null) {
            return hm.bQ.b(aba.a(hm.bP, $$2));
         }
      }

      Iterator<hc<caq>> $$3 = hm.bQ.d(this.b).iterator();
      return $$3.hasNext() ? Optional.of((hc)$$3.next()) : Optional.empty();
   }

   @Override
   public ccn c(cax $$0) {
      return ccn.i;
   }

   private static void a(cgx $$0, buc $$1, caq $$2) {
      ajv $$3 = $$2.a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, ajx.c, $$4, 1.0F);
      $$0.a(czv.B, $$1.cY(), czv.a.a($$1));
   }
}
