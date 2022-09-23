import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class bye extends bxm {
   private final cgx k;
   @Nullable
   private ceg s;
   private final List<ceg> t;

   public bye(int $$0, bub $$1) {
      this($$0, $$1, bwx.a);
   }

   public bye(int $$0, bub $$1, bwx $$2) {
      super(bxq.u, $$0, $$1, $$2);
      this.k = $$1.l.s;
      this.t = this.k.q().a(cds.g);
   }

   @Override
   protected boolean a(cvo $$0) {
      return $$0.a(cju.mM);
   }

   @Override
   protected boolean a(buc $$0, boolean $$1) {
      return this.s != null && this.s.a(this.p, this.k);
   }

   @Override
   protected void a(buc $$0, cax $$1) {
      $$1.a($$0.s, $$0, $$1.K());
      this.o.b($$0);
      this.e(0);
      this.e(1);
      this.q.a((BiConsumer<cgx, gt>)(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0)));
   }

   private void e(int $$0) {
      cax $$1 = this.p.a($$0);
      $$1.g(1);
      this.p.a($$0, $$1);
   }

   @Override
   public void l() {
      List<ceg> $$0 = this.k.q().b(cds.g, this.p, this.k);
      if ($$0.isEmpty()) {
         this.o.a(0, cax.b);
      } else {
         this.s = (ceg)$$0.get(0);
         cax $$1 = this.s.a(this.p);
         this.o.a(this.s);
         this.o.a(0, $$1);
      }

   }

   @Override
   protected boolean c(cax $$0) {
      return this.t.stream().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   public boolean a(cax $$0, byd $$1) {
      return $$1.d != this.o && super.a($$0, $$1);
   }
}
