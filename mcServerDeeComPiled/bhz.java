import java.util.function.Predicate;

public class bhz extends big {
   private static final int g = 240;
   private final Predicate<bag> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bhz(bce $$0, Predicate<bag> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bhz(bce $$0, int $$1, Predicate<bag> $$2) {
      this($$0, $$2);
      this.c = $$1;
   }

   protected int f() {
      return Math.max(240, this.c);
   }

   @Override
   public boolean a() {
      if (!super.a()) {
         return false;
      } else if (!this.d.s.W().b(cgt.c)) {
         return false;
      } else {
         return this.a(this.d.s.ag()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.cY(), 2.0) && this.a(this.d.s.ag());
   }

   @Override
   public void d() {
      super.d();
      this.d.s.a(this.d.ae(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.dQ().a(20) == 0) {
         this.d.s.c(1019, this.e, 0);
         if (!this.d.aF) {
            this.d.a(this.d.eU());
         }
      }

      ++this.a;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.s.a(this.d.ae(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.s.ag())) {
         this.d.s.a(this.e, false);
         this.d.s.c(1021, this.e, 0);
         this.d.s.c(2001, this.e, cjt.i(this.d.s.a_(this.e)));
      }

   }

   private boolean a(bag $$0) {
      return this.h.test($$0);
   }
}
