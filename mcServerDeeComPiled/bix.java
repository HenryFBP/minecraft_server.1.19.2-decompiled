import java.util.EnumSet;
import javax.annotation.Nullable;

public class bix extends bip {
   public static final float a = 0.02F;
   protected final bce b;
   @Nullable
   protected bbn c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends bcc> f;
   protected final bmf g;

   public bix(bce $$0, Class<? extends bcc> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public bix(bce $$0, Class<? extends bcc> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public bix(bce $$0, Class<? extends bcc> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(bip.a.b));
      if ($$1 == buc.class) {
         this.g = bmf.b().a((double)$$2).a($$1x -> bbq.b($$0).test($$1x));
      } else {
         this.g = bmf.b().a((double)$$2);
      }

   }

   @Override
   public boolean a() {
      if (this.b.dQ().i() >= this.e) {
         return false;
      } else {
         if (this.b.G() != null) {
            this.c = this.b.G();
         }

         if (this.f == buc.class) {
            this.c = this.b.s.a(this.g, this.b, this.b.df(), this.b.dj(), this.b.dl());
         } else {
            this.c = this.b
               .s
               .a(this.b.s.a(this.f, this.b.cy().c((double)this.d, 3.0, (double)this.d), $$0 -> true), this.g, this.b, this.b.df(), this.b.dj(), this.b.dl());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      if (!this.c.bo()) {
         return false;
      } else if (this.b.f(this.c) > (double)(this.d * this.d)) {
         return false;
      } else {
         return this.h > 0;
      }
   }

   @Override
   public void c() {
      this.h = this.a(40 + this.b.dQ().a(40));
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      if (this.c.bo()) {
         double $$0 = this.i ? this.b.dj() : this.c.dj();
         this.b.z().a(this.c.df(), $$0, this.c.dl());
         --this.h;
      }
   }
}
