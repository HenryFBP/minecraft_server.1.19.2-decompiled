import javax.annotation.Nullable;

public class ccx extends ccz {
   private final gt b;
   protected boolean a = true;

   public ccx(buc $$0, bai $$1, cax $$2, dwm $$3) {
      this($$0.s, $$0, $$1, $$2, $$3);
   }

   public ccx(ccz $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected ccx(cgx $$0, @Nullable buc $$1, bai $$2, cax $$3, dwm $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.a().a($$4.b());
      this.a = $$0.a_($$4.a()).a(this);
   }

   public static ccx a(ccx $$0, gt $$1, gy $$2) {
      return new ccx(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new dwm(
            new dwq(
               (double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5
            ),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public gt a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public gy d() {
      return gy.a(this.o())[0];
   }

   public gy e() {
      return gy.a(this.o(), gy.a.b);
   }

   public gy[] f() {
      gy[] $$0 = gy.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         gy $$1 = this.k();
         int $$2 = 0;

         while($$2 < $$0.length && $$0[$$2] != $$1.g()) {
            ++$$2;
         }

         if ($$2 > 0) {
            System.arraycopy($$0, 0, $$0, 1, $$2);
            $$0[0] = $$1.g();
         }

         return $$0;
      }
   }
}
