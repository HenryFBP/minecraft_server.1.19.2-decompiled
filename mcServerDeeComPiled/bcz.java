import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bcz {
   private final bcy a;
   private final Map<bdb.a, Set<bdb>> b = Maps.newEnumMap(bdb.a.class);
   private final Map<UUID, bdb> c = new Object2ObjectArrayMap();
   private final Set<bdb> d = new ObjectArraySet();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<bcz> h;

   public bcz(bcy $$0, Consumer<bcz> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a();
   }

   public bcy a() {
      return this.a;
   }

   public double b() {
      return this.e;
   }

   public void a(double $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.d();
      }
   }

   public Set<bdb> a(bdb.a $$0) {
      return (Set<bdb>)this.b.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
   }

   public Set<bdb> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   @Nullable
   public bdb a(UUID $$0) {
      return (bdb)this.c.get($$0);
   }

   public boolean a(bdb $$0) {
      return this.c.get($$0.a()) != null;
   }

   private void e(bdb $$0) {
      bdb $$1 = (bdb)this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).add($$0);
         this.d();
      }
   }

   public void b(bdb $$0) {
      this.e($$0);
   }

   public void c(bdb $$0) {
      this.e($$0);
      this.d.add($$0);
   }

   protected void d() {
      this.f = true;
      this.h.accept(this);
   }

   public void d(bdb $$0) {
      this.a($$0.c()).remove($$0);
      this.c.remove($$0.a());
      this.d.remove($$0);
      this.d();
   }

   public void b(UUID $$0) {
      bdb $$1 = this.a($$0);
      if ($$1 != null) {
         this.d($$1);
      }

   }

   public boolean c(UUID $$0) {
      bdb $$1 = this.a($$0);
      if ($$1 != null && this.d.contains($$1)) {
         this.d($$1);
         return true;
      } else {
         return false;
      }
   }

   public void e() {
      for(bdb $$0 : this.c()) {
         this.d($$0);
      }

   }

   public double f() {
      if (this.f) {
         this.g = this.h();
         this.f = false;
      }

      return this.g;
   }

   private double h() {
      double $$0 = this.b();

      for(bdb $$1 : this.b(bdb.a.a)) {
         $$0 += $$1.d();
      }

      double $$2 = $$0;

      for(bdb $$3 : this.b(bdb.a.b)) {
         $$2 += $$0 * $$3.d();
      }

      for(bdb $$4 : this.b(bdb.a.c)) {
         $$2 *= 1.0 + $$4.d();
      }

      return this.a.a($$2);
   }

   private Collection<bdb> b(bdb.a $$0) {
      return (Collection<bdb>)this.b.getOrDefault($$0, Collections.emptySet());
   }

   public void a(bcz $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.addAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).addAll($$1));
      this.d();
   }

   public pj g() {
      pj $$0 = new pj();
      $$0.a("Name", hm.ak.b(this.a).toString());
      $$0.a("Base", this.e);
      if (!this.d.isEmpty()) {
         pp $$1 = new pp();

         for(bdb $$2 : this.d) {
            $$1.add($$2.e());
         }

         $$0.a("Modifiers", (qc)$$1);
      }

      return $$0;
   }

   public void a(pj $$0) {
      this.e = $$0.k("Base");
      if ($$0.b("Modifiers", 9)) {
         pp $$1 = $$0.c("Modifiers", 10);

         for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            bdb $$3 = bdb.a($$1.a($$2));
            if ($$3 != null) {
               this.c.put($$3.a(), $$3);
               this.a($$3.c()).add($$3);
               this.d.add($$3);
            }
         }
      }

      this.d();
   }
}
