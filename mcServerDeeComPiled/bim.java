import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bim extends bip {
   private final bce a;
   private final Predicate<bce> b;
   @Nullable
   private bce c;
   private final double d;
   private final blc e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public bim(bce $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.D();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
      if (!($$0.D() instanceof blb) && !($$0.D() instanceof bla)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean a() {
      List<bce> $$0 = this.a.s.a(bce.class, this.a.cy().g((double)this.i), this.b);
      if (!$$0.isEmpty()) {
         for(bce $$1 : $$0) {
            if (!$$1.bX()) {
               this.c = $$1;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean b() {
      return this.c != null && !this.e.l() && this.a.f(this.c) > (double)(this.g * this.g);
   }

   @Override
   public void c() {
      this.f = 0;
      this.h = this.a.a(dqh.j);
      this.a.a(dqh.j, 0.0F);
   }

   @Override
   public void d() {
      this.c = null;
      this.e.n();
      this.a.a(dqh.j, this.h);
   }

   @Override
   public void e() {
      if (this.c != null && !this.a.fy()) {
         this.a.z().a(this.c, 10.0F, (float)this.a.U());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.df() - this.c.df();
            double $$1 = this.a.dh() - this.c.dh();
            double $$2 = this.a.dl() - this.c.dl();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= (double)(this.g * this.g))) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               bhr $$4 = this.c.z();
               if ($$3 <= (double)this.g || $$4.e() == this.a.df() && $$4.f() == this.a.dh() && $$4.g() == this.a.dl()) {
                  double $$5 = this.c.df() - this.a.df();
                  double $$6 = this.c.dl() - this.a.dl();
                  this.e.a(this.a.df() - $$5, this.a.dh(), this.a.dl() - $$6, this.d);
               }

            }
         }
      }
   }
}
