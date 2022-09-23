import java.util.List;

public class bkn<T extends bce & bcj> extends bip {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public bkn(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean a() {
      return this.b.s.W().b(cgt.J) && this.h();
   }

   private boolean h() {
      return this.b.dR() != null && this.b.dR().ad() == bbr.bn && this.b.dS() > this.d;
   }

   @Override
   public void c() {
      this.d = this.b.dS();
      this.b.J_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bcj)$$0).forEach(bcj::J_);
      }

      super.c();
   }

   private List<? extends bce> i() {
      double $$0 = this.b.b(bdd.b);
      dwl $$1 = dwl.a(this.b.cY()).c($$0, 10.0, $$0);
      return this.b.s.a(this.b.getClass(), $$1, bbq.f);
   }
}
