import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class vm implements tc<tf> {
   private final vm.a a;
   private final List<abb> b;
   private final List<abb> c;
   private final aka d;

   public vm(vm.a $$0, Collection<abb> $$1, Collection<abb> $$2, aka $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public vm(qx $$0) {
      this.a = $$0.a(vm.a.class);
      this.d = aka.a($$0);
      this.b = $$0.a(qx::r);
      if (this.a == vm.a.a) {
         this.c = $$0.a(qx::r);
      } else {
         this.c = ImmutableList.of();
      }

   }

   @Override
   public void a(qx $$0) {
      $$0.a((Enum<?>)this.a);
      this.d.b($$0);
      $$0.a(this.b, qx::a);
      if (this.a == vm.a.a) {
         $$0.a(this.c, qx::a);
      }

   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public List<abb> b() {
      return this.b;
   }

   public List<abb> c() {
      return this.c;
   }

   public aka d() {
      return this.d;
   }

   public vm.a e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
