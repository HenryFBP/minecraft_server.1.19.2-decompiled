import javax.annotation.Nullable;

public abstract class cuf extends ctc {
   public static final String d = "LootTable";
   public static final String e = "LootTableSeed";
   @Nullable
   protected abb g;
   protected long h;

   protected cuf(ctk<?> $$0, gt $$1, cvo $$2) {
      super($$0, $$1, $$2);
   }

   public static void a(cgd $$0, amn $$1, gt $$2, abb $$3) {
      cti $$4 = $$0.c_($$2);
      if ($$4 instanceof cuf) {
         ((cuf)$$4).a($$3, $$1.g());
      }

   }

   protected boolean d(pj $$0) {
      if ($$0.b("LootTable", 8)) {
         this.g = new abb($$0.l("LootTable"));
         this.h = $$0.i("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   protected boolean e(pj $$0) {
      if (this.g == null) {
         return false;
      } else {
         $$0.a("LootTable", this.g.toString());
         if (this.h != 0L) {
            $$0.a("LootTableSeed", this.h);
         }

         return true;
      }
   }

   public void e(@Nullable buc $$0) {
      if (this.g != null && this.n.n() != null) {
         dsg $$1 = this.n.n().aH().a(this.g);
         if ($$0 instanceof agh) {
            aj.N.a((agh)$$0, this.g);
         }

         this.g = null;
         dsd.a $$2 = new dsd.a((agg)this.n).a(dul.f, dwq.a(this.o)).a(this.h);
         if ($$0 != null) {
            $$2.a($$0.fX()).a(dul.a, $$0);
         }

         $$1.a(this, $$2.a(duk.b));
      }

   }

   public void a(abb $$0, long $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean c() {
      this.e(null);
      return this.f().stream().allMatch(cax::b);
   }

   @Override
   public cax a(int $$0) {
      this.e(null);
      return this.f().get($$0);
   }

   @Override
   public cax a(int $$0, int $$1) {
      this.e(null);
      cax $$2 = bad.a(this.f(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cax b(int $$0) {
      this.e(null);
      return bad.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cax $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.K() > this.O_()) {
         $$1.e(this.O_());
      }

      this.e();
   }

   @Override
   public boolean a(buc $$0) {
      if (this.n.c_(this.o) != this) {
         return false;
      } else {
         return !($$0.h((double)this.o.u() + 0.5, (double)this.o.v() + 0.5, (double)this.o.w() + 0.5) > 64.0);
      }
   }

   @Override
   public void a() {
      this.f().clear();
   }

   protected abstract hi<cax> f();

   protected abstract void a(hi<cax> var1);

   @Override
   public boolean d(buc $$0) {
      return super.d($$0) && (this.g == null || !$$0.B_());
   }

   @Nullable
   @Override
   public bwm createMenu(int $$0, bub $$1, buc $$2) {
      if (this.d($$2)) {
         this.e($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
