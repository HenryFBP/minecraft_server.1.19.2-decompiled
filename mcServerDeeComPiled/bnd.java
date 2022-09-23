import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bnd extends bnb {
   @Nullable
   private bnd b;
   private int c = 1;

   public bnd(bbr<? extends bnd> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(5, new bil(this));
   }

   @Override
   public int fo() {
      return this.fL();
   }

   public int fL() {
      return super.fo();
   }

   @Override
   protected boolean fJ() {
      return !this.fM();
   }

   public boolean fM() {
      return this.b != null && this.b.bo();
   }

   public bnd a(bnd $$0) {
      this.b = $$0;
      $$0.fS();
      return $$0;
   }

   public void fN() {
      this.b.fT();
      this.b = null;
   }

   private void fS() {
      ++this.c;
   }

   private void fT() {
      --this.c;
   }

   public boolean fO() {
      return this.fP() && this.c < this.fL();
   }

   @Override
   public void k() {
      super.k();
      if (this.fP() && this.s.w.a(200) == 1) {
         List<? extends bnb> $$0 = this.s.a(this.getClass(), this.cy().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }

   }

   public boolean fP() {
      return this.c > 1;
   }

   public boolean fQ() {
      return this.f(this.b) <= 121.0;
   }

   public void fR() {
      if (this.fM()) {
         this.D().a(this.b, 1.0);
      }

   }

   public void a(Stream<? extends bnd> $$0) {
      $$0.limit((long)(this.fL() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bnd.a(this);
      } else {
         this.a(((bnd.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bcu {
      public final bnd a;

      public a(bnd $$0) {
         this.a = $$0;
      }
   }
}
