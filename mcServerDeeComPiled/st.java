import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class st implements rr {
   private static final Logger c = LogUtils.getLogger();
   private final boolean d;
   private final Optional<rq> e;
   private final String f;
   private final so g;
   @Nullable
   protected final eh.g b;

   public st(String $$0, boolean $$1, Optional<rq> $$2, so $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private st(String $$0, @Nullable eh.g $$1, boolean $$2, Optional<rq> $$3, so $$4) {
      this.f = $$0;
      this.b = $$1;
      this.d = $$2;
      this.e = $$3;
      this.g = $$4;
   }

   @Nullable
   private static eh.g a(String $$0) {
      try {
         return new eh().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public String a() {
      return this.f;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<rq> c() {
      return this.e;
   }

   public so d() {
      return this.g;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof st $$1 && this.g.equals($$1.g) && this.e.equals($$1.e) && this.d == $$1.d && this.f.equals($$1.f)) {
            return true;
         }

         return false;
      }
   }

   public int hashCode() {
      int $$0 = this.d ? 1 : 0;
      $$0 = 31 * $$0 + this.e.hashCode();
      $$0 = 31 * $$0 + this.f.hashCode();
      return 31 * $$0 + this.g.hashCode();
   }

   public String toString() {
      return "nbt{" + this.g + ", interpreting=" + this.d + ", separator=" + this.e + "}";
   }

   @Override
   public sb a(@Nullable dr $$0, @Nullable bbn $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.b != null) {
         Stream<String> $$3 = this.g.getData($$0).flatMap($$0x -> {
            try {
               return this.b.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(qc::e_);
         if (this.d) {
            rq $$4 = (rq)DataFixUtils.orElse(rs.a($$0, this.e, $$1, $$2), rs.c);
            return (sb)$$3.flatMap($$3x -> {
               try {
                  sb $$4 = rq.a.a($$3x);
                  return Stream.of(rs.a($$0, $$4, $$1, $$2));
               } catch (Exception var5x) {
                  c.warn("Failed to parse component: {}", $$3x, var5x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$4).b($$2x)).orElseGet(rq::h);
         } else {
            return (sb)rs.a($$0, this.e, $$1, $$2)
               .map($$1x -> (sb)$$3.map(rq::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(rq::h))
               .orElseGet(() -> rq.b((String)$$3.collect(Collectors.joining(", "))));
         }
      } else {
         return rq.h();
      }
   }
}
