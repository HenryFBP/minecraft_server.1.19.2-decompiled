import java.util.Optional;

public class yy implements tc<xm> {
   private final Optional<bbe> a;
   private final Optional<bbe> b;

   public yy(Optional<bbe> $$0, Optional<bbe> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public yy(qx $$0) {
      this.a = $$0.b((qx.a<bbe>)($$0x -> $$0x.a(hm.U)));
      this.b = $$0.b((qx.a<bbe>)($$0x -> $$0x.a(hm.U)));
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(hm.U, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(hm.U, $$1));
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public Optional<bbe> b() {
      return this.a;
   }

   public Optional<bbe> c() {
      return this.b;
   }
}
