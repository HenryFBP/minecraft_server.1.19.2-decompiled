import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class dkn extends dkj {
   protected abstract int a(amn var1, gt var2);

   @Override
   public Stream<gt> a_(dkh $$0, amn $$1, gt $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
