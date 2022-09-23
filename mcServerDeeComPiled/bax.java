import javax.annotation.Nullable;

public class bax extends baw {
   protected final bbn z;
   private boolean A;

   public bax(String $$0, bbn $$1) {
      super($$0);
      this.z = $$1;
   }

   public bax F() {
      this.A = true;
      return this;
   }

   public boolean G() {
      return this.A;
   }

   @Override
   public bbn m() {
      return this.z;
   }

   @Override
   public rq a(bcc $$0) {
      cax $$1 = this.z instanceof bcc ? ((bcc)this.z).ez() : cax.b;
      String $$2 = "death.attack." + this.y;
      return !$$1.b() && $$1.z() ? rq.a($$2 + ".item", $$0.C_(), this.z.C_(), $$1.I()) : rq.a($$2, $$0.C_(), this.z.C_());
   }

   @Override
   public boolean y() {
      return this.z instanceof bcc && !(this.z instanceof buc);
   }

   @Nullable
   @Override
   public dwq E() {
      return this.z.cY();
   }

   @Override
   public String toString() {
      return "EntityDamageSource (" + this.z + ")";
   }
}
