import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class xf implements tc<tf> {
   private final boolean a;
   private final Map<abb, af.a> b;
   private final Set<abb> c;
   private final Map<abb, ah> d;

   public xf(boolean $$0, Collection<af> $$1, Set<abb> $$2, Map<abb, ah> $$3) {
      this.a = $$0;
      Builder<abb, af.a> $$4 = ImmutableMap.builder();

      for(af $$5 : $$1) {
         $$4.put($$5.h(), $$5.a());
      }

      this.b = $$4.build();
      this.c = ImmutableSet.copyOf($$2);
      this.d = ImmutableMap.copyOf($$3);
   }

   public xf(qx $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.a(qx::r, af.a::b);
      this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, qx::r);
      this.d = $$0.a(qx::r, ah::b);
   }

   @Override
   public void a(qx $$0) {
      $$0.writeBoolean(this.a);
      $$0.a(this.b, qx::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c, qx::a);
      $$0.a(this.d, qx::a, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public Map<abb, af.a> b() {
      return this.b;
   }

   public Set<abb> c() {
      return this.c;
   }

   public Map<abb, ah> d() {
      return this.d;
   }

   public boolean e() {
      return this.a;
   }
}
