import javax.annotation.Nullable;

public class bay extends bax {
   @Nullable
   private final bbn A;

   public bay(String $$0, bbn $$1, @Nullable bbn $$2) {
      super($$0, $$1);
      this.A = $$2;
   }

   @Nullable
   @Override
   public bbn l() {
      return this.z;
   }

   @Nullable
   @Override
   public bbn m() {
      return this.A;
   }

   @Override
   public rq a(bcc $$0) {
      rq $$1 = this.A == null ? this.z.C_() : this.A.C_();
      cax $$2 = this.A instanceof bcc ? ((bcc)this.A).ez() : cax.b;
      String $$3 = "death.attack." + this.y;
      String $$4 = $$3 + ".item";
      return !$$2.b() && $$2.z() ? rq.a($$4, $$0.C_(), $$1, $$2.I()) : rq.a($$3, $$0.C_(), $$1);
   }
}
