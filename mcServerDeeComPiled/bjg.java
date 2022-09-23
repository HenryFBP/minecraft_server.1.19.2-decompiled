import java.util.EnumSet;

public class bjg extends bip {
   private static final bmf b = bmf.b().a(6.0);
   public static final int a = 400;
   private final bnq c;
   private btp d;
   private int e;

   public bjg(bnq $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.s.M()) {
         return false;
      } else if (this.c.dQ().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.s.a(btp.class, b, this.c, this.c.df(), this.c.dh(), this.c.dl(), this.c.cy().c(6.0, 2.0, 6.0));
         return this.d != null;
      }
   }

   @Override
   public boolean b() {
      return this.e > 0;
   }

   @Override
   public void c() {
      this.e = this.a(400);
      this.c.v(true);
   }

   @Override
   public void d() {
      this.c.v(false);
      this.d = null;
   }

   @Override
   public void e() {
      this.c.z().a(this.d, 30.0F, 30.0F);
      --this.e;
   }
}
