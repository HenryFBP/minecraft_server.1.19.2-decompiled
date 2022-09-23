import java.util.EnumSet;

public class bjk extends bip {
   private final bce a;
   private double b;
   private double c;
   private int d;

   public bjk(bce $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
   }

   @Override
   public boolean a() {
      return this.a.dQ().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = Math.PI * 2 * this.a.dQ().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dQ().a(20);
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      --this.d;
      this.a.z().a(this.a.df() + this.b, this.a.dj(), this.a.dl() + this.c);
   }
}
