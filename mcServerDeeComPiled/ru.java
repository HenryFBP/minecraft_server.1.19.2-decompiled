import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface ru {
   Optional<anf> a = Optional.of(anf.a);
   ru b = new ru() {
      @Override
      public <T> Optional<T> a(ru.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(ru.b<T> $$0, sj $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(ru.a<T> var1);

   <T> Optional<T> a(ru.b<T> var1, sj var2);

   static ru e(final String $$0) {
      return new ru() {
         @Override
         public <T> Optional<T> a(ru.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(ru.b<T> $$0x, sj $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static ru a(final String $$0, final sj $$1) {
      return new ru() {
         @Override
         public <T> Optional<T> a(ru.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(ru.b<T> $$0x, sj $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static ru a(ru... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static ru a(final List<? extends ru> $$0) {
      return new ru() {
         @Override
         public <T> Optional<T> a(ru.a<T> $$0x) {
            for(ru $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(ru.b<T> $$0x, sj $$1) {
            for(ru $$2 : $$0) {
               Optional<T> $$3 = $$2.a($$0, $$1);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            return Optional.empty();
         }
      };
   }

   default String getString() {
      StringBuilder $$0 = new StringBuilder();
      this.a((ru.a)($$1 -> {
         $$0.append($$1);
         return Optional.empty();
      }));
      return $$0.toString();
   }

   public interface a<T> {
      Optional<T> accept(String var1);
   }

   public interface b<T> {
      Optional<T> accept(sj var1, String var2);
   }
}
