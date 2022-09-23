import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fu implements Predicate<cax> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> rq.a("arguments.item.overstacked", $$0, $$1));
   private final hc<cat> b;
   @Nullable
   private final pj c;

   public fu(hc<cat> $$0, @Nullable pj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cat a() {
      return this.b.a();
   }

   public boolean a(cax $$0) {
      return $$0.a(this.b) && pv.a(this.c, $$0.u(), true);
   }

   public cax a(int $$0, boolean $$1) throws CommandSyntaxException {
      cax $$2 = new cax(this.b, $$0);
      if (this.c != null) {
         $$2.c(this.c);
      }

      if ($$1 && $$0 > $$2.f()) {
         throw a.create(this.c(), $$2.f());
      } else {
         return $$2;
      }
   }

   public String b() {
      StringBuilder $$0 = new StringBuilder(this.c());
      if (this.c != null) {
         $$0.append(this.c);
      }

      return $$0.toString();
   }

   private String c() {
      return this.b.e().map(aba::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
