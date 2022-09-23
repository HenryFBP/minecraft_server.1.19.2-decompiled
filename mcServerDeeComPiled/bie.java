import java.util.EnumSet;

public class bie extends bip {
   private final bce a;
   private final cgx b;

   public bie(bce $$0, cgx $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bip.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.am || this.a.al;
      if ($$0 && this.a.ad().a(akn.f)) {
         gt $$1 = this.a.da().b();
         cvo $$2 = this.b.a_($$1);
         return $$2.a(cju.pn) || $$2.k(this.b, $$1) == dxg.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      this.a.C().a();
   }
}
