import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record sn(String a, @Nullable fj b) implements so {
   public sn(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static fj a(String $$0) {
      try {
         return fh.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<pj> getData(dr $$0) {
      if (this.b != null) {
         agg $$1 = $$0.f();
         gt $$2 = this.b.c($$0);
         if ($$1.o($$2)) {
            cti $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.m());
            }
         }
      }

      return Stream.empty();
   }

   public String toString() {
      return "block=" + this.a;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof sn $$1 && this.a.equals($$1.a)) {
            return true;
         }

         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }
}
