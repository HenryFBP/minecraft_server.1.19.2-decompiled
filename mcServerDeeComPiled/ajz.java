import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class ajz {
   protected final Set<abb> a = Sets.newHashSet();
   protected final Set<abb> b = Sets.newHashSet();
   private final aka c = new aka();

   public void a(ajz $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cdp<?> $$0) {
      if (!$$0.T_()) {
         this.a($$0.f());
      }

   }

   protected void a(abb $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cdp<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.f());
   }

   public boolean b(abb $$0) {
      return this.a.contains($$0);
   }

   public void c(cdp<?> $$0) {
      this.c($$0.f());
   }

   protected void c(abb $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cdp<?> $$0) {
      return this.b.contains($$0.f());
   }

   public void e(cdp<?> $$0) {
      this.b.remove($$0.f());
   }

   public void f(cdp<?> $$0) {
      this.d($$0.f());
   }

   protected void d(abb $$0) {
      this.b.add($$0);
   }

   public boolean a(bxw $$0) {
      return this.c.a($$0);
   }

   public void a(bxw $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(bxv<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(bxw $$0) {
      return this.c.b($$0);
   }

   public void b(bxw $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aka $$0) {
      this.c.a($$0);
   }

   public aka a() {
      return this.c.a();
   }

   public void a(bxw $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
