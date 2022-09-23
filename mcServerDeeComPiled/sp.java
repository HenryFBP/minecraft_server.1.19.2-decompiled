import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record sp(String a, @Nullable fz b) implements so {
   public sp(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static fz a(String $$0) {
      try {
         ga $$1 = new ga(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<pj> getData(dr $$0) throws CommandSyntaxException {
      if (this.b != null) {
         List<? extends bbn> $$1 = this.b.b($$0);
         return $$1.stream().map(cl::b);
      } else {
         return Stream.empty();
      }
   }

   public String toString() {
      return "entity=" + this.a;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof sp $$1 && this.a.equals($$1.a)) {
            return true;
         }

         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }
}
