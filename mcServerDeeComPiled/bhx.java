import java.util.EnumSet;
import javax.annotation.Nullable;

public class bhx extends bip {
   private final boh a;
   @Nullable
   private buc b;
   private final cgx c;
   private final float d;
   private int e;
   private final bmf f;

   public bhx(boh $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.s;
      this.d = $$1;
      this.f = bmf.b().a((double)$$1);
      this.a(EnumSet.of(bip.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bo()) {
         return false;
      } else if (this.a.f((bbn)this.b) > (double)(this.d * this.d)) {
         return false;
      } else {
         return this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.z(true);
      this.e = this.a(40 + this.a.dQ().a(40));
   }

   @Override
   public void d() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.z().a(this.b.df(), this.b.dj(), this.b.dl(), 10.0F, (float)this.a.U());
      --this.e;
   }

   private boolean a(buc $$0) {
      for(bai $$1 : bai.values()) {
         cax $$2 = $$0.b($$1);
         if (this.a.q() && $$2.a(caz.pI)) {
            return true;
         }

         if (this.a.n($$2)) {
            return true;
         }
      }

      return false;
   }
}
