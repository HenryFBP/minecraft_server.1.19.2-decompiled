import java.util.List;
import javax.annotation.Nullable;

public class bik extends bip {
   private int a;
   private final bcl b;
   @Nullable
   private buc c;
   private bhy d;

   public bik(bcl $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<bvv> $$0 = this.b.s.a(bvv.class, this.b.cy().g(5.0));
      boolean $$1 = false;

      for(bvv $$2 : $$0) {
         bbn $$3 = $$2.cG();
         if ($$3 instanceof buc && (ami.e(((buc)$$3).bo) > 0.0F || ami.e(((buc)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ami.e(this.c.bo) > 0.0F || ami.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean D_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bI() && (ami.e(this.c.bo) > 0.0F || ami.e(this.c.bq) > 0.0F);
   }

   @Override
   public void c() {
      for(bvv $$1 : this.b.s.a(bvv.class, this.b.cy().g(5.0))) {
         if ($$1.cG() != null && $$1.cG() instanceof buc) {
            this.c = (buc)$$1.cG();
            break;
         }
      }

      this.a = 0;
      this.d = bhy.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ami.e(this.c.bo) > 0.0F || ami.e(this.c.bq) > 0.0F;
      float $$1 = this.d == bhy.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new dwq((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(bci.a, this.b.dd());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bhy.a) {
            gt $$2 = this.c.da().a(this.c.cv().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.D().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e(this.c) < 4.0F) {
               this.a = 0;
               this.d = bhy.b;
            }
         } else if (this.d == bhy.b) {
            gy $$3 = this.c.cw();
            gt $$4 = this.c.da().a($$3, 10);
            this.b.D().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e(this.c) > 12.0F) {
               this.a = 0;
               this.d = bhy.a;
            }
         }

      }
   }
}
