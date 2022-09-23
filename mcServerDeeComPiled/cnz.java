import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class cnz extends cjt implements cjy {
   public static final cwo a = cwe.aP;
   protected final dpt b;
   private final List<dpv> e;
   public static final dxj c = cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<gy> d = ImmutableList.of(gy.a, gy.d, gy.c, gy.f, gy.e);

   protected cnz(dpt $$0, cvn.c $$1) {
      super($$1);
      this.b = $$0;
      this.e = Lists.newArrayList();
      this.e.add($$0.a(false));

      for(int $$2 = 1; $$2 < 8; ++$$2) {
         this.e.add($$0.a(8 - $$2, false));
      }

      this.e.add($$0.a(8, true));
      this.k(this.D.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return $$3.a(c, $$2, true) && $$0.c(a) == 0 && $$3.a($$1.b_($$2.b()), $$0.p()) ? c : dxg.a();
   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.p().f();
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      $$0.p().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return false;
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return !this.b.a(akp.b);
   }

   @Override
   public dpv c_(cvo $$0) {
      int $$1 = $$0.c(a);
      return (dpv)this.e.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(cvo $$0, cvo $$1, gy $$2) {
      return $$1.p().a().a(this.b);
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.a;
   }

   @Override
   public List<cax> a(cvo $$0, dsd.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return dxg.a();
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.p().a(), this.b.a($$1));
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.p().b() || $$2.p().b()) {
         $$3.a($$4, $$0.p().a(), this.b.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.p().a(), this.b.a($$1));
      }

   }

   private boolean a(cgx $$0, gt $$1, cvo $$2) {
      if (this.b.a(akp.b)) {
         boolean $$3 = $$0.a_($$1.c()).a(cju.dh);
         UnmodifiableIterator var5 = d.iterator();

         while(var5.hasNext()) {
            gy $$4 = (gy)var5.next();
            gt $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(akp.a)) {
               cjt $$6 = $$0.b_($$1).b() ? cju.bZ : cju.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cju.lH)) {
               $$0.b($$1, cju.di.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cgy $$0, gt $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public cax c(cgy $$0, gt $$1, cvo $$2) {
      if ($$2.c(a) == 0) {
         $$0.a($$1, cju.a.m(), 11);
         return new cax(this.b.a());
      } else {
         return cax.b;
      }
   }

   @Override
   public Optional<ajv> X_() {
      return this.b.k();
   }
}
