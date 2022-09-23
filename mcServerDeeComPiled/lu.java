import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public abstract class lu<T> implements iz {
   private static final Logger c = LogUtils.getLogger();
   protected final iy.a d;
   protected final hm<T> e;
   private final Map<abb, akw> f = Maps.newLinkedHashMap();

   protected lu(iy $$0, hm<T> $$1) {
      this.d = $$0.a(iy.b.a, alb.a($$1.n()));
      this.e = $$1;
   }

   @Override
   public final String a() {
      return "Tags for " + this.e.n().a();
   }

   protected abstract void b();

   @Override
   public void a(ix $$0) {
      this.f.clear();
      this.b();
      this.f
         .forEach(
            ($$1, $$2) -> {
               List<akx> $$3 = $$2.b();
               List<akx> $$4 = $$3.stream().filter($$0xx -> !$$0xx.a(this.e::c, this.f::containsKey)).toList();
               if (!$$4.isEmpty()) {
                  throw new IllegalArgumentException(
                     String.format(
                        Locale.ROOT,
                        "Couldn't define tag %s as it is missing following references: %s",
                        $$1,
                        $$4.stream().map(Objects::toString).collect(Collectors.joining(","))
                     )
                  );
               } else {
                  JsonElement $$5 = (JsonElement)aky.a.encodeStart(JsonOps.INSTANCE, new aky($$3, false)).getOrThrow(false, c::error);
                  Path $$6 = this.d.a($$1);
      
                  try {
                     iz.a($$0, $$5, $$6);
                  } catch (IOException var9) {
                     c.error("Couldn't save tags to {}", $$6, var9);
                  }
      
               }
            }
         );
   }

   protected lu.a<T> a(akz<T> $$0) {
      akw $$1 = this.b($$0);
      return new lu.a<>($$1, this.e);
   }

   protected akw b(akz<T> $$0) {
      return (akw)this.f.computeIfAbsent($$0.b(), $$0x -> akw.a());
   }

   protected static class a<T> {
      private final akw a;
      private final hm<T> b;

      a(akw $$0, hm<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public lu.a<T> a(T $$0) {
         this.a.a(this.b.b($$0));
         return this;
      }

      @SafeVarargs
      public final lu.a<T> a(aba<T>... $$0) {
         for(aba<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public lu.a<T> a(abb $$0) {
         this.a.b($$0);
         return this;
      }

      public lu.a<T> a(akz<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public lu.a<T> b(abb $$0) {
         this.a.d($$0);
         return this;
      }

      @SafeVarargs
      public final lu.a<T> a(T... $$0) {
         Stream.of($$0).map(this.b::b).forEach($$0x -> this.a.a($$0x));
         return this;
      }
   }
}
