import java.util.Objects;
import javax.annotation.Nullable;

public class akd<T> extends dxr {
   private final ake n;
   private final T o;
   private final akf<T> p;

   protected akd(akf<T> $$0, T $$1, ake $$2) {
      super(a($$0, $$1));
      this.p = $$0;
      this.n = $$2;
      this.o = $$1;
   }

   public static <T> String a(akf<T> $$0, T $$1) {
      return a(hm.an.b($$0)) + ":" + a($$0.a().b($$1));
   }

   private static <T> String a(@Nullable abb $$0) {
      return $$0.toString().replace(':', '.');
   }

   public akf<T> a() {
      return this.p;
   }

   public T b() {
      return this.o;
   }

   public String a(int $$0) {
      return this.n.format($$0);
   }

   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof akd && Objects.equals(this.d(), ((akd)$$0).d());
   }

   public int hashCode() {
      return this.d().hashCode();
   }

   public String toString() {
      return "Stat{name=" + this.d() + ", formatter=" + this.n + "}";
   }
}
