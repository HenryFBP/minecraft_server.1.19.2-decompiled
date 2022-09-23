import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bll extends bly<bcc> {
   private static final int a = 200;
   private static final int c = 600;

   public bll() {
      this(200);
   }

   public bll(int $$0) {
      super($$0);
   }

   @Override
   protected void a(agg $$0, bcc $$1) {
      a($$1);
   }

   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.g);
   }

   public static void a(bcc $$0) {
      Optional<List<bcc>> $$1 = $$0.dy().c(bku.g);
      if ($$1.isPresent()) {
         boolean $$2 = ((List)$$1.get()).stream().anyMatch($$0x -> $$0x.ad().equals(bbr.S));
         if ($$2) {
            b($$0);
         }

      }
   }

   public static void b(bcc $$0) {
      $$0.dy().a(bku.F, true, 600L);
   }
}
