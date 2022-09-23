import java.util.EnumSet;
import javax.annotation.Nullable;

public class bju extends bip {
   private static final int a = 10;
   private final bcl b;
   private final int c;
   @Nullable
   private gt d;

   public bju(bcl $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bip.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.bJ()) {
         return false;
      } else if (this.b.s.M()) {
         return false;
      } else if (this.b.dQ().a(this.c) != 0) {
         return false;
      } else {
         agg $$0 = (agg)this.b.s;
         gt $$1 = this.b.da();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            dwq $$2 = bmm.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(hq.a($$1x))));
            this.d = $$2 == null ? null : new gt($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.D().l() && this.b.D().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         blc $$0 = this.b.D();
         if ($$0.l() && !this.d.a(this.b.cY(), 10.0)) {
            dwq $$1 = dwq.c(this.d);
            dwq $$2 = this.b.cY();
            dwq $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            dwq $$4 = $$1.d($$2).d().a(10.0).e($$2);
            gt $$5 = new gt($$4);
            $$5 = this.b.s.a(dar.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }

      }
   }

   private void h() {
      amn $$0 = this.b.dQ();
      gt $$1 = this.b.s.a(dar.a.f, this.b.da().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.D().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
