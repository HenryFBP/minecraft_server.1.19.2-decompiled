import com.mojang.serialization.Codec;
import java.util.Optional;

public class dmt extends dlb {
   public static final Codec<dmt> d = a(dmt::new);

   public dmt(dlb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      return a($$0, dar.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dlt $$0, dlb.a $$1) {
      cge $$2 = $$1.h();
      dbo $$3 = $$1.f();
      gt $$4 = new gt($$2.d(), 90, $$2.e());
      cpw $$5 = cpw.a($$3);
      dms.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dlk<?> e() {
      return dlk.e;
   }
}
