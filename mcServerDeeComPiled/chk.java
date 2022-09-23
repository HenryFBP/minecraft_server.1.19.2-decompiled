import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class chk implements cgd, cgh {
   protected final int a;
   protected final int b;
   protected final cxj[][] c;
   protected boolean d;
   protected final cgx e;
   private final Supplier<hc<cht>> f;

   public chk(cgx $$0, gt $$1, gt $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.s().d(hm.aR).h(cia.b));
      this.a = hq.a($$1.u());
      this.b = hq.a($$1.w());
      int $$3 = hq.a($$2.u());
      int $$4 = hq.a($$2.w());
      this.c = new cxj[$$3 - this.a + 1][$$4 - this.b + 1];
      cxm $$5 = $$0.I();
      this.d = true;

      for(int $$6 = this.a; $$6 <= $$3; ++$$6) {
         for(int $$7 = this.b; $$7 <= $$4; ++$$7) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for(int $$8 = hq.a($$1.u()); $$8 <= hq.a($$2.u()); ++$$8) {
         for(int $$9 = hq.a($$1.w()); $$9 <= hq.a($$2.w()); ++$$9) {
            cxj $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }

   }

   private cxj d(gt $$0) {
      return this.a(hq.a($$0.u()), hq.a($$0.w()));
   }

   private cxj a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         cxj $$4 = this.c[$$2][$$3];
         return (cxj)($$4 != null ? $$4 : new cxp(this.e, new cge($$0, $$1), (hc<cht>)this.f.get()));
      } else {
         return new cxp(this.e, new cge($$0, $$1), (hc<cht>)this.f.get());
      }
   }

   @Override
   public cxe p_() {
      return this.e.p_();
   }

   @Override
   public cgd c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<dxj> b(@Nullable bbn $$0, dwl $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public cti c_(gt $$0) {
      cxj $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public cvo a_(gt $$0) {
      if (this.v($$0)) {
         return cju.a.m();
      } else {
         cxj $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public dpv b_(gt $$0) {
      if (this.v($$0)) {
         return dpw.a.h();
      } else {
         cxj $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int u_() {
      return this.e.u_();
   }

   @Override
   public int v_() {
      return this.e.v_();
   }

   public awz a() {
      return this.e.ac();
   }
}
