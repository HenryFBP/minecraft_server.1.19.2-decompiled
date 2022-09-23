import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ahy {
   private final Set<aia> a;
   private Map<String, ahw> b = ImmutableMap.of();
   private List<ahw> c = ImmutableList.of();
   private final ahw.a d;

   public ahy(ahw.a $$0, aia... $$1) {
      this.d = $$0;
      this.a = ImmutableSet.copyOf($$1);
   }

   public ahy(ahm $$0, aia... $$1) {
      this(($$1x, $$2, $$3, $$4, $$5, $$6, $$7) -> new ahw($$1x, $$2, $$3, $$4, $$5, $$0, $$6, $$7), $$1);
   }

   public void a() {
      List<String> $$0 = (List)this.c.stream().map(ahw::e).collect(ImmutableList.toImmutableList());
      this.b = this.g();
      this.c = this.b($$0);
   }

   private Map<String, ahw> g() {
      Map<String, ahw> $$0 = Maps.newTreeMap();

      for(aia $$1 : this.a) {
         $$1.a($$1x -> $$0.put($$1x.e(), $$1x), this.d);
      }

      return ImmutableMap.copyOf($$0);
   }

   public void a(Collection<String> $$0) {
      this.c = this.b($$0);
   }

   private List<ahw> b(Collection<String> $$0) {
      List<ahw> $$1 = (List)this.c($$0).collect(Collectors.toList());

      for(ahw $$2 : this.b.values()) {
         if ($$2.f() && !$$1.contains($$2)) {
            $$2.h().a($$1, $$2, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf($$1);
   }

   private Stream<ahw> c(Collection<String> $$0) {
      return $$0.stream().map(this.b::get).filter(Objects::nonNull);
   }

   public Collection<String> b() {
      return this.b.keySet();
   }

   public Collection<ahw> c() {
      return this.b.values();
   }

   public Collection<String> d() {
      return (Collection<String>)this.c.stream().map(ahw::e).collect(ImmutableSet.toImmutableSet());
   }

   public Collection<ahw> e() {
      return this.c;
   }

   @Nullable
   public ahw a(String $$0) {
      return (ahw)this.b.get($$0);
   }

   public boolean b(String $$0) {
      return this.b.containsKey($$0);
   }

   public List<ahl> f() {
      return (List<ahl>)this.c.stream().map(ahw::d).collect(ImmutableList.toImmutableList());
   }
}
