import java.util.function.Function;
import javax.annotation.Nullable;

public class tn implements tc<tf> {
   private final gt a;
   private final ctk<?> b;
   @Nullable
   private final pj c;

   public static tn a(cti $$0, Function<cti, pj> $$1) {
      return new tn($$0.p(), $$0.v(), (pj)$$1.apply($$0));
   }

   public static tn a(cti $$0) {
      return a($$0, cti::aa_);
   }

   private tn(gt $$0, ctk<?> $$1, pj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f() ? null : $$2;
   }

   public tn(qx $$0) {
      this.a = $$0.f();
      this.b = $$0.a(hm.ab);
      this.c = $$0.n();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.a(hm.ab, this.b);
      $$0.a(this.c);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public gt b() {
      return this.a;
   }

   public ctk<?> c() {
      return this.b;
   }

   @Nullable
   public pj d() {
      return this.c;
   }
}
