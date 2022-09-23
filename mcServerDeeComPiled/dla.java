import java.util.Optional;

public abstract class dla extends dlb {
   private final dla.a d;
   private int e;
   private int f;

   protected dla(dla.a $$0, int $$1, int $$2, dlb.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dar.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dlt $$0, dlb.a $$1) {
      cge $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dlf construct(dbo var1, int var2, int var3);
   }
}
