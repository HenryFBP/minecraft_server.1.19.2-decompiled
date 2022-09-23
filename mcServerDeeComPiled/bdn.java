import com.google.common.collect.ImmutableMap;

public class bdn extends bdo<bcc> {
   private final int a;

   public bdn(bku<?> $$0, int $$1) {
      super(ImmutableMap.of(bku.o, bkv.c, bku.av, bkv.b, $$0, bkv.a));
      this.a = $$1;
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      $$1.dy().a(bku.av, true, (long)this.a);
      $$1.dy().b(bku.o);
   }
}
