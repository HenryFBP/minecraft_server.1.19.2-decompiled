import java.util.EnumSet;
import java.util.function.Predicate;

public class bih extends bip {
   private static final int a = 40;
   private static final Predicate<cvo> b = cvy.a(cju.bg);
   private final bce c;
   private final cgx d;
   private int e;

   public bih(bce $$0) {
      this.c = $$0;
      this.d = $$0.s;
      this.a(EnumSet.of(bip.a.a, bip.a.b, bip.a.c));
   }

   @Override
   public boolean a() {
      if (this.c.dQ().a(this.c.y_() ? 50 : 1000) != 0) {
         return false;
      } else {
         gt $$0 = this.c.da();
         if (b.test(this.d.a_($$0))) {
            return true;
         } else {
            return this.d.a_($$0.c()).a(cju.i);
         }
      }
   }

   @Override
   public void c() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.D().n();
   }

   @Override
   public void d() {
      this.e = 0;
   }

   @Override
   public boolean b() {
      return this.e > 0;
   }

   public int h() {
      return this.e;
   }

   @Override
   public void e() {
      this.e = Math.max(0, this.e - 1);
      if (this.e == this.a(4)) {
         gt $$0 = this.c.da();
         if (b.test(this.d.a_($$0))) {
            if (this.d.W().b(cgt.c)) {
               this.d.b($$0, false);
            }

            this.c.I();
         } else {
            gt $$1 = $$0.c();
            if (this.d.a_($$1).a(cju.i)) {
               if (this.d.W().b(cgt.c)) {
                  this.d.c(2001, $$1, cjt.i(cju.i.m()));
                  this.d.a($$1, cju.j.m(), 2);
               }

               this.c.I();
            }
         }

      }
   }
}
