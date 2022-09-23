import java.util.Optional;

public class bdy implements bfc {
   private final bbn a;
   private final boolean b;

   public bdy(bbn $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dwq a() {
      return this.b ? this.a.cY().b(0.0, (double)this.a.cA(), 0.0) : this.a.cY();
   }

   @Override
   public gt b() {
      return this.a.da();
   }

   @Override
   public boolean a(bcc $$0) {
      bbn $$3 = this.a;
      if ($$3 instanceof bcc $$1) {
         if (!$$1.bo()) {
            return false;
         } else {
            Optional<bkw> $$3 = $$0.dy().c(bku.h);
            return $$3.isPresent() && ((bkw)$$3.get()).a($$1);
         }
      } else {
         return true;
      }
   }

   public bbn c() {
      return this.a;
   }

   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
