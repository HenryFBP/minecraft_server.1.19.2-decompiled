import java.util.EnumSet;
import javax.annotation.Nullable;

public class bjn extends bip {
   private final bce a;
   private final bru b;
   @Nullable
   private bcc c;
   private int d = -1;
   private final double e;
   private int f;
   private final int g;
   private final int h;
   private final float i;
   private final float j;

   public bjn(bru $$0, double $$1, int $$2, float $$3) {
      this($$0, $$1, $$2, $$2, $$3);
   }

   public bjn(bru $$0, double $$1, int $$2, int $$3, float $$4) {
      if (!($$0 instanceof bcc)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.b = $$0;
         this.a = (bce)$$0;
         this.e = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
         this.j = $$4 * $$4;
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }
   }

   @Override
   public boolean a() {
      bcc $$0 = this.a.G();
      if ($$0 != null && $$0.bo()) {
         this.c = $$0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b() {
      return this.a() || this.c.bo() && !this.a.D().l();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
      this.d = -1;
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      double $$0 = this.a.h(this.c.df(), this.c.dh(), this.c.dl());
      boolean $$1 = this.a.E().a(this.c);
      if ($$1) {
         ++this.f;
      } else {
         this.f = 0;
      }

      if (!($$0 > (double)this.j) && this.f >= 5) {
         this.a.D().n();
      } else {
         this.a.D().a(this.c, this.e);
      }

      this.a.z().a(this.c, 30.0F, 30.0F);
      if (--this.d == 0) {
         if (!$$1) {
            return;
         }

         float $$2 = (float)Math.sqrt($$0) / this.i;
         float $$3 = ami.a($$2, 0.1F, 1.0F);
         this.b.a(this.c, $$3);
         this.d = ami.d($$2 * (float)(this.h - this.g) + (float)this.g);
      } else if (this.d < 0) {
         this.d = ami.b(ami.d(Math.sqrt($$0) / (double)this.i, (double)this.g, (double)this.h));
      }

   }
}
