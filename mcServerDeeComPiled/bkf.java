import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bkf extends bko {
   private final bnq a;
   @Nullable
   private bcc b;
   private final bmf c = bmf.a().a(64.0);

   public bkf(bnq $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bip.a.d));
   }

   @Override
   public boolean a() {
      dwl $$0 = this.a.cy().c(10.0, 8.0, 10.0);
      List<? extends bcc> $$1 = this.a.s.a(btp.class, this.c, this.a, $$0);
      List<buc> $$2 = this.a.s.a(this.c, this.a, $$0);

      for(bcc $$3 : $$1) {
         btp $$4 = (btp)$$3;

         for(buc $$5 : $$2) {
            int $$6 = $$4.f($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      if (this.b == null) {
         return false;
      } else {
         return !(this.b instanceof buc) || !this.b.B_() && !((buc)this.b).f();
      }
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
