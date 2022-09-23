import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class sv implements rr {
   private static final Logger c = LogUtils.getLogger();
   private final String d;
   @Nullable
   private final fz e;
   protected final Optional<rq> b;

   public sv(String $$0, Optional<rq> $$1) {
      this.d = $$0;
      this.b = $$1;
      this.e = a($$0);
   }

   @Nullable
   private static fz a(String $$0) {
      fz $$1 = null;

      try {
         ga $$2 = new ga(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         c.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   public String a() {
      return this.d;
   }

   @Nullable
   public fz b() {
      return this.e;
   }

   public Optional<rq> c() {
      return this.b;
   }

   @Override
   public sb a(@Nullable dr $$0, @Nullable bbn $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.e != null) {
         Optional<? extends rq> $$3 = rs.a($$0, this.b, $$1, $$2);
         return rs.a(this.e.b($$0), $$3, bbn::C_);
      } else {
         return rq.h();
      }
   }

   @Override
   public <T> Optional<T> a(ru.b<T> $$0, sj $$1) {
      return $$0.accept($$1, this.d);
   }

   @Override
   public <T> Optional<T> a(ru.a<T> $$0) {
      return $$0.accept(this.d);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof sv $$1 && this.d.equals($$1.d) && this.b.equals($$1.b)) {
            return true;
         }

         return false;
      }
   }

   public int hashCode() {
      int $$0 = this.d.hashCode();
      return 31 * $$0 + this.b.hashCode();
   }

   public String toString() {
      return "pattern{" + this.d + "}";
   }
}
