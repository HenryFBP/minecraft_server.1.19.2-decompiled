import java.util.Optional;

public final class dl {
   private final hn a;
   dl.a b = dl.a.c;

   public dl(hn $$0) {
      this.a = $$0;
   }

   public void a(dl.a $$0) {
      this.b = $$0;
   }

   public <T> hd<T> a(aba<? extends hm<T>> $$0) {
      return new hd.a<T>(this.a.d($$0)) {
         @Override
         public Optional<? extends he<T>> a(akz<T> $$0) {
            return switch(dl.this.b) {
               case c -> this.b.c($$0);
               case a -> Optional.of(this.b.b($$0));
               case b -> {
                  Optional<? extends he<T>> $$1 = this.b.c($$0);
                  yield Optional.of($$1.isPresent() ? (he)$$1.get() : he.a());
               }
               default -> throw new IncompatibleClassChangeError();
            };
         }
      };
   }

   public static enum a {
      a,
      b,
      c;
   }
}
