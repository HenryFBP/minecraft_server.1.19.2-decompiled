import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bda {
   private static final Logger a = LogUtils.getLogger();
   private final Map<bcy, bcz> b = Maps.newHashMap();
   private final Set<bcz> c = Sets.newHashSet();
   private final bdc d;

   public bda(bdc $$0) {
      this.d = $$0;
   }

   private void a(bcz $$0) {
      if ($$0.a().b()) {
         this.c.add($$0);
      }

   }

   public Set<bcz> a() {
      return this.c;
   }

   public Collection<bcz> b() {
      return (Collection<bcz>)this.b.values().stream().filter($$0 -> $$0.a().b()).collect(Collectors.toList());
   }

   @Nullable
   public bcz a(bcy $$0) {
      return (bcz)this.b.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(bcy $$0) {
      return this.b.get($$0) != null || this.d.c($$0);
   }

   public boolean a(bcy $$0, UUID $$1) {
      bcz $$2 = (bcz)this.b.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(bcy $$0) {
      bcz $$1 = (bcz)this.b.get($$0);
      return $$1 != null ? $$1.f() : this.d.a($$0);
   }

   public double d(bcy $$0) {
      bcz $$1 = (bcz)this.b.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(bcy $$0, UUID $$1) {
      bcz $$2 = (bcz)this.b.get($$0);
      return $$2 != null ? $$2.a($$1).d() : this.d.a($$0, $$1);
   }

   public void a(Multimap<bcy, bdb> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         bcz $$2 = (bcz)this.b.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$2::d);
         }

      });
   }

   public void b(Multimap<bcy, bdb> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         bcz $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.d($$1);
            $$2.b($$1);
         }

      });
   }

   public void a(bda $$0) {
      $$0.b.values().forEach($$0x -> {
         bcz $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }

      });
   }

   public pp c() {
      pp $$0 = new pp();

      for(bcz $$1 : this.b.values()) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void a(pp $$0) {
      for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
         pj $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         ad.a(hm.ak.b(abb.a($$3)), $$1x -> {
            bcz $$2x = this.a($$1x);
            if ($$2x != null) {
               $$2x.a($$2);
            }

         }, () -> a.warn("Ignoring unknown attribute '{}'", $$3));
      }

   }
}
