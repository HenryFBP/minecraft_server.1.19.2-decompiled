import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dsl {
   private final Multimap<String, String> a;
   private final Supplier<String> b;
   private final duj c;
   private final Function<abb, dux> d;
   private final Set<abb> e;
   private final Function<abb, dsg> f;
   private final Set<abb> g;
   private String h;

   public dsl(duj $$0, Function<abb, dux> $$1, Function<abb, dsg> $$2) {
      this(HashMultimap.create(), () -> "", $$0, $$1, ImmutableSet.of(), $$2, ImmutableSet.of());
   }

   public dsl(Multimap<String, String> $$0, Supplier<String> $$1, duj $$2, Function<abb, dux> $$3, Set<abb> $$4, Function<abb, dsg> $$5, Set<abb> $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   private String b() {
      if (this.h == null) {
         this.h = (String)this.b.get();
      }

      return this.h;
   }

   public void a(String $$0) {
      this.a.put(this.b(), $$0);
   }

   public dsl b(String $$0) {
      return new dsl(this.a, () -> this.b() + $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dsl a(String $$0, abb $$1) {
      ImmutableSet<abb> $$2 = ImmutableSet.builder().addAll(this.g).add($$1).build();
      return new dsl(this.a, () -> this.b() + $$0, this.c, this.d, this.e, this.f, $$2);
   }

   public dsl b(String $$0, abb $$1) {
      ImmutableSet<abb> $$2 = ImmutableSet.builder().addAll(this.e).add($$1).build();
      return new dsl(this.a, () -> this.b() + $$0, this.c, this.d, $$2, this.f, this.g);
   }

   public boolean a(abb $$0) {
      return this.g.contains($$0);
   }

   public boolean b(abb $$0) {
      return this.e.contains($$0);
   }

   public Multimap<String, String> a() {
      return ImmutableMultimap.copyOf(this.a);
   }

   public void a(dse $$0) {
      this.c.a(this, $$0);
   }

   @Nullable
   public dsg c(abb $$0) {
      return (dsg)this.f.apply($$0);
   }

   @Nullable
   public dux d(abb $$0) {
      return (dux)this.d.apply($$0);
   }

   public dsl a(duj $$0) {
      return new dsl(this.a, this.b, $$0, this.d, this.e, this.f, this.g);
   }
}
