import com.google.common.collect.ImmutableMap;

public class ber extends bdo<bce> {
   public static final int a = 100;
   private final azu d;
   private ajv e;

   public ber(azu $$0, ajv $$1) {
      super(ImmutableMap.of(bku.n, bkv.c, bku.R, bkv.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(agg $$0, bce $$1, long $$2) {
      return !$$1.aw();
   }

   protected void b(agg $$0, bce $$1, long $$2) {
      $$1.p(true);
      $$1.b(bco.g);
   }

   protected void c(agg $$0, bce $$1, long $$2) {
      if ($$1.aw()) {
         $$1.f($$1.dd().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, ajx.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bco.a);
      $$1.dy().b(bku.R);
      $$1.dy().a(bku.Q, this.d.a($$0.w));
   }
}
