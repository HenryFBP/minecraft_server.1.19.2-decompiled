import java.util.stream.Stream;

public record sw(abb a) implements so {
   @Override
   public Stream<pj> getData(dr $$0) {
      pj $$1 = $$0.m().aG().a(this.a);
      return Stream.of($$1);
   }

   public String toString() {
      return "storage=" + this.a;
   }
}
