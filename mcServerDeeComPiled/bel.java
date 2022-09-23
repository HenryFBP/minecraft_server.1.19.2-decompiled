import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class bel extends bdo<bcl> {
   private final float a;

   public bel(float $$0) {
      super(ImmutableMap.of(bku.m, bkv.b));
      this.a = $$0;
   }

   protected boolean a(agg $$0, bcl $$1) {
      return !$$0.g($$1.da());
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      gt $$3 = $$1.da();
      List<gt> $$4 = (List)gt.b($$3.b(-1, -1, -1), $$3.b(1, 1, 1)).map(gt::h).collect(Collectors.toList());
      Collections.shuffle($$4);
      Optional<gt> $$5 = $$4.stream().filter($$1x -> !$$0.g($$1x)).filter($$2x -> $$0.a($$2x, $$1)).filter($$2x -> $$0.g($$1)).findFirst();
      $$5.ifPresent($$1x -> $$1.dy().a(bku.m, new bkx($$1x, this.a, 0)));
   }
}
