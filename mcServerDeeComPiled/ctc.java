import javax.annotation.Nullable;

public abstract class ctc extends cti implements bac, bam, ban {
   private bal b = bal.a;
   private rq c;

   protected ctc(ctk<?> $$0, gt $$1, cvo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.b = bal.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.c = rq.a.a($$0.l("CustomName"));
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      this.b.a($$0);
      if (this.c != null) {
         $$0.a("CustomName", rq.a.a(this.c));
      }

   }

   public void a(rq $$0) {
      this.c = $$0;
   }

   @Override
   public rq X() {
      return this.c != null ? this.c : this.g();
   }

   @Override
   public rq C_() {
      return this.X();
   }

   @Nullable
   @Override
   public rq Z() {
      return this.c;
   }

   protected abstract rq g();

   public boolean d(buc $$0) {
      return a($$0, this.b, this.C_());
   }

   public static boolean a(buc $$0, bal $$1, rq $$2) {
      if (!$$0.B_() && !$$1.a($$0.ez())) {
         $$0.a(rq.a("container.isLocked", $$2), true);
         $$0.a(ajw.cY, ajx.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public bwm createMenu(int $$0, bub $$1, buc $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract bwm a(int var1, bub var2);
}
