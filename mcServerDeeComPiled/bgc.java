import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class bgc extends bdo<bcc> {
   private final int a;
   private final BiPredicate<bcc, bcc> d;

   public bgc(int $$0, BiPredicate<bcc, bcc> $$1) {
      super(ImmutableMap.of(bku.o, bkv.a, bku.Z, bkv.c, bku.ag, bkv.b, bku.ah, bkv.c));
      this.a = $$0;
      this.d = $$1;
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      return this.a($$1).eg();
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      bcc $$3 = this.a($$1);
      if (this.d.test($$1, $$3)) {
         $$1.dy().a(bku.ah, true, (long)this.a);
      }

      $$1.dy().a(bku.ag, $$3.da(), (long)this.a);
      if ($$3.ad() != bbr.bn || $$0.W().b(cgt.I)) {
         $$1.dy().b(bku.o);
         $$1.dy().b(bku.Z);
      }

   }

   private bcc a(bcc $$0) {
      return (bcc)$$0.dy().c(bku.o).get();
   }
}
