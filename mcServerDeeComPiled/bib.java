import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bib extends bip {
   private static final bmf d = bmf.b().a(8.0).d();
   protected final bne a;
   private final Class<? extends bne> e;
   protected final cgx b;
   @Nullable
   protected bne c;
   private int f;
   private final double g;

   public bib(bne $$0, double $$1) {
      this($$0, $$1, $$0.getClass());
   }

   public bib(bne $$0, double $$1, Class<? extends bne> $$2) {
      this.a = $$0;
      this.b = $$0.s;
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.fP()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bo() && this.c.fP() && this.f < 60;
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.z().a(this.c, 10.0F, (float)this.a.U());
      this.a.D().a(this.c, this.g);
      ++this.f;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }

   }

   @Nullable
   private bne h() {
      List<? extends bne> $$0 = this.b.a(this.e, d, this.a, this.a.cy().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bne $$2 = null;

      for(bne $$3 : $$0) {
         if (this.a.a($$3) && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((agg)this.b, this.c);
   }
}
