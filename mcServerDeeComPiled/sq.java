import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class sq implements rr {
   private final String b;
   @Nullable
   private Supplier<rq> c;

   public sq(String $$0) {
      this.b = $$0;
   }

   private rq b() {
      if (this.c == null) {
         this.c = (Supplier)sr.a.apply(this.b);
      }

      return (rq)this.c.get();
   }

   @Override
   public <T> Optional<T> a(ru.a<T> $$0) {
      return this.b().a($$0);
   }

   @Override
   public <T> Optional<T> a(ru.b<T> $$0, sj $$1) {
      return this.b().a($$0, $$1);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof sq $$1 && this.b.equals($$1.b)) {
            return true;
         }

         return false;
      }
   }

   public int hashCode() {
      return this.b.hashCode();
   }

   public String toString() {
      return "keybind{" + this.b + "}";
   }

   public String a() {
      return this.b;
   }
}
