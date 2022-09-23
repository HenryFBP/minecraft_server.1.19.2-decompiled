import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bdt extends bdo<bcc> {
   private final bku<Integer> a;

   public bdt(bku<Integer> $$0) {
      super(ImmutableMap.of($$0, bkv.a));
      this.a = $$0;
   }

   private Optional<Integer> a(bcc $$0) {
      return $$0.dy().c(this.a);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean b(agg $$0, bcc $$1, long $$2) {
      Optional<Integer> $$3 = this.a($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void d(agg $$0, bcc $$1, long $$2) {
      Optional<Integer> $$3 = this.a($$1);
      $$1.dy().a(this.a, $$3.get() - 1);
   }

   @Override
   protected void c(agg $$0, bcc $$1, long $$2) {
      $$1.dy().b(this.a);
   }
}
