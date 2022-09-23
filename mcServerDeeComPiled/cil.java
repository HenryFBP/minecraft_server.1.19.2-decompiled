import javax.annotation.Nullable;

public abstract class cil extends cjt {
   public static final int a = 3;
   public static final cwf b = cwe.r;

   protected cil(cvn.c $$0) {
      super($$0);
   }

   protected abstract Iterable<dwq> a(cvo var1);

   public static boolean b(cvo $$0) {
      return $$0.b(b) && ($$0.a(akl.ab) || $$0.a(akl.bb)) && $$0.c(b);
   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      if (!$$0.y && $$3.bH() && this.c($$1)) {
         a($$0, $$1, $$2.a(), true);
      }

   }

   protected boolean c(cvo $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(b)) {
         this.a($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cgx $$0, dwq $$1, amn $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(io.Y, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, ajw.cw, ajx.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(io.aC, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable buc $$0, cvo $$1, cgy $$2, gt $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cil) {
         ((cil)$$1.b())
            .a($$1)
            .forEach($$2x -> $$2.a(io.Y, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, ajw.cy, ajx.e, 1.0F, 1.0F);
      $$2.a($$0, czv.c, $$3);
   }

   private static void a(cgy $$0, cvo $$1, gt $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }
}
