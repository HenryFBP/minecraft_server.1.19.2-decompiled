import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class fq implements fj {
   private final fp a;
   private final fp b;
   private final fp c;

   public fq(fp $$0, fp $$1, fp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public dwq a(dr $$0) {
      dwq $$1 = $$0.e();
      return new dwq(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public dwp b(dr $$0) {
      dwp $$1 = $$0.l();
      return new dwp((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
   }

   @Override
   public boolean a() {
      return this.a.a();
   }

   @Override
   public boolean b() {
      return this.b.a();
   }

   @Override
   public boolean c() {
      return this.c.a();
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof fq)) {
         return false;
      } else {
         fq $$1 = (fq)$$0;
         if (!this.a.equals($$1.a)) {
            return false;
         } else {
            return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
         }
      }
   }

   public static fq a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      fp $$2 = fp.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fp $$3 = fp.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fp $$4 = fp.a($$0);
            return new fq($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw fo.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw fo.a.createWithContext($$0);
      }
   }

   public static fq a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      fp $$3 = fp.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fp $$4 = fp.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fp $$5 = fp.a($$0, $$1);
            return new fq($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw fo.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw fo.a.createWithContext($$0);
      }
   }

   public static fq a(double $$0, double $$1, double $$2) {
      return new fq(new fp(false, $$0), new fp(false, $$1), new fp(false, $$2));
   }

   public static fq a(dwp $$0) {
      return new fq(new fp(false, (double)$$0.i), new fp(false, (double)$$0.j), new fp(true, 0.0));
   }

   public static fq d() {
      return new fq(new fp(true, 0.0), new fp(true, 0.0), new fp(true, 0.0));
   }

   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
