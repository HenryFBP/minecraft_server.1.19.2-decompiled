import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dlp<C extends dfx> {
   Optional<dlo<C>> createGenerator(dlp.a<C> var1);

   static <C extends dfx> dlp<C> simple(Predicate<dlp.a<C>> $$0, dlo<C> $$1) {
      Optional<dlo<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends dfx> Predicate<dlp.a<C>> checkForBiomeOnTop(dar.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public static record a<C extends dfx>(cxk a, chx b, dbf c, long d, cge e, C f, cgz g, Predicate<hc<cht>> h, dou i, hn j) {
      public boolean a(dar.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         hc<cht> $$4 = this.a.d().getNoiseBiome(hl.a($$1), hl.a($$3), hl.a($$2), this.c.c());
         return this.h.test($$4);
      }
   }
}
